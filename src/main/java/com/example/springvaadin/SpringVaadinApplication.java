package com.example.springvaadin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringVaadinApplication.class);
    
	public static void main(String[] args) {
	    log.info("main method starts");
		SpringApplication.run(SpringVaadinApplication.class, args);
		 log.info("main method ends");
	}
}
