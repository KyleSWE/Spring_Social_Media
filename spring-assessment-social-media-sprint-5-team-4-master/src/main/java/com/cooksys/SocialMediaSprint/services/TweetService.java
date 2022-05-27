package com.cooksys.SocialMediaSprint.services;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.entities.User;

public interface TweetService {
	
	public List<TweetResponseDto> getAllTweets();

	public TweetResponseDto getTweetById(Long id);

	public List<UserResponseDto> getTweetLikesById(Long id);

	public List<TweetResponseDto> getTweetRepliesById(Long id);
  
	public List<UserResponseDto> getTweetMentionsById(Long id);

	public List<HashtagDto> getTweetHashtagsById(Long id);
  
	public List<TweetResponseDto> getTweetRepostsById(Long id);
}
