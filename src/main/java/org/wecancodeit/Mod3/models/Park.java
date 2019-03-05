package org.wecancodeit.Mod3.models;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Park {
	
	@Id
	@GeneratedValue
	// id for each park is initialized here
	private Long id;  
	private String parkName;
	private String location;
	private String website;
	@Lob
	private String description;
	private String parkImageUrl;
	
	@OneToMany(mappedBy="park")
	private Collection<Review> reviews;
	
	@ManyToMany
	private Collection<Category> categories;
	
	public Park() {
		// don't put anything in here; it's a hook for JPA
	}
	
	public Park(String parkName, String location, String website, String description, String parkImageUrl, Category ...categories) {
		this.parkName = parkName;
		this.location = location;
		this.website = website;
		this.description = description;
		this.parkImageUrl = parkImageUrl;
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
	
	public String getLocation() {
		return location;
	}
	
	public String getWebsite() {
		return website;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getParkImageUrl() {
		return parkImageUrl;
	}
	
	public Collection<Review> getReviews(){
		return reviews;
	}

	@Override
	public String toString() {
		return "Park [id=" + id + ", parkName=" + parkName + ", location=" + location + ", description=" + description
				+ ", parkImageUrl=" + parkImageUrl + ", reviews=" + reviews + ", categories=" + categories + "]";
	}
	
	

}
