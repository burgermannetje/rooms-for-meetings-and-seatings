package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LocationTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void createValidNameLocation() {
		Location loc = new Location("Duo Kwadraat");
		assertEquals("Duo Kwadraat", loc.getName());
	}
	@Test
	public void createStrippedStringNameLocation() {
		Location loc = new Location("\t\t\t\t Duo Kwadraat ");
		assertEquals("Duo Kwadraat", loc.getName());
	}
	@Test 
	public void createNullArgumentNameLocation() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Location: 'name' should not be null"); 
		new Location(null);
	}
	
}
