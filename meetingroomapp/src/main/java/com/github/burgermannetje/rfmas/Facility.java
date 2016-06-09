package com.github.burgermannetje.rfmas;

public class Facility {

	private String name;

	public Facility(final String name) {
		if (name==null) {
			throw new IllegalArgumentException("Argument 'name' should not be null");
		
		}
		String nameCln = name.trim();
		if ("".equals(nameCln))
		
		this.name = nameCln;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
