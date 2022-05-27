package com.cooksys.SocialMediaSprint.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cooksys.SocialMediaSprint.dtos.UserRequestDto;
import com.cooksys.SocialMediaSprint.dtos.UserResponseDto;
import com.cooksys.SocialMediaSprint.entities.User;




@Mapper(componentModel = "spring", uses= {ProfileMapper.class, CredentialsMapper.class})
public interface UserMapper {
	@Mapping(target="username", source="credentials.username")
	@Mapping(target="profile", source="profile")
	UserResponseDto entityToDto(User entity);
	
	List<UserResponseDto> entitiesToDtos(List<User> entities);
	
	
	User requestDtoToEntity(UserRequestDto userRequestDto);


}
