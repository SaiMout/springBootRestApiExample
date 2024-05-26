package com.bezkoder.spring.jpa.postgresql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.client.RestClient;
//@Configuration
//@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
//@CrossOrigin("http://localhost:4200")
@SpringBootApplication
public class SpringBootJpaPostgresApplication {

	public static void main(String[] args) {
//		   System.setProperty("server.port", "8081");
//	        System.setProperty("http.maxConnections", "10");
		SpringApplication.run(SpringBootJpaPostgresApplication.class, args);

	}


//
//    @Bean
//    RestTemplate restTemplate() {
//        return new RestTemplate();
//    }
    
//    @Bean
//    RestClient restClient(@Value("${api.base.url}") String baseUrl) {
//    	 
//        return RestClient.builder()
//        		.baseUrl(baseUrl ) // Replace with the actual base URL of your RESTful service
//                .build();
//    }
    

}
