package com.cooksys.SocialMediaSprint.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserRequestDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.entities.Tweet;
import com.cooksys.SocialMediaSprint.entities.User;
import com.cooksys.SocialMediaSprint.exceptions.NotFoundException;
import com.cooksys.SocialMediaSprint.mappers.TweetMapper;
import com.cooksys.SocialMediaSprint.mappers.UserMapper;
import com.cooksys.SocialMediaSprint.repositories.UserRepository;
import com.cooksys.SocialMediaSprint.services.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	private final UserMapper userMapper;
	private final TweetMapper tweetMapper;

	@Override
	@GetMapping
	public List<UserResponseDto> getAllUsers() {
		return userMapper.entitiesToDtos(userRepository.findAll());
	}

	@Override
	public UserResponseDto createUser(UserRequestDto userRequestDto) {
		User userToCreate = userMapper.requestDtoToEntity(userRequestDto);
		
		User createdUser = userRepository.saveAndFlush(userToCreate);
		return userMapper.entityToDto(createdUser);
	}
	
	@Override
	public UserResponseDto getUser(String username) {
		
		List<User> users = userRepository.findAll();
		
		for(User user : users) {
			if(user.getCredentials().getUsername().equals(username)) {
				User usertoSend = user;
				return  userMapper.entityToDto(usertoSend);
			}
					
		}
		throw new NotFoundException("No user found with username: " + username + " found.") ;	
		
		
	}

	@Override
	public List<UserResponseDto> getFollowersByUsername(String username) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getCredentials().getUsername().equals(username)) {
				User usertoSend = user;
				return userMapper.entitiesToDtos(usertoSend.getFollowing());
			}
					
		}
		
		throw new NotFoundException("No user found with username: " + username + " found.");
	}

	@Override
	public List<TweetResponseDto> getMentionsByUsername(String username) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getCredentials().getUsername().equals(username)) {
				User foundUser = user;
				List<Tweet> userTweet = user.getTweets();
			}
		}
		
		throw new NotFoundException("No user found with username: " + username + " found.");
	}

	@Override
	public List<TweetResponseDto> getTweetsByUsername(String username) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getCredentials().getUsername().equals(username)) {
				return tweetMapper.entitiesToDtos(user.getTweets());
			}
		}
		throw new NotFoundException("No user found with username: " + username + " found.");
	}

	@Override
	public List<TweetResponseDto> getFeedByUsername(String username) {
		List<User> users = userRepository.findAll();
		for(User user : users) {
			if(user.getCredentials().getUsername().equals(username)) {
				return tweetMapper.entitiesToDtos(user.getTweets());
			}
		}
		throw new NotFoundException("No user found with username: " + username + " found.");
	}
	
}
