package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//reterive the object from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach aphaCoach = context.getBean("myCoach",Coach.class);
		
		boolean checkSame = (theCoach == aphaCoach);
		
		System.out.println("\npointing to the same object: "+checkSame);
		
		System.out.println("\nMemory location for theCoach: "+theCoach);
		
		System.out.println("\nMemory location for aphaCoach: "+aphaCoach+"\n");
		
		context.close();
	}

}
