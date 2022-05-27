package com.cooksys.SocialMediaSprint.controllers;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserRequestDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	@GetMapping
	public List<UserResponseDto> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PostMapping
	public UserResponseDto createUser(@RequestBody UserRequestDto userRequestDto) {
		return userService.createUser(userRequestDto);
	}
	
	@GetMapping("/{username}")
	public UserResponseDto getUser(@PathVariable String username) {
		return userService.getUser(username);
	}
	
	@GetMapping("/{username}/following")
	public List<UserResponseDto> getFollowersByUsername(@PathVariable String username) {
		return userService.getFollowersByUsername(username);
	}
	
	@GetMapping("/{username}/mentions")
	public List<TweetResponseDto> getMentionsByUsername(@PathVariable String username) {
		return userService.getMentionsByUsername(username);
	}
	
	@GetMapping("/{username}/tweets")
	public List<TweetResponseDto> getTweetsByUsername(@PathVariable String username) {
		return userService.getTweetsByUsername(username);
	}
	
	@GetMapping("/{username}/feed")
	public List<TweetResponseDto> getFeedByUsername(@PathVariable String username) {
		return userService.getFeedByUsername(username);
	}
	
	
}
