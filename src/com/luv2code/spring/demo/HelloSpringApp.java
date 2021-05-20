package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	
	

	public static void main(String[] args) {
		// load the spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//reterive Beans from Spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		//call the methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		//lets call the fortune service
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();
		

	}

}
