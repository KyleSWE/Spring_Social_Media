package com.cooksys.SocialMediaSprint.dtos;

import com.cooksys.SocialMediaSprint.entities.Tweet;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor

public class ContextDto {

	private TweetResponseDto target;

	private List<TweetResponseDto> before;

	private List<TweetResponseDto> after;

}
