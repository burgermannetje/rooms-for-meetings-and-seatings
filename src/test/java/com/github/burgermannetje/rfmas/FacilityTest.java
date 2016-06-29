package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class FacilityTest {

	@Test
	public void createComputer() throws Exception {
		assertEquals ("Computer", new Facility("Computer").getName());
	}
	
	@Test
	public void createBeamer() throws Exception {
		assertEquals ("Beamer", new Facility(" Beamer").getName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void createNoArgs() throws Exception {
		new Facility(null);		
	}
	
}
