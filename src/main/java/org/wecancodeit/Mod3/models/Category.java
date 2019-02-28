package org.wecancodeit.Mod3.models;

import java.util.ArrayList;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private Long id;
	private String categoryName;
	
	
	@ManyToMany(mappedBy="categories")
	private Collection<Park> parks;
	
	public Category() {
		//JPA hook; do not change
	}
	
	public Category(String categoryName) {
		this.categoryName = categoryName;
		this.parks = new ArrayList<>();
	}
	
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
	
	
	public Collection<Park> getParks(){
		return parks;
		
	}
	
	//see how ID shows up in front end- if looks bad re-add Id to toString
	
		
	}
	

