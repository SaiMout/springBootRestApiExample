package com.bezkoder.spring.jpa.postgresql.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.jpa.postgresql.model.Tutorial;
//@RequestMapping
//@RestController
public class ClientController {

	private final ClientService clientService;

	// @Autowired
	public ClientController(ClientService clientService) {
		this.clientService = clientService;
	}

	@GetMapping("/tutorials/{id}")
	public String getUserById(@PathVariable Long id) {
		return clientService.getTutorialById(id);
	}
	
//	 @GetMapping("/tutorials")
//	    public Tutorial[] getAllTutorials() {
//	        return clientService.getAllTutorials();
//	    }
	 
}