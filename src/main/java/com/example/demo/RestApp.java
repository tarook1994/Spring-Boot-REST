package com.example.demo;

import java.time.LocalTime;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaces.Coach;

@RestController
public class RestApp {
	
	@PostMapping("/")
	public String postRequest(@RequestParam("test") String name) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout() 
			+ myCoach.getDailyFortune() + myCoach.getSadFortune());
		
		Coach footballCoach = context.getBean("footballCoach",Coach.class);
		System.out.println(footballCoach.getDailyWorkout());
		
		return "Hello World!! Time now is : " + LocalTime.now() + myCoach.getDailyWorkout() + name;
	}
	
	
	@GetMapping("/")
	public String getStartPage(@RequestParam("test") String name) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		Coach myCoach = context.getBean("myCoach",Coach.class);
		System.out.println(myCoach.getDailyWorkout()
				+ myCoach.getDailyFortune() + myCoach.getSadFortune());

		Coach footballCoach = context.getBean("footballCoach",Coach.class);
		System.out.println(footballCoach.getDailyWorkout());
		
		return "Hello World!! Time now is : " + LocalTime.now() + myCoach.getDailyWorkout() + name;
	}
	
	@GetMapping("/human")
	public Human getHuman() {
		return new Human("ahmed","45nasr street",44);
	}
}
