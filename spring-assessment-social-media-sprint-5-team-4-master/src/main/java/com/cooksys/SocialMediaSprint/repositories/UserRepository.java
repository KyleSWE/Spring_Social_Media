package com.cooksys.SocialMediaSprint.repositories;

import com.cooksys.SocialMediaSprint.entities.Credentials;
import com.cooksys.SocialMediaSprint.entities.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByCredentials(Credentials credentials);

}
