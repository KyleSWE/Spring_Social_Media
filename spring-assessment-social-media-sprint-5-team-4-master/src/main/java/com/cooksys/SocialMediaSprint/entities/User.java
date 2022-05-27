package com.cooksys.SocialMediaSprint.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@Data
@Entity
@Table(name = "user_table")
public class User {

	@Id
	@GeneratedValue
	private Long id;

	@CreationTimestamp
	private Timestamp joined;

	@Embedded
	private Credentials credentials;

	@Embedded
	private Profile profile;

	@Column(nullable = false)
	private boolean deleted;

	@OneToMany(mappedBy = "author")
	private List<Tweet> tweets;

	@ManyToMany
	private List<Tweet> likedTweets;

	@ManyToMany
	private List<User> followers;

	@ManyToMany(mappedBy = "followers")
	private List<User> following;

	@ManyToMany(mappedBy = "mentionedUsers")
	private List<Tweet> mentions;

}
