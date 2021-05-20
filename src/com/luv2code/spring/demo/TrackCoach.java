package com.luv2code.spring.demo;

public class TrackCoach implements Coach {
	
	

	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do it.. "+fortuneService.getFortune();
	}
	
	//add an init method. will be executed during bean lifecycle
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: Inside my doMyStartupStuff");
	}

	// add a destroy method.
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: Inside my doMyCleanupStuff");
	}
}
