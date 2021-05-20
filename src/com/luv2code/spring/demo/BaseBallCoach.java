package com.luv2code.spring.demo;

public class BaseBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public BaseBallCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "Do 30 mins of batting practice.";
	}
	
	 
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
