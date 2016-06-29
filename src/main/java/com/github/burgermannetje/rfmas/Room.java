package com.github.burgermannetje.rfmas;

public class Room {

	private String roomName;
	private Location location;
	private Facility facility;
	
	
	
	public Room(Location location, final String roomName, Facility facility) {
		if(facility==null||location==null){
			throw new IllegalArgumentException("Arguments shouldn't be empty");
		}
		String roomCln = roomName.trim();
		if ("".equals(roomCln)) {
			throw new IllegalArgumentException("Argument 'name' contains non-blank characters");
		}
		this.roomName = roomCln;
		this.location = location;
		this.facility = facility;
	}
	public String getName() {
		return roomName;
	}

	public String getFacilityName() {
		return facility.getName();
	}
//	public void setFacilityName(Facility facilityName) {
//	}
	public String getLocation() {
		return location.getName();

	}
	
}
