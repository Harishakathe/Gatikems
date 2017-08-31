package com.mindworx.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ViewZoneTemperatureDetails {
	
	private int id;
	@NotNull @Size(max=50)
	private String companyId;
	@NotNull @Size(max=50)
	private String companyName;
	@NotNull @Size(max=50)
	private String siteId;
	@NotNull @Size(max=50)
	private String siteName;
	@NotNull @Size(max=100)
	private String deviceId;
	@NotNull @Size(max=500)
	private String zoneId;
	@NotNull @Size(max=100)
	private String temperatureId;
	@NotNull @Size(max=500)
	private String temperatureName;
	@NotNull @Size(max=100)
	private String temperatureValue;
	@NotNull @Size(max=100)
	private String minimumValue;
	@NotNull @Size(max=100)
	private String maxmumValue;
	private Date temperatureDateTime;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}
	public String getSiteName() {
		return siteName;
	}
	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getZoneId() {
		return zoneId;
	}
	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	public String getTemperatureId() {
		return temperatureId;
	}
	public void setTemperatureId(String temperatureId) {
		this.temperatureId = temperatureId;
	}
	public String getTemperatureName() {
		return temperatureName;
	}
	public void setTemperatureName(String temperatureName) {
		this.temperatureName = temperatureName;
	}
	public String getTemperatureValue() {
		return temperatureValue;
	}
	public void setTemperatureValue(String temperatureValue) {
		this.temperatureValue = temperatureValue;
	}
	public String getMinimumValue() {
		return minimumValue;
	}
	public void setMinimumValue(String minimumValue) {
		this.minimumValue = minimumValue;
	}
	public String getMaxmumValue() {
		return maxmumValue;
	}
	public void setMaxmumValue(String maxmumValue) {
		this.maxmumValue = maxmumValue;
	}
	public Date getTemperatureDateTime() {
		return temperatureDateTime;
	}
	public void setTemperatureDateTime(Date temperatureDateTime) {
		this.temperatureDateTime = temperatureDateTime;
	}
	 
}
