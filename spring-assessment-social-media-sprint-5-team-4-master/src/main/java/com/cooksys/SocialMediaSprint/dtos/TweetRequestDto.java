package com.cooksys.SocialMediaSprint.dtos;


import com.cooksys.SocialMediaSprint.entities.Credentials;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class TweetRequestDto {
	private String content;
	private CredentialsDto credentialsDto;

}
