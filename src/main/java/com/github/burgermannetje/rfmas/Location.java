package com.github.burgermannetje.rfmas;
 
public class Location implements Comparable<Location>{

	private String name;

	public Location(String locationName) 	{
		if (locationName==null) {
			throw new IllegalArgumentException("Location: 'name' should not be null");
		}
		String locNameCln = locationName.trim();
		if ("".equals(locNameCln)) {
			throw new IllegalArgumentException("Location: 'name' contains non-empty blanks");
		}
		this.name = locNameCln;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Location other) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(other.getName());
	}

}
