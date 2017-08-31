package com.mindworx.model;

public class ConsigneeMaster {
	private String accountNo;
	private String activeFlag;
	private String addr1;
	private String addr2;
	private String addr3;
	private String allowPickup;
	private String city;
	private String compId;
	private String consigneeId;
	private String consigneeName;
	private String contactName;
	private String country;
	private String deleteFlag;
	private int ebizAppownNo;
	private int ebizConsigneeNo;
	private int ebizUserNo;
	private String email;
	private String mobileNo;
	private String phone1;
	private String phone2;
	private String siteId;
	private String state;
	private String zipcode;
	private String custType;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getActiveFlag() {
		return activeFlag;
	}
	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr3() {
		return addr3;
	}
	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}
	public String getAllowPickup() {
		return allowPickup;
	}
	public void setAllowPickup(String allowPickup) {
		this.allowPickup = allowPickup;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCompId() {
		return compId;
	}
	public void setCompId(String compId) {
		this.compId = compId;
	}
	public String getConsigneeId() {
		return consigneeId;
	}
	public void setConsigneeId(String consigneeId) {
		this.consigneeId = consigneeId;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}	
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public int getEbizAppownNo() {
		return ebizAppownNo;
	}
	public void setEbizAppownNo(int ebizAppownNo) {
		this.ebizAppownNo = ebizAppownNo;
	}
	public int getEbizConsigneeNo() {
		return ebizConsigneeNo;
	}
	public void setEbizConsigneeNo(int ebizConsigneeNo) {
		this.ebizConsigneeNo = ebizConsigneeNo;
	}
	public int getEbizUserNo() {
		return ebizUserNo;
	}
	public void setEbizUserNo(int ebizUserNo) {
		this.ebizUserNo = ebizUserNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public String getPhone1() {
		return phone1;
	}
	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}
	public String getPhone2() {
		return phone2;
	}
	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}
	
	public String getSiteId() {
		return siteId;
	}
	public void setSiteId(String siteId) {
		this.siteId = siteId;
	}	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
		@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
}
