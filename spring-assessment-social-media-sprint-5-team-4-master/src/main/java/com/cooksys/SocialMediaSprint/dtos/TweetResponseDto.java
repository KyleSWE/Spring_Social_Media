package com.cooksys.SocialMediaSprint.dtos;

import java.sql.Timestamp;

import javax.persistence.Column;

import com.cooksys.SocialMediaSprint.entities.Tweet;
import com.cooksys.SocialMediaSprint.entities.User;
import lombok.*;

@NoArgsConstructor
@Data
public class TweetResponseDto {

	private Long id;

	private UserResponseDto author;

	private Timestamp posted;

	private String content;

	private TweetResponseDto inReplyTo;

	private TweetResponseDto repostOf;
}
