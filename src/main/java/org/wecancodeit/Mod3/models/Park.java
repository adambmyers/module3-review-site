package org.wecancodeit.Mod3.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	public Park() {
		// don't put anything in here; it's a hook for JPA
	}

	
	public Park(String parkName) {
		this.parkName = parkName;
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
