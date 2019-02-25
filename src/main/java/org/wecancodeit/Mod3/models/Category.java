package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private String categoryName;
	private Long id;
	
	public Category() {
		//JPA hook; do not change
	}
	
	public Category(Long id, String categoryName) {
		this.id = id;
		this.categoryName = categoryName;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public Long getId() {
		return id;
	}
	
}
