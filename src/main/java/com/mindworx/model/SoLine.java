package com.mindworx.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class SoLine {
	
	@NotNull(message="{NotNull.IntfstgInbso.ordlineNo}")
	private int ordlineNo;
	@NotEmpty(message="{NotNull.IntfstgInbso.sku}") @Size(max=200)
	private String sku;
	@NotEmpty(message="{NotNull.IntfstgInbso.skuStatus}") @Size(max=10)
	private String skuStatus;
	@Size(max=100)
	private String batchNo;
	@NotNull(message="{NotNull.IntfstgInbso.ordQty}")
	private int ordQty;
	@NotEmpty(message="{NotNull.IntfstgInbso.packcode}") @Size(max=10)
	private String packcode;
	@NotEmpty @Size(max=10)
	private String uomId;
	private float unitPrice;
	@NotEmpty(message="{NotNull.IntfstgInbso.ordNo}") @Size(max=30)
	private String ordNo;
	public int getOrdlineNo() {
		return ordlineNo;
	}
	public void setOrdlineNo(int ordlineNo) {
		this.ordlineNo = ordlineNo;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getSkuStatus() {
		return skuStatus;
	}
	public void setSkuStatus(String skuStatus) {
		this.skuStatus = skuStatus;
	}
	public String getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public int getOrdQty() {
		return ordQty;
	}
	public void setOrdQty(int ordQty) {
		this.ordQty = ordQty;
	}
	public String getPackcode() {
		return packcode;
	}
	public void setPackcode(String packcode) {
		this.packcode = packcode;
	}
	public String getUomId() {
		return uomId;
	}
	public void setUomId(String uomId) {
		this.uomId = uomId;
	}
	public float getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getOrdNo() {
		return ordNo;
	}
	public void setOrdNo(String ordNo) {
		this.ordNo = ordNo;
	}
	
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	
}
