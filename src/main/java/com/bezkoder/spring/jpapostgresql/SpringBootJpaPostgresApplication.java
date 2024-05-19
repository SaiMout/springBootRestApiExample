package com.bezkoder.spring.jpapostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class SpringBootJpaPostgresApplication {

	public static void main(String[] args) {
		   System.setProperty("server.port", "8081");
	        System.setProperty("http.maxConnections", "10");
		SpringApplication.run(SpringBootJpaPostgresApplication.class, args);
	}

}
