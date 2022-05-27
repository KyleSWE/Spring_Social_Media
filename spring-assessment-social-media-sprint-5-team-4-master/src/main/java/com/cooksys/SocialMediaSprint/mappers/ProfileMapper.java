package com.cooksys.SocialMediaSprint.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.cooksys.SocialMediaSprint.dtos.ProfileDto;
import com.cooksys.SocialMediaSprint.entities.Profile;

@Mapper(componentModel = "spring")
public interface ProfileMapper {

	ProfileDto entityToDto(Profile entity);

	List<ProfileDto> entitiesToDtos(List<Profile> entities);
}
