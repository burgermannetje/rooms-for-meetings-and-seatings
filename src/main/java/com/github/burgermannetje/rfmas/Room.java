package com.github.burgermannetje.rfmas;

public class Room {

	private String roomName;
	private Location location;
	private Facility facility;
	private int availableSeats;

	public Room(Location location, int availableSeats) 
	{
		new Room(location, null, availableSeats, null);
	}

	public Room(Location location, final String roomName, int availableSeats) 
	{
		new Room(location, roomName, availableSeats, null);
	}
		
	public Room(Location location, final String roomName, int availableSeats, Facility facility) {
//		if (facility == null) {
//			throw new IllegalArgumentException("Room: argument 'facility' cannot be empty");
//		}
		if (location == null) {
			throw new IllegalArgumentException("Room: argument 'location' cannot be empty");
		}
		if (availableSeats < 1) {
			throw new IllegalArgumentException("Room: argument 'seats' cannot be less than 1");
		} else if (availableSeats > 250) {
			throw new IllegalArgumentException("Room: argument 'seats' cannot be more than 250");
		}

		String roomCln = roomName.trim();
		if ("".equals(roomCln)) {
			throw new IllegalArgumentException("Room: argument 'name' contains non-blank characters");
		}

		this.roomName = roomCln;
		this.location = location;
		this.facility = facility;
		this.availableSeats = availableSeats;
	}

	public String getName() {
		return roomName;
	}

	public String getFacilityName() {
		return facility.getName();
	}

	// public void setFacilityName(Facility facilityName) {
	// }
	public String getLocation() {
		return location.getName();

	}

	public int getAvailableSeats() {
		return availableSeats;
	}

}
