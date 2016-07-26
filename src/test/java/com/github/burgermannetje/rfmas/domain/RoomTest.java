package com.github.burgermannetje.rfmas.domain;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import com.github.burgermannetje.rfmas.Facility;
import com.github.burgermannetje.rfmas.Location;
import com.github.burgermannetje.rfmas.Room;

import static org.junit.Assert.*;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

public class RoomTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void roomFacility() throws Exception {
		Set<Facility> facilities = new LinkedHashSet<>();
		facilities.add(new Facility("Computer"));
		Room room = new Room(new Location("Barcelona"), "15.41" , 6 , facilities);
		assertEquals("Barcelona", room.getLocation());
		assertEquals("15.41", room.getName());
		assertEquals(6, room.getAvailableSeats());
		assertEquals("Computer", room.getFacilityName());
	}

	@Test
	public void createNullArgRoom() throws Exception {
		Set<Facility> facilities = new LinkedHashSet<>();
		facilities.add(new Facility("Beamer"));
		exception.expect(NullPointerException.class);
		exception.expectMessage("Deze melding moet komen");
		Room room = new Room(new Location("De grote toren"), null, 6, facilities);		
	}
	
	@Test
	public void createNullArgLocation() throws Exception {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Room: argument 'location' cannot be empty");
		new Room(null, null, 1, null);		
	}

	@Test
	
	public void createMultipleFacilities() throws Exception {
		Set<Facility> facilities = new LinkedHashSet<>();
		facilities.add(new Facility("Computer"));
		facilities.add(new Facility("Daglichtblokkering"));
		Room room = new Room(new Location("De grote toren"), null, 6, facilities);		
		
		assertEquals("Daglichtblokkering, Computer", room.getFacilityName());
	}

//	@Test
//	public void createNullArgFacility() throws Exception {
//		exception.expect(NullPointerException.class);
//		new Room(new Location("De grote toren"), "roomName", 20 ,null);
//	}

//	@Test
//	public void createNullArgSeats() throws Exception {
//		exception.expect(NullPointerException.class);
//		new Room(new Location("De grote toren"), "roomName", null ,"Beamer");
//		
//	}

		
	
}
