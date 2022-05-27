package com.cooksys.SocialMediaSprint.entities;

import java.sql.Timestamp;
import java.util.*;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@NoArgsConstructor
@Data
@Entity
public class Tweet {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private boolean deleted = false;

	@ManyToOne
	private User author;

	@CreationTimestamp
	private Timestamp posted;

	@Column
	private String content;

	@ManyToMany
	private List<User> mentionedUsers;

	@ManyToMany(mappedBy = "likedTweets")
	private List<User> likes;

	@ManyToOne
	private Tweet inReplyTo;

	@OneToMany(mappedBy = "inReplyTo")
	private List<Tweet> replies;

	@ManyToOne
	private Tweet repostOf;

	@OneToMany(mappedBy = "repostOf")
	private List<Tweet> reposts;

	@ManyToMany
	private List<Hashtag> hashtags;

}
