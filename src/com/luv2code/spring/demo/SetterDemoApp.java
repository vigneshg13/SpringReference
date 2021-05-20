package com.luv2code.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// Load the Spring Configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//reterieve the bean from sprong container
		CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call the method
		System.out.println(cricketCoach.getDailyWorkOut());
		
		System.out.println(cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getEmailAddress());
		
		System.out.println(cricketCoach.getTeam());
		
		//close the context
		context.close();

	}

}
