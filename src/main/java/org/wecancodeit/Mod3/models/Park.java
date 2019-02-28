package org.wecancodeit.Mod3.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;



@Entity
public class Park {
	
	@Id
	@GeneratedValue
	// id for each park is initialized here
	private Long id;  
	private String parkName;

	
	@OneToMany(mappedBy="park")
	private Collection<Review> reviews;
	
	@ManyToMany
	private Collection<Category> categories;
	
	public Park() {
		// don't put anything in here; it's a hook for JPA
	}
	
	public Park(String parkName, Category ...categories) {
		this.parkName = parkName;
		this.categories = Arrays.asList(categories);
	}

	public Collection<Category> getCategories() {
		return categories;
	}

	public Long getId() {
		return id;
	}
	
	public String getParkName() {
		return parkName;
	}
	
	public Collection<Review> getReviews(){
		return reviews;
	}

	@Override
	public String toString() {
		return "Park [id=" + id + ", parkName=" + parkName + ", reviews=" + reviews + "]";
	}

}
