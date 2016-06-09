package com.github.burgermannetje.rfmas;

public class Facility {

	private static String facilityName;

	public Facility(final String facilityName) {
		if (facilityName==null) {
			throw new IllegalArgumentException("Argument 'name' should not be null");
			
		}
		
		String nameCln = facilityName.trim();
		if ("".equals(nameCln)) {
		throw new IllegalArgumentException("Argument contains non-empty blanks");
		}
		Facility.facilityName = nameCln;
		}
	public static String getName() {
		// TODO Auto-generated method stub
		return facilityName;
	}

}
