package com.cooksys.SocialMediaSprint.exceptions;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
public class NotAuthorizedException extends RuntimeException{/**
	 * 
	 */
	private static final long serialVersionUID = 1833161882484909800L;
	
	private String message;

}
