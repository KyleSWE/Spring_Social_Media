package com.cooksys.SocialMediaSprint.dtos;


import com.cooksys.SocialMediaSprint.entities.Credentials;
import com.cooksys.SocialMediaSprint.entities.Profile;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data

public class UserRequestDto {
	
	private CredentialsDto credentials;
	private ProfileDto profile;

}
