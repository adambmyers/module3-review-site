package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {

	@Id
	@GeneratedValue
	//@genvalue used to autocreate a unique value for the id
	private Long id;
	private String title;
	//imageUrl used to pull a picture for the park under review
	private String imageUrl;
	private Category categoryName;
	private Park parkName;

	@Lob
	// @Lob is used to allow for more than 255 chars per String
	private String review;
	
	@ManyToOne //see here if front end issues - took away on @ManyToOne to refactor
	private Category category; 
	private Park park;
	
	
	public Review() {
		//don't use; JPA hook
	}
	
	public Review(String title, String imageUrl, String review, Category categoryName, Park parkName) {
		this.title = title;
		this.imageUrl= imageUrl;
		this.review = review;
		this.parkName = parkName;
		this.categoryName = categoryName;
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
	
	public String getReview() {
		return review;
	}
	
	public Category getCategoryName() {
		return categoryName;
	}
	
	public Park getParkName( ) {
		return parkName;
	}
	
}
	
