package com.mindworx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class SoHead {
	
	@NotEmpty(message="{NotNull.IntfstgInbso.ordNo}") @Size(max=30)
	private String ordNo;
	private int noLines;
	@NotNull(message="{NotNull.IntfstgInbso.ordDate}")
	private Date ordDate;
	@NotEmpty(message="{NotNull.IntfstgInbso.orderType}") @Size(max=10)
	private String orderType;
	@NotEmpty(message="{NotNull.IntfstgInbso.consigneeId}") @Size(max=100)
	private String consigneeId;
	@NotEmpty(message="{NotNull.IntfstgInbso.carrierId}") @Size(max=10)
	private String carrierId;
	@Size(max=30)
	private String carrierType;
	@Size(max=50)
	private String shiptoAddr1;
	@Size(max=50)
	private String shiptoAddr2;
	@Size(max=50)
	private String shiptoAddr3;
	@Size(max=50)
	private String shiptoEmail;
	@Size(max=20)
	private String shiptoFax;
	@Size(max=20)
	private String shiptoMobileNo;
	@Size(max=20)
	private String shiptoPhone;
	@Size(max=20)
	private String shiptoCity;
	@Size(max=20)
	private String shiptoCountry;
	@Size(max=20)
	private String shiptoState;
	@Size(max=20)
	private String shiptoZip;
	private Date schDate;
	@Size(max=100)
	private String consigneeName;
	
	private List<SoLine> line = new ArrayList<>();
	
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	public int getNoLines() {
		return noLines;
	}
	public void setNoLines(int noLines) {
		this.noLines = noLines;
	}
	public Date getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(Date ordDate) {
		this.ordDate = ordDate;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getConsigneeId() {
		return consigneeId;
	}
	public void setConsigneeId(String consigneeId) {
		this.consigneeId = consigneeId;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public String getCarrierType() {
		return carrierType;
	}
	public void setCarrierType(String carrierType) {
		this.carrierType = carrierType;
	}
	public String getShiptoAddr1() {
		return shiptoAddr1;
	}
	public void setShiptoAddr1(String shiptoAddr1) {
		this.shiptoAddr1 = shiptoAddr1;
	}
	public String getShiptoAddr2() {
		return shiptoAddr2;
	}
	public void setShiptoAddr2(String shiptoAddr2) {
		this.shiptoAddr2 = shiptoAddr2;
	}
	public String getShiptoAddr3() {
		return shiptoAddr3;
	}
	public void setShiptoAddr3(String shiptoAddr3) {
		this.shiptoAddr3 = shiptoAddr3;
	}
	public String getShiptoEmail() {
		return shiptoEmail;
	}
	public void setShiptoEmail(String shiptoEmail) {
		this.shiptoEmail = shiptoEmail;
	}
	public String getShiptoFax() {
		return shiptoFax;
	}
	public void setShiptoFax(String shiptoFax) {
		this.shiptoFax = shiptoFax;
	}
	public String getShiptoMobileNo() {
		return shiptoMobileNo;
	}
	public void setShiptoMobileNo(String shiptoMobileNo) {
		this.shiptoMobileNo = shiptoMobileNo;
	}
	public String getShiptoPhone() {
		return shiptoPhone;
	}
	public void setShiptoPhone(String shiptoPhone) {
		this.shiptoPhone = shiptoPhone;
	}
	public String getShiptoCity() {
		return shiptoCity;
	}
	public void setShiptoCity(String shiptoCity) {
		this.shiptoCity = shiptoCity;
	}
	public String getShiptoCountry() {
		return shiptoCountry;
	}
	public void setShiptoCountry(String shiptoCountry) {
		this.shiptoCountry = shiptoCountry;
	}
	public String getShiptoState() {
		return shiptoState;
	}
	public void setShiptoState(String shiptoState) {
		this.shiptoState = shiptoState;
	}
	public String getShiptoZip() {
		return shiptoZip;
	}
	public void setShiptoZip(String shiptoZip) {
		this.shiptoZip = shiptoZip;
	}	
	public List<SoLine> getLines() {
		return line;
	}
	public void setLines(List<SoLine> line) {
		this.line = line;
	}
	
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	public Date getSchDate() {
		return schDate;
	}
	public void setSchDate(Date schDate) {
		this.schDate = schDate;
	}
	public String getConsigneeName() {
		return consigneeName;
	}
	public void setConsigneeName(String consigneeName) {
		this.consigneeName = consigneeName;
	}
}
