package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//reterive the object from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach.getDailyFortune());
		
		//close the context
		context.close();
	}

}
