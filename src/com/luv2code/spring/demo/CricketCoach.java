package com.luv2code.spring.demo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//members for for email and team
	
	private String emailAddress;
	private String team;
	
	

	public CricketCoach() {
		System.out.println("cricketCoach: inside no arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricketCoach: inside setter method");
		this.fortuneService = fortuneService;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("cricketCoach: inside setter method for setEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricketCoach: inside setter method for setTeam");
		this.team = team;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice cricket bowling for 15 mins";
	}
	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	

}
