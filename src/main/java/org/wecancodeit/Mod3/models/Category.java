package org.wecancodeit.Mod3.models;

import java.util.ArrayList;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

// Lets Spring know the class category is part of MVC model
@Entity  
public class Category {

	
	//Assigns variable an ID number to each category
	@Id 
	@GeneratedValue
	private Long id;
	private String categoryName;
	
	//Tags relationship between parks and categories
	//Line 26 - creates collection called parks inside of categories.  It is using Parks as a model to build parks collection.
	@ManyToMany(mappedBy="categories")
	private Collection<Park> parks;
	
	public Category() {
		//JPA hook; do not change
	}
	
	// Constructor for category
	public Category(String categoryName) {
		this.categoryName = categoryName;
		this.parks = new ArrayList<>();
	}
	
	// Makes objects readable 
	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", parks=" + parks + "]";
	}

	public String getCategoryName() {
		return categoryName;
	}
	
	public Long getId() {
		return id;
	}
	
	// Needed due to Many to Many relationship
	public Collection<Park> getParks(){
		return parks;
		
	}
	
	//see how ID shows up in front end- if looks bad re-add Id to toString
	
		
	}
	

