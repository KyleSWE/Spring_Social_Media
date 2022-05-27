package com.cooksys.SocialMediaSprint.controllers;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.entities.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import com.cooksys.SocialMediaSprint.services.TweetService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tweet")
public class TweetController {
	
	private final TweetService tweetService;
	
	@GetMapping
	public List<TweetResponseDto> getAllTweets(){
		return tweetService.getAllTweets();
	}
	
	@GetMapping("/{id}")
	public TweetResponseDto getTweetById(@PathVariable Long id) {
		return tweetService.getTweetById(id);
	}
	
	@GetMapping("/{id}/likes")
	public List<UserResponseDto> getTweetLikesById(@PathVariable Long id) {
		return tweetService.getTweetLikesById(id);
	}
	
	@GetMapping("/{id}/replies")
	public List<TweetResponseDto> getTweetRepliesById(@PathVariable Long id) {
		return tweetService.getTweetRepliesById(id);
	}
	
	@GetMapping("/{id}/mentions")
	public List<UserResponseDto> getTweetMentionsById(@PathVariable Long id) {
		return tweetService.getTweetMentionsById(id);
	}
	
	@GetMapping("/{id}/hashtags")
	public List<HashtagDto> getTweetHashtagsById(@PathVariable Long id) {
		return tweetService.getTweetHashtagsById(id);
	}
    
	@GetMapping("/{id}/reposts")
	public List<TweetResponseDto> getTweetRepostsById(@PathVariable Long id) {
		return tweetService.getTweetRepostsById(id);
	}
	
}
