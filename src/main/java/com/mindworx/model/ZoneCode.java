package com.mindworx.model;

public class ZoneCode {
	
	private long id;
	private int zoneId;
	private String zoneName;
	private int roomTempId;
	private int humidityId;
	private String locationId;
	private String locationName;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getZoneId() {
		return zoneId;
	}

	public void setZoneId(int zoneId) {
		this.zoneId = zoneId;
	}

	public String getZoneName() {
		return zoneName;
	}

	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}

	public int getRoomTempId() {
		return roomTempId;
	}

	public void setRoomTempId(int roomTempId) {
		this.roomTempId = roomTempId;
	}

	public int getHumidityId() {
		return humidityId;
	}

	public void setHumidityId(int humidityId) {
		this.humidityId = humidityId;
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "sr_no :"+this.id+", zoneId:"+this.zoneId+", zoneName:"+this.zoneName;
	}
	
	
}
