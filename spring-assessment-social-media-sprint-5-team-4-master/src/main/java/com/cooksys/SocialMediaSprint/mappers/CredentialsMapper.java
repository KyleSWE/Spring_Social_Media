package com.cooksys.SocialMediaSprint.mappers;

import org.mapstruct.Mapper;

import com.cooksys.SocialMediaSprint.dtos.CredentialsDto;
import com.cooksys.SocialMediaSprint.entities.Credentials;

@Mapper(componentModel = "spring")
public interface CredentialsMapper {
	CredentialsDto entityToDto(Credentials entity);
}
