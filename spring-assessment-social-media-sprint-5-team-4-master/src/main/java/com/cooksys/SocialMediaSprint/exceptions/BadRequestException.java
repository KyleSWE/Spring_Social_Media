package com.cooksys.SocialMediaSprint.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BadRequestException extends RuntimeException{/**
	 * 
	 */
	private static final long serialVersionUID = -4683589242203615733L;
	
	private String message;

}
