/**
 * 
 */
package com.example.springvaadin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * @author Venkatraman
 *
 */
@Theme("valo")
@SpringUI(path="/spring-vaadin/index")
public class VaadinUI extends UI{
    
    @Autowired
    private VaadinService vaadinService;
    
    private static final Logger log = LoggerFactory.getLogger(VaadinUI.class);


    /* (non-Javadoc)
     * @see com.vaadin.ui.UI#init(com.vaadin.server.VaadinRequest)
     */
    @Override
    protected void init(VaadinRequest request) {
	// TODO Auto-generated method stub
	TextField customerId=new TextField("Enter Id :");
	TextField firstNameFeild=new TextField("Enter your First Name :");
	TextField lastNameFeild=new TextField("Enter your last Name :");
	Button submitButton=new Button("Save");
	
	
	VerticalLayout layout=new VerticalLayout();
	layout.addComponents(customerId,firstNameFeild,lastNameFeild,submitButton);
	layout.setMargin(true);
	layout.setSpacing(true);
	setContent(layout);
	
	submitButton.addClickListener(listener->{
	    log.info("addClickListener method starts");
	    Customer customer=new Customer(firstNameFeild.getValue(),lastNameFeild.getValue());
	    vaadinService.saveCustomer(customer);
	    Notification.show(vaadinService.sayHello(firstNameFeild.getValue()));
	    log.info("addClickListener method ends");
	});
	
    }
    

}
