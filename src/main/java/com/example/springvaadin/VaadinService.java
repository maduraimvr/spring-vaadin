/**
 * 
 */
package com.example.springvaadin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Venkatraman
 *
 */
@Component
public class VaadinService {
    
    private static final Logger log = LoggerFactory.getLogger(VaadinService.class);
    
    @Autowired
    CustomerRepository customerRepository;
    
    public void saveCustomer(Customer customer) {
	log.info("saveCustomer method starts");
	customerRepository.save(customer);
	log.info("saveCustomer method ends");
    }
    /**
     * 
     * @param nameFeild
     * @return
     */
    public String sayHello(String nameFeild) {
	log.info("sayHello method starts");
	log.info("sayHello method ends");
	return "Hello "+nameFeild;
    }

}
