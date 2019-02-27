package org.wecancodeit.Mod3.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;
	
	@OneToMany(mappedBy="category")
	private Collection<Review> reviews;
	
	public Category() {
		//JPA hook; do not change
	}
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public Long getId() {
		return id;
	}
	
	public Collection<Review> getReviews(){
		return reviews;
	}

	//see how ID shows up in front end- if looks bad re-add Id to toString
	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", reviews=" + reviews + "]";
	}
	
}
