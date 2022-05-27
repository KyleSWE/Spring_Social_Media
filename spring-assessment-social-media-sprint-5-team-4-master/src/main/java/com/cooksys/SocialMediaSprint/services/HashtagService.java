package com.cooksys.SocialMediaSprint.services;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;

public interface HashtagService {

	public List<HashtagDto> getAllHashtags();

//	public List<TweetResponseDto> getTweetsByHashtagLabel(String label);

}
