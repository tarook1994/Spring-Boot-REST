package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.interfaces.Coach;
import com.example.demo.interfaces.FortuneService;
import com.example.demo.interfaces.Gamer;

@Configuration
@ComponentScan("com.example.demo")
public class Config {
	
	@Bean
	public Coach footballCoach() {
		Coach footballCoach = new FootballCoach();
		return footballCoach;
	}
	@Bean
	public Coach myCoach() {
		Coach myCoach = new BaseballCoach();
		return myCoach;
	}
	
	@Bean
	public Gamer gamePicker() {
		Gamer gamePicker = new GamePicker();
		return gamePicker;
	}
	
	@Bean
	public FortuneService happyFortuneService() {
		FortuneService happy = new HappyFortuneService();
		return happy;
	}
	
	@Bean
	public FortuneService sadFortuneService() {
		FortuneService sad = new SadFortuneService();
		return sad;
	}


}
