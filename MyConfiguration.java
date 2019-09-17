package com.nikhil.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class MyConfiguration {
	
	@Profile("Prod")
	@Bean
	public void myProd() {
		System.out.println("Prod");
	}
	
	@Profile("UAT")
	@Bean
	public void myUat() {
		System.out.println("UAT");
	}
	
	

}
