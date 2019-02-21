package org.wecancodeit.Mod3.models;

public class Park {
	private String name;
	private String location;
	private String type;
	
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
