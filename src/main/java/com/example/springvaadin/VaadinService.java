/**
 * 
 */
package com.example.springvaadin;

import org.springframework.stereotype.Component;

/**
 * @author Venkatraman
 *
 */
@Component
public class VaadinService {
    /**
     * 
     * @param nameFeild
     * @return
     */
    public String sayHello(String nameFeild) {
	return "Hello "+nameFeild;
    }

}
