package com.cooksys.SocialMediaSprint.services.impl;

import java.util.List;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;
import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.entities.Tweet;
import com.cooksys.SocialMediaSprint.entities.User;
import com.cooksys.SocialMediaSprint.mappers.HashtagMapper;
import com.cooksys.SocialMediaSprint.mappers.TweetMapper;
import com.cooksys.SocialMediaSprint.mappers.UserMapper;
import com.cooksys.SocialMediaSprint.repositories.TweetRepository;
import com.cooksys.SocialMediaSprint.services.TweetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TweetServiceImpl implements TweetService {
	
	private final TweetRepository tweetRepository;
	private final TweetMapper tweetMapper;
	private final UserMapper userMapper;
	private final HashtagMapper hashtagMapper;
	
	@Override
	public List<TweetResponseDto> getAllTweets() {
		// TODO Auto-generated method stub
		return tweetMapper.entitiesToDtos(tweetRepository.findAll());
	}
	@Override
	public TweetResponseDto getTweetById(Long id) {
		// TODO Auto-generated method stub
		return tweetMapper.entityToDto(tweetRepository.getById(id));
		
	}
	
	@Override
	public List<UserResponseDto> getTweetLikesById(Long id) {
		Tweet tweetResponse = tweetRepository.getById(id);
		List<UserResponseDto> mappedTweet = userMapper.entitiesToDtos(tweetResponse.getLikes());
		return mappedTweet;
		
	}
	@Override
	public List<TweetResponseDto> getTweetRepliesById(Long id) {
		Tweet tweetResponse = tweetRepository.getById(id);
		List<TweetResponseDto> mappedTweet = tweetMapper.entitiesToDtos(tweetResponse.getReplies());
		return mappedTweet;
	}
	@Override
	public List<UserResponseDto> getTweetMentionsById(Long id) {
		Tweet tweetResponse = tweetRepository.getById(id);
		List<UserResponseDto> mappedTweet = userMapper.entitiesToDtos(tweetResponse.getMentionedUsers());
		return mappedTweet;
	}
	@Override
	public List<HashtagDto> getTweetHashtagsById(Long id) {
		Tweet tweetResponse = tweetRepository.getById(id);
		List<HashtagDto> mappedTweet = hashtagMapper.entitiesToDtos(tweetResponse.getHashtags());
		return mappedTweet;
  }
  @Override  
	public List<TweetResponseDto> getTweetRepostsById(Long id) {
		Tweet tweetResponse = tweetRepository.getById(id);
		List<TweetResponseDto> mappedTweet = tweetMapper.entitiesToDtos(tweetResponse.getReposts());
		return mappedTweet;
	}
	

}
