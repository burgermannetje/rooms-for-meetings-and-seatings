package com.github.burgermannetje.rfmas;

public class Facility implements Comparable<Facility>{

	private String name;

	public Facility(final String facilityName) {
		if (facilityName==null) {
			throw new IllegalArgumentException("Argument 'name' should not be null");
		}
		
		String nameCln = facilityName.trim();
		if ("".equals(nameCln)) {
			throw new IllegalArgumentException("Argument contains non-empty blanks");
		}

		this.name = nameCln;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Facility other) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(other.getName());
	}

}
