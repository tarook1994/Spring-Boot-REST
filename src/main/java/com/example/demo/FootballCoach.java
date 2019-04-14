package com.example.demo;

import org.springframework.stereotype.Component;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.FortuneService;

@Component("football")
public class FootballCoach implements Coach, FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Let's Play Football";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSadFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
