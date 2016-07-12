package com.github.burgermannetje.rfmas.domain;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import com.github.burgermannetje.rfmas.Facility;
import com.github.burgermannetje.rfmas.Location;
import com.github.burgermannetje.rfmas.Room;

import static org.junit.Assert.*;

import org.junit.Test;

public class RoomTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void roomFacility() throws Exception {
		Room room = new Room(new Location("Barcelona"), "15.41" , 6 ,new Facility("Computer"));
		assertEquals("Barcelona", room.getLocation());
		assertEquals("15.41", room.getName());
		assertEquals(6, room.getAvailableSeats());
		assertEquals("Computer", room.getFacilityName());
	}

	@Test
	public void createNullArgRoom() throws Exception {
		exception.expect(NullPointerException.class);
		exception.expectMessage("Deze melding moet komen");
		Room room = new Room(new Location("De grote toren"), null, 6,  new Facility("Beamer"));		
	}
	@Test
	public void createNullArgLocation() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Deze melding moet komen");
		new Room(null, null, 1, null);		
	}

	@Test
	public void createNullArgFacility() throws Exception {
		exception.expect(NullPointerException.class);
		new Room(new Location("De grote toren"), "roomName", 20 ,null);
		
	}
//	@Test
//	public void createNullArgSeats() throws Exception {
//		exception.expect(NullPointerException.class);
//		new Room(new Location("De grote toren"), "roomName", null ,"Beamer");
//		
//	}

		
	
}
