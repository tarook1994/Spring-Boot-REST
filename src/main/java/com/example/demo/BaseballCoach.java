package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	FortuneService fortuneService;
	
	@Autowired
	@Qualifier("sadFortuneService")
	FortuneService sadFortuneService;

	

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Workout";
	}
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortuneService();
	}

	@Override
	public String getSadFortune() {
		// TODO Auto-generated method stub
		return sadFortuneService.getFortuneService();
	}

}
