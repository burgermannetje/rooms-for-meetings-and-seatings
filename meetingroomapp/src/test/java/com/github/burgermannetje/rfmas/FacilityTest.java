package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacilityTest {

	@Test
	public void createComputer() throws Exception {
		Facility facility = new Facility("Computer");		
		assertEquals ("Computer", facility.getName());
	}
	
	@Test
	public void createBeamer() throws Exception {
		Facility facility = new Facility("Beamer");		
		assertEquals ("Beamer", facility.getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void createNoArgs() throws Exception {
		new Facility(null);		
	}

}
