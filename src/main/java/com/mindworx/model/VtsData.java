package com.mindworx.model;

import java.util.Date;

public class VtsData {
	
	private long id;
	private String vehicleNumber;
	private String currentLocationAddress;
	private double currentLocationLatitude;
	private double currentLocationLongitude;
	private String currentIgnitionStatus;
	private double currentTemperature;
	private String currentCompressor;
	private int currentSpeed;
	private String currentTimestamp;
	private Date createdOn;	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getCurrentLocationAddress() {
		return currentLocationAddress;
	}
	public void setCurrentLocationAddress(String currentLocationAddress) {
		this.currentLocationAddress = currentLocationAddress;
	}
	public double getCurrentLocationLatitude() {
		return currentLocationLatitude;
	}
	public void setCurrentLocationLatitude(double currentLocationLatitude) {
		this.currentLocationLatitude = currentLocationLatitude;
	}
	public double getCurrentLocationLongitude() {
		return currentLocationLongitude;
	}
	public void setCurrentLocationLongitude(double currentLocationLongitude) {
		this.currentLocationLongitude = currentLocationLongitude;
	}
	public String getCurrentIgnitionStatus() {
		return currentIgnitionStatus;
	}
	public void setCurrentIgnitionStatus(String currentIgnitionStatus) {
		this.currentIgnitionStatus = currentIgnitionStatus;
	}
	public double getCurrentTemperature() {
		return currentTemperature;
	}
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}
	public String getCurrentCompressor() {
		return currentCompressor;
	}
	public void setCurrentCompressor(String currentCompressor) {
		this.currentCompressor = currentCompressor;
	}
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getCurrentTimestamp() {
		return currentTimestamp;
	}
	public void setCurrentTimestamp(String currentTimestamp) {
		this.currentTimestamp = currentTimestamp;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
}
