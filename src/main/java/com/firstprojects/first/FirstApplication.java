package com.firstprojects.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ApplicationContext factory=new AnnotationConfigApplicationContext(AppConfiguration.class);
		Samsung S7=factory.getBean(Samsung.class);
		S7.config();
	}

}
