package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocationTest {

	@Test
	public void testValidLocation() {
		Location loc = new Location("Duo");
		assertEquals("Duo", loc.getName());
	}
	@Test (expected = IllegalArgumentException.class)
	public void testNotNull() throws Exception {
		new Location(null);
	}
	
}
