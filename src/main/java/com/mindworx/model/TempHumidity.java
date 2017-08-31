package com.mindworx.model;

import java.util.Date;

public class TempHumidity {
	
	private long id;
	private int zoneId;
	private float roomTempValue;
	private float humidityValue;
	private Date createdAt;
	
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
	public float getRoomTempValue() {
		return roomTempValue;
	}
	public void setRoomTempValue(float roomTempValue) {
		this.roomTempValue = roomTempValue;
	}
	public float getHumidityValue() {
		return humidityValue;
	}
	public void setHumidityValue(float humidityValue) {
		this.humidityValue = humidityValue;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	
}
