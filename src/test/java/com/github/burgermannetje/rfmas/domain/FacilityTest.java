package com.github.burgermannetje.rfmas.domain;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.github.burgermannetje.rfmas.Facility;

public class FacilityTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void createValidStringComputer() throws Exception {
		assertEquals ("Computer 1", new Facility("Computer 1").getName());
	}
	

	@Test
	public void createNullArgumentNameFacility() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Facility: 'name' should not be null");
	new Facility(null);		
	}
	
}
