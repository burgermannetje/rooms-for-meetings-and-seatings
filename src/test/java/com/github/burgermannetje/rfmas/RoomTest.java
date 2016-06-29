package com.github.burgermannetje.rfmas;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
	@Test
	public void roomFacility() throws Exception {
		Room room = new Room(new Location("Barcelona"), "Met Computer" ,new Facility("Computer"));
		assertEquals("Barcelona", room.getLocation());
		assertEquals("Met Computer", room.getName());
		assertEquals("Computer", room.getFacilityName());
	}

	@Test(expected = IllegalArgumentException.class)
	public void createNullArgBoth() throws Exception {
		new Room(null, null, null);		
	}

	@Test(expected = IllegalArgumentException.class)
	public void createNullArgFacility() throws Exception {
		new Room(null, "roomName", null);		
	}

//	@Test(expected = IllegalArgumentException.class)
//	public void createNullArgRoom() throws Exception {
//		new Room(null, "newFacility");	
//  }
/*
	// This does not seem to be a valid test...why?
*/	
		
	
}
