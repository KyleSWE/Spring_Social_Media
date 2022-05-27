package com.cooksys.SocialMediaSprint.entities;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@NoArgsConstructor
@Data
@Entity
public class Hashtag {

	@Id
	@GeneratedValue
	private Long id;

	@Column(unique = true)
	private String label;

	@CreationTimestamp
	private Timestamp firstUsed;

	@UpdateTimestamp
	private Timestamp lastUsed;

	@ManyToMany(mappedBy = "hashtags")
	private List<Tweet> tweets;
}