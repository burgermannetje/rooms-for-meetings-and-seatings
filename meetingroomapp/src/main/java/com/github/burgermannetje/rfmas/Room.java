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

//puzzle
	public String getFacilityName() {
		return Facility.getName();
	}
	public void setFacilityName(Facility facilityName) {
	}
//	public  String getFacility() {
//		return ((Facility) Facility).getName();
//		// TODO Auto-generated method stub
//		//return facility;
//	}

	
}
