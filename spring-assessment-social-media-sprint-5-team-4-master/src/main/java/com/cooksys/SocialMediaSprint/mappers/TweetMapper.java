package com.cooksys.SocialMediaSprint.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.SocialMediaSprint.dtos.TweetResponseDto;
import com.cooksys.SocialMediaSprint.entities.Tweet;



@Mapper(componentModel = "spring", uses = UserMapper.class)
public interface TweetMapper {
	TweetResponseDto entityToDto(Tweet entity);
	
	List<TweetResponseDto> entitiesToDtos(List<Tweet> entities);
}
