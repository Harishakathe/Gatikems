package com.mindworx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PoMaster {
	
	private long poNo;
	private String recieptType;
	private String carrier;
	private String supplier;
	private String supplierOrdNo;
	private Date poDate;
	private Date expShipDate;
	private Date expArrivalDate;
	private String instructions1;
	private String instructions2;
	private String jobNo;
	private String headerUserField1;
	private String shipPoint;
	private String headerUserField3;
	private String headerUserField4;
	private String loadMethod;
	private String pickingListFlag;
	private String headerUserField7;
	private String headerUserField8;
	private String headerUserField9;
	private String headerUserField10;
	private Date createdAt;
	private Date updatedAt;
	private String createdBy;
	private String updatedBy;
	private List<PoDetail> details = new ArrayList<PoDetail>();
	

	public long getPoNo() {
		return poNo;
	}
	public void setPoNo(long poNo) {
		this.poNo = poNo;
	}
	public String getRecieptType() {
		return recieptType;
	}
	public void setRecieptType(String recieptType) {
		this.recieptType = recieptType;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public String getSupplierOrdNo() {
		return supplierOrdNo;
	}
	public void setSupplierOrdNo(String supplierOrdNo) {
		this.supplierOrdNo = supplierOrdNo;
	}
	public Date getPoDate() {
		return poDate;
	}
	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}
	public Date getExpShipDate() {
		return expShipDate;
	}
	public void setExpShipDate(Date expShipDate) {
		this.expShipDate = expShipDate;
	}
	public Date getExpArrivalDate() {
		return expArrivalDate;
	}
	public void setExpArrivalDate(Date expArrivalDate) {
		this.expArrivalDate = expArrivalDate;
	}
	public String getInstructions1() {
		return instructions1;
	}
	public void setInstructions1(String instructions1) {
		this.instructions1 = instructions1;
	}
	public String getInstructions2() {
		return instructions2;
	}
	public void setInstructions2(String instructions2) {
		this.instructions2 = instructions2;
	}
	public String getJobNo() {
		return jobNo;
	}
	public void setJobNo(String jobNo) {
		this.jobNo = jobNo;
	}
	public String getHeaderUserField1() {
		return headerUserField1;
	}
	public void setHeaderUserField1(String headerUserField1) {
		this.headerUserField1 = headerUserField1;
	}
	public String getShipPoint() {
		return shipPoint;
	}
	public void setShipPoint(String shipPoint) {
		this.shipPoint = shipPoint;
	}
	public String getHeaderUserField3() {
		return headerUserField3;
	}
	public void setHeaderUserField3(String headerUserField3) {
		this.headerUserField3 = headerUserField3;
	}
	public String getHeaderUserField4() {
		return headerUserField4;
	}
	public void setHeaderUserField4(String headerUserField4) {
		this.headerUserField4 = headerUserField4;
	}
	public String getLoadMethod() {
		return loadMethod;
	}
	public void setLoadMethod(String loadMethod) {
		this.loadMethod = loadMethod;
	}
	public String getPickingListFlag() {
		return pickingListFlag;
	}
	public void setPickingListFlag(String pickingListFlag) {
		this.pickingListFlag = pickingListFlag;
	}
	public String getHeaderUserField7() {
		return headerUserField7;
	}
	public void setHeaderUserField7(String headerUserField7) {
		this.headerUserField7 = headerUserField7;
	}
	public String getHeaderUserField8() {
		return headerUserField8;
	}
	public void setHeaderUserField8(String headerUserField8) {
		this.headerUserField8 = headerUserField8;
	}
	public String getHeaderUserField9() {
		return headerUserField9;
	}
	public void setHeaderUserField9(String headerUserField9) {
		this.headerUserField9 = headerUserField9;
	}
	public String getHeaderUserField10() {
		return headerUserField10;
	}
	public void setHeaderUserField10(String headerUserField10) {
		this.headerUserField10 = headerUserField10;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public List<PoDetail> getDetails() {
		return details;
	}
	public void setDetails(List<PoDetail> details) {
		this.details = details;
	}
	
	
}
