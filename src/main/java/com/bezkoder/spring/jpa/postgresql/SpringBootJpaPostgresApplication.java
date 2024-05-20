package com.bezkoder.spring.jpa.postgresql;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
import com.bezkoder.spring.jpa.postgresql.repository.TutorialRepository;

//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@SpringBootApplication
public class SpringBootJpaPostgresApplication {
	
	public static void main(String[] args) {
//		   System.setProperty("server.port", "8081");
//	        System.setProperty("http.maxConnections", "10");
		SpringApplication.run(SpringBootJpaPostgresApplication.class, args); 
		
	}
 
	 


}
