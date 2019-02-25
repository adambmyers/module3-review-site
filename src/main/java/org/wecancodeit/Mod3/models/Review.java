package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Review {

	@Id
	@GeneratedValue
	//@genvalue used to autocreate a unique value for the id
	private Long id;
	private String title;
	//imageUrl used to pull a picture for the park under review
	private String imageUrl;
	private String reviewCategory;
	@Lob
	// @Lob is used to allow for more than 255 chars per String
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
	
