package com.cooksys.SocialMediaSprint.controllers;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.services.HashtagService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hashtag")
public class HastagController {

	private final HashtagService hashtagService;

	@GetMapping
	public List<HashtagDto> getAllHashtags() {
		return hashtagService.getAllHashtags();
	}
	
//	@GetMapping("/{label}")
//	public List<TweetResponseDto> getTweetsByHashtagLabel(@PathVariable String label) {
//		return hashtagService.getTweetsByHashtagLabel(label);
//	}

}
