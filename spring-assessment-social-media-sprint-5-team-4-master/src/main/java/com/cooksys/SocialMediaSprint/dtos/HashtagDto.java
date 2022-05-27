package com.cooksys.SocialMediaSprint.dtos;

import java.sql.Timestamp;
import java.util.List;

import lombok.*;

@NoArgsConstructor
@Data
public class HashtagDto {
	
	private String label;
	private Timestamp firstUsed;
	private Timestamp lastUsed;
	private List<TweetResponseDto> tweets;
}
