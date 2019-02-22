package org.wecancodeit.Mod3.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Park {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private String type;
	
	public Park() {
		// don't put anything in here; it's a hook for JPA
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public String getType() {
		return type;
	}


	public Park(String name, String location, String type) {
		this.name = name;
		this.location = location;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Park [name=" + name + ", location=" + location + ", type=" + type + "]";
	}
}
