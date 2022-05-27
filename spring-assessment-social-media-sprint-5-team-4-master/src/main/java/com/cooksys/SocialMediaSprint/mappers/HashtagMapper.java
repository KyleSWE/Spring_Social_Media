package com.cooksys.SocialMediaSprint.mappers;

import java.util.List;

import com.cooksys.SocialMediaSprint.entities.Hashtag;
import org.mapstruct.Mapper;

import com.cooksys.SocialMediaSprint.dtos.HashtagDto;

@Mapper(componentModel = "spring")
public interface HashtagMapper {
	HashtagDto entityToDto(Hashtag entity);

	List<HashtagDto> entitiesToDtos(List<Hashtag> entities);
}
