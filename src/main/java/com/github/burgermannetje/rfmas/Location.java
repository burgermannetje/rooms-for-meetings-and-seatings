package com.github.burgermannetje.rfmas;

public class Location {

	private String name;

	public Location(String name) {
		if (name==null) {
			throw new IllegalArgumentException("Location cannot be null");
		}
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
