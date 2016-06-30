package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FacilityTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void createValidStringComputer() throws Exception {
		assertEquals ("Computer 1", new Facility("Computer 1").getName());
	}
	
	@Test
	public void createDaylightRemoval() throws Exception {
		assertEquals ("Daglichtblokkering", new Facility(" Daglichtblokkering \n").getName());
	}

	@Test
	public void createNullArgumentNameFacility() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Facility: 'name' should not be null");
	new Facility(null);		
	}
	
}
