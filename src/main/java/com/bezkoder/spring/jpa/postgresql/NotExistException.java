package com.bezkoder.spring.jpa.postgresql;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NO_CONTENT)
public class NotExistException extends Exception{
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotExistException() {
		super("The record with the id not found.");
	}

}
