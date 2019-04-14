package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.interfaces.Coach;

@SpringBootApplication
public class DemoApplication {
	


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
//		String url = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
//		String username = "hbstudent";
//		String password = "hbstudent";
//		try {
//			System.out.println("Connecting!... ");
//			Connection conn = DriverManager.getConnection(url,username,password);
//			System.out.println("Connection Established! ");
//			
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}
