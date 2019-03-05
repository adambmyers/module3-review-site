package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	@Lob
	private String commentContent;
	
	public Comment() {
		
	}
	
	@ManyToOne
	private Review review;
	
	public Comment(String commentContent, Review review) {
		this.commentContent = commentContent;
		this.review = review;
	}


	public Long getId() {
		return id;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public Review getReview() {
		return review;
	}
	
	@Override
	public String toString() {
		return "Comments [id=" + id + ", commentContent=" + commentContent + "]";
	}
	
}
