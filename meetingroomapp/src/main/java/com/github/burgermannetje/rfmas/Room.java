package com.github.burgermannetje.rfmas;

public class Room {

	private String roomName;
	public Room(final String roomName, final Facility facilityName) {
		if(roomName==null||facilityName==null){
			throw new IllegalArgumentException("Arguments shouldn't be empty");
		}
		String roomCln = roomName.trim();
		if ("".equals(roomCln)) {
			throw new IllegalArgumentException("Argument 'name' contains non-blank characters");
		}
		this.roomName = roomCln;
	}
	public String getName() {
		return roomName;
	}

	public String getFacilityName() {
		return Facility.getName();
	}
	public void setFacilityName(Facility facilityName) {
	}
	
}
