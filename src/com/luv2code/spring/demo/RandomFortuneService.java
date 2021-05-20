package com.luv2code.spring.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	
	private String [] fortuneList = new String[] {"Be careful today,you will get a hit","you will be tested today in your skills","Today its your lucky day"};

	@Override
	public String getFortune() {
		Random r = new Random();
		int randomNumber = r.nextInt(fortuneList.length);
		return fortuneList[randomNumber];
	}

}
