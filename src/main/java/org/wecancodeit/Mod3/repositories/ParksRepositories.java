package org.wecancodeit.Mod3.repositories;

import java.util.List;

import org.wecancodeit.Mod3.models.Park;

public class ParksRepositories {

	private List<Park> parks;

	public ParksRepositories(List<Park> parks) {
		this.parks = parks;
	}

	public List<Park> getParks() {
		return parks;
	}

	public void addPark(Park park) {
		parks.add(park);
	}

	@Override
	public String toString() {
		return "ParksRepositories [parks=" + parks + "]";
	}

}
