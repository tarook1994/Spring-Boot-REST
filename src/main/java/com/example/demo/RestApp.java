package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.Coach;

@RestController
public class RestApp {
	
	@GetMapping("/")
	public String getStartPage() {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout());
		return "Hello World!! Time now is : " + LocalTime.now() + myCoach.getDailyWorkout();
	}
	
	@GetMapping("/human")
	public Human getHuman() {
		return new Human("ahmed","45nasr street",44);
	}
}
