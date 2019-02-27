package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Review {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String imageUrl;
	private String reviewCategory;
	@Lob
	private String review;
	
	public Review() {
		//don't use; JPA hook
	}
	
	public Review(Long id, String title, String reviewCategory) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.review = review;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getReview() {
		return review;
	}
}
	
