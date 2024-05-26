package com.bezkoder.spring.jpa.postgresql.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class ClientService {

//    private final RestTemplate restTemplate;
    private final String baseUrl;

//    public ClientService(RestTemplate restTemplate, @Value("${api.base.url}") String baseUrl) {
//        this.restTemplate = restTemplate;
//        this.baseUrl = baseUrl;
//    }

//    public Tutorial getTutorialById(Long id) {
//        return restTemplate.getForObject(baseUrl + "/tutorials/" + id, Tutorial.class);
//    }
   
     
//    public Tutorial[] getAllTutorials (){
//    	ResponseEntity<Tutorial[]> response =
//    			  restTemplate.getForEntity(
//    					  baseUrl + "/tutorials/",
//    					  Tutorial[].class);
//    	Tutorial[] tutorial = response.getBody();
//		return tutorial;
//    }
//    
   
//   @Autowired
//    private final RestClient restClient;
//    
    public ClientService (@Value("${api.base.url}") String url ) {
        
        this.baseUrl = url;
    }
    public String getTutorialById(Long id) {
    	RestClient restClient = RestClient.create();

    	String result = restClient.get()
    	  .uri(baseUrl)
    	  .retrieve()
    	  .body(String.class);
    	System.out.println(result);
		return result; 
    }
    
    
    //If you're interested in the response status code and headers, and not just the contents, 
   // you can use toEntity to get a ResponseEntity:
//    public String getTutorialById(Long id) {
//    ResponseEntity<String> result = restClient.get().uri(baseUrl).retrieve().toEntity(String.class);
//
//    		System.out.println("Response status: " + result.getStatusCode());
//    		System.out.println("Response headers: " + result.getHeaders());
//    		System.out.println("Contents: " + result.getBody());
//    		return result; 
//    }
    		
}
