package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.Gamer;


public class GamePicker implements Gamer {
	
	@Autowired
	@Qualifier("myCoach")
	Coach myCoach;

	@Override
	public String getBestGame() {
		// TODO Auto-generated method stub
		return "my Coach says "+myCoach.getDailyWorkout()+ "But the best game is BF5";
	}

}
