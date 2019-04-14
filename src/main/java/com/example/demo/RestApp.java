package com.example.demo;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApp {
	
	@GetMapping("/")
	public String getStartPage() {
		return "Hello World!! Time now is : " + LocalTime.now();
	}
	
	@GetMapping("/human")
	public Human getHuman() {
		return new Human("ahmed","45nasr street",44);
	}
}
