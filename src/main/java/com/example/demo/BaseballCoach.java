package com.example.demo;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	FortuneService fortuneService;

	
	public BaseballCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
		
	}
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

}
