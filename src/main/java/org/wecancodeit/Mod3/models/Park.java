package org.wecancodeit.Mod3.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


//Lets Spring know the class category is part of MVC model
@Entity
public class Park {
	
	// Assigns ID for each category
	// id for each park is initialized here
	@Id
	@GeneratedValue
	private Long id;  
	private String parkName;

	// Each park stores multiple reviews.  We build collection of reviews and link it here
	// "park" - call on this inside controller - links this model and allows it to be called in ThymeLeaf - see CategoryController TH
	@OneToMany(mappedBy="park") 
	private Collection<Review> reviews;
	
	// Creates collection called categories inside Park
	@ManyToMany
	private Collection<Category> categories;
	
	public Park() {
		// hook for JPA
	}
	
	// Constructor for Park - we are adding a collection (categories) to constructor
	// This collection is not inside of Category model because Park owns the relationship (need a park to have a category)
	public Park(String parkName, Category ...categories) {
		this.parkName = parkName;
		this.categories = Arrays.asList(categories);
	}

	public Collection<Category> getCategories() {
		return categories;
	}

	public Collection<Review> getReviews(){
		return reviews;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getParkName() {
		return parkName;
	}
	
	// Makes objects readable
	@Override
	public String toString() {
		return "Park [id=" + id + ", parkName=" + parkName + ", reviews=" + reviews + "]";
	}

}
