package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
	@Test(expected = IllegalArgumentException.class)
	public void createNullArgBoth() throws Exception {
		new Room(null, null);		
	}
	@Test(expected = IllegalArgumentException.class)
	public void createNullArgFacility() throws Exception {
		new Room("X", null);		
	}
//	@Test(expected = IllegalArgumentException.class)
//	public void createNullArgRoom() throws Exception {
//		new Room(null, "X");	
//  }
/*
	// This does not seem to be a valid test...why?
*/	
		
	@Test
	public void roomFacility() throws Exception {
		Room room = new Room("Met Computer", new Facility("Computer"));
		assertEquals("Met Computer", room.getName());
		assertEquals("Computer", room.getFacilityName());
	}
	
}
