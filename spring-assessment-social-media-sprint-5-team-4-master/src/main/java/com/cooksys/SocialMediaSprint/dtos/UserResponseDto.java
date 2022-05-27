package com.cooksys.SocialMediaSprint.dtos;

import java.sql.Timestamp;

import lombok.*;

@NoArgsConstructor
@Data

public class UserResponseDto {
	
	private String username;
	private ProfileDto profile;
	private Timestamp joined;

}
