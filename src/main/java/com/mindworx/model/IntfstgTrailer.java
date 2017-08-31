package com.mindworx.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class IntfstgTrailer {
	@NotNull
	@Size(max=30)
	private String trailerNo;// fetche all the records + single
	@Size(max=30)
	private String dcNo;
	@Size(max=30)
	private String sealNo;
	@Size(max=50)
	private String vehicleNo;
	@NotNull
	@Size(max=30)
	private String masterShipperNo;
	@Size(max=30)
	private String proNo;
	@Size(max=20)
	private String idNo;
	@Size(max=1)
	private String temperatureControl;
	@Size(max=50)
	private String dockNo;
	@Size(max=10)
	private int temperature;
	@Size(max=10)
	private String temperatureUom;
	@NotNull
	@Size(max=10)
	private String vcrFlag;
	@Size(max=20)
	private String tokenNo;
	private Date expectedArrivalDate;
	@Size(max=10)
	private int expectedArrivalTime;
	private Date actualArrivalDate;
	@Size(max=10)
	private int actualArrivalTime;
	private Date departDate;
	@Size(max=10)
	private int departTime;
	@Size(max=100)
	private String userField1;
	@Size(max=100)
	private String userField2;
	@Size(max=100)
	private String userField3;
	@Size(max=100)
	private String userField4;
	@Size(max=100)
	private String userField5;
	@Size(max=100)
	private String userField6;
	@Size(max=100)
	private String userField7;
	@Size(max=100)
	private String userField8;
	@Size(max=100)
	private String userField9;
	@Size(max=100)
	private String userField10;
	public String getTrailerNo() {
		return trailerNo;
	}
	public void setTrailerNo(String trailerNo) {
		this.trailerNo = trailerNo;
	}
	public String getDcNo() {
		return dcNo;
	}
	public void setDcNo(String dcNo) {
		this.dcNo = dcNo;
	}
	public String getSealNo() {
		return sealNo;
	}
	public void setSealNo(String sealNo) {
		this.sealNo = sealNo;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public String getMasterShipperNo() {
		return masterShipperNo;
	}
	public void setMasterShipperNo(String masterShipperNo) {
		this.masterShipperNo = masterShipperNo;
	}
	public String getProNo() {
		return proNo;
	}
	public void setProNo(String proNo) {
		this.proNo = proNo;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public String getTemperatureControl() {
		return temperatureControl;
	}
	public void setTemperatureControl(String temperatureControl) {
		this.temperatureControl = temperatureControl;
	}
	public String getDockNo() {
		return dockNo;
	}
	public void setDockNo(String dockNo) {
		this.dockNo = dockNo;
	}
	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public String getTemperatureUom() {
		return temperatureUom;
	}
	public void setTemperatureUom(String temperatureUom) {
		this.temperatureUom = temperatureUom;
	}
	public String getVcrFlag() {
		return vcrFlag;
	}
	public void setVcrFlag(String vcrFlag) {
		this.vcrFlag = vcrFlag;
	}
	public String getTokenNo() {
		return tokenNo;
	}
	public void setTokenNo(String tokenNo) {
		this.tokenNo = tokenNo;
	}
	public Date getExpectedArrivalDate() {
		return expectedArrivalDate;
	}
	public void setExpectedArrivalDate(Date expectedArrivalDate) {
		this.expectedArrivalDate = expectedArrivalDate;
	}
	public int getExpectedArrivalTime() {
		return expectedArrivalTime;
	}
	public void setExpectedArrivalTime(int expectedArrivalTime) {
		this.expectedArrivalTime = expectedArrivalTime;
	}
	public Date getActualArrivalDate() {
		return actualArrivalDate;
	}
	public void setActualArrivalDate(Date actualArrivalDate) {
		this.actualArrivalDate = actualArrivalDate;
	}
	public int getActualArrivalTime() {
		return actualArrivalTime;
	}
	public void setActualArrivalTime(int actualArrivalTime) {
		this.actualArrivalTime = actualArrivalTime;
	}
	public Date getDepartDate() {
		return departDate;
	}
	public void setDepartDate(Date departDate) {
		this.departDate = departDate;
	}
	public int getDepartTime() {
		return departTime;
	}
	public void setDepartTime(int departTime) {
		this.departTime = departTime;
	}
	public String getUserField1() {
		return userField1;
	}
	public void setUserField1(String userField1) {
		this.userField1 = userField1;
	}
	public String getUserField2() {
		return userField2;
	}
	public void setUserField2(String userField2) {
		this.userField2 = userField2;
	}
	public String getUserField3() {
		return userField3;
	}
	public void setUserField3(String userField3) {
		this.userField3 = userField3;
	}
	public String getUserField4() {
		return userField4;
	}
	public void setUserField4(String userField4) {
		this.userField4 = userField4;
	}
	public String getUserField5() {
		return userField5;
	}
	public void setUserField5(String userField5) {
		this.userField5 = userField5;
	}
	public String getUserField6() {
		return userField6;
	}
	public void setUserField6(String userField6) {
		this.userField6 = userField6;
	}
	public String getUserField7() {
		return userField7;
	}
	public void setUserField7(String userField7) {
		this.userField7 = userField7;
	}
	public String getUserField8() {
		return userField8;
	}
	public void setUserField8(String userField8) {
		this.userField8 = userField8;
	}
	public String getUserField9() {
		return userField9;
	}
	public void setUserField9(String userField9) {
		this.userField9 = userField9;
	}
	public String getUserField10() {
		return userField10;
	}
	public void setUserField10(String userField10) {
		this.userField10 = userField10;
	}
	
	

}
