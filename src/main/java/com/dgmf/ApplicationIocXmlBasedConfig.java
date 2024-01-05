package com.dgmf;

import com.dgmf.fundamentals.springiocxml.interfaces.Hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationIocXmlBasedConfig {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDependencyInjection.class, args);

		// Instantiation of Spring IoC based on XML Configuration
		ClassPathXmlApplicationContext contex =
				new ClassPathXmlApplicationContext("beans.xml");

		// Retrieving a Bean from Spring Context
		Hotel marriot = contex.getBean("marriot", Hotel.class);
		Hotel hilton = contex.getBean("hilton", Hotel.class);

		// Outputs
		System.out.println("Hotel name is : " + marriot.getHotelName());
		System.out.println("Hotel name is : " + hilton.getHotelName());

		// Remember to close Spring Context
		contex.close();
	}

}
