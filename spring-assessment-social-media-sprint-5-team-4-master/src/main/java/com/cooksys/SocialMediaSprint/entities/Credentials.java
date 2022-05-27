package com.cooksys.SocialMediaSprint.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@NoArgsConstructor
@Data
public class Credentials {

	@Column(unique = true, nullable = false)
	private String username;

	@Column(nullable = false)
	private String password;
}
