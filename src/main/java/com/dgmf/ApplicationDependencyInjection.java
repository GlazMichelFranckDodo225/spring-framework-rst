package com.dgmf;

import com.dgmf.fundamentals.springiocxml.interfaces.Hotel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ApplicationDependencyInjection {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationDependencyInjection.class, args);

	}

}
