/**
 * 
 */
package com.example.springvaadin;

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
@SpringUI
@Theme("valo")
public class VaadinUI extends UI{
    
    @Autowired
    private VaadinService vaadinService;

    /* (non-Javadoc)
     * @see com.vaadin.ui.UI#init(com.vaadin.server.VaadinRequest)
     */
    @Override
    protected void init(VaadinRequest request) {
	// TODO Auto-generated method stub
	TextField nameFeild=new TextField("Enter your Name :");
	Button submitButton=new Button("Click me!");
	
	
	VerticalLayout layout=new VerticalLayout();
	layout.addComponents(nameFeild,submitButton);
	layout.setMargin(true);
	layout.setSpacing(true);
	setContent(layout);
	
	submitButton.addClickListener(listener->{
	    Notification.show(vaadinService.sayHello(nameFeild.getValue()));
	});
	
    }
    

}
