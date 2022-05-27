package com.cooksys.SocialMediaSprint.repositories;

import com.cooksys.SocialMediaSprint.entities.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface HashtagRepository extends JpaRepository<Hashtag, Long>{

}
