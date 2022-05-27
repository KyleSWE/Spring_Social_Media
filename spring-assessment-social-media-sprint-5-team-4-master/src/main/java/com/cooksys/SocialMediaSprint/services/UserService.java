package com.cooksys.SocialMediaSprint.services;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserRequestDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;

public interface UserService {
	
	public List<UserResponseDto> getAllUsers();

	public UserResponseDto createUser(UserRequestDto userRequestDto);
	
	public UserResponseDto getUser(String username);

	public List<UserResponseDto> getFollowersByUsername(String username);
	
	public List<TweetResponseDto> getMentionsByUsername(String username);

	public List<TweetResponseDto> getTweetsByUsername(String username);

	public List<TweetResponseDto> getFeedByUsername(String username);
	
	
}
