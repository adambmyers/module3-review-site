//package org.wecancodeit.Mod3.repositories;
//
//import java.util.List;
//
//import org.wecancodeit.Mod3.models.Park;
//
//public class OldParksRepositories {
//
//	private List<Park> parks;
//
//	public OldParksRepositories(List<Park> parks) {
//		this.parks = parks;
//	}
//
//	public List<Park> getParks() {
//		return parks;
//	}
//
//	public void addPark(Park park) {
//		parks.add(park);
//	}
//
//	@Override
//	public String toString() {
//		return "ParksRepositories [parks=" + parks + "]";
//	}
//	public Park findPark(String name) {
//		Park foundPark = null;
//		for (Park park : parks) {
//			if (park.getName().equals(name)) {
//				foundPark = park;
//				
//			}
//		}
//		return foundPark;
//	}
//}
