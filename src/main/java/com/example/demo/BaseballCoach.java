package com.example.demo;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.FortuneService;

public class BaseballCoach implements Coach {
	
	FortuneService fortuneService,sadFortuneService;

	
	public BaseballCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
		
	}
	
	public void setSadFortuneService(FortuneService sadFortuneService) {
		this.sadFortuneService  = sadFortuneService;
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

	@Override
	public String getSadFortune() {
		// TODO Auto-generated method stub
		return sadFortuneService.getFortuneService();
	}

}
