package com.cooksys.SocialMediaSprint.repositories;
import com.cooksys.SocialMediaSprint.entities.Tweet;
import org.springframework.stereotype.*;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository

public interface TweetRepository extends JpaRepository<Tweet, Long>{
	
	

}
