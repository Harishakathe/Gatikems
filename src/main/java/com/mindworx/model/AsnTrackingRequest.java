package com.mindworx.model;

import java.util.Date;

public class AsnTrackingRequest<T> extends DataTablesRequest<T>{
	
	private Date startDate;
	private Date endDate;
	private String poNo;
	private String invNo;
	private String batchNo;
	private String hubLocation;
	private String cityLocation;
	private String sku;
	private String allSearch;
	private String filterBy;
	
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public String getInvNo() {
		return invNo;
	}
	public void setInvNo(String invNo) {
		this.invNo = invNo;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getHubLocation() {
		return hubLocation;
	}
	public void setHubLocation(String hubLocation) {
		this.hubLocation = hubLocation;
	}
	public String getCityLocation() {
		return cityLocation;
	}
	public void setCityLocation(String cityLocation) {
		this.cityLocation = cityLocation;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	public String getAllSearch() {
		return allSearch;
	}
	public void setAllSearch(String allSearch) {
		this.allSearch = allSearch;
	}
	public String getFilterBy() {
		return filterBy;
	}
	public void setFilterBy(String filterBy) {
		this.filterBy = filterBy;
	}
	

}
