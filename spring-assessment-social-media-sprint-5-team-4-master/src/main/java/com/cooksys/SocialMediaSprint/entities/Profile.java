package com.cooksys.SocialMediaSprint.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@NoArgsConstructor
@Data
public class Profile {
	
	private String firstName;

	private String lastName;

	@Column(nullable = false)
	private String email;

	private String phone;

}
