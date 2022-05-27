package com.cooksys.SocialMediaSprint.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.entities.Hashtag;
import com.cooksys.SocialMediaSprint.entities.Tweet;
import com.cooksys.SocialMediaSprint.mappers.HashtagMapper;
import com.cooksys.SocialMediaSprint.repositories.HashtagRepository;
import com.cooksys.SocialMediaSprint.repositories.TweetRepository;
import com.cooksys.SocialMediaSprint.services.HashtagService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HashtagServiceImpl implements HashtagService {
	
	private final HashtagRepository hashtagRepository;
	private final HashtagMapper hashtagMapper;
	private final TweetRepository tweetRepository;
	@Override
	public List<HashtagDto> getAllHashtags() {
		// TODO Auto-generated method stub
		return hashtagMapper.entitiesToDtos(hashtagRepository.findAll());
	}
//	@Override
//	public List<TweetResponseDto> getTweetsByHashtagLabel(String label) {
//		List<Hashtag> hashtagList = hashtagRepository.findAll();
//		
//		Long hashtagId = 0L;
//		for (Hashtag hashtag: hashtagList) {
//			if (hashtag.getLabel() == label) {
//				hashtagId = hashtag.getId();
//			}
//		}
//		
//		
//		
//	}


}
