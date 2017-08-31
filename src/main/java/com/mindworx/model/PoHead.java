package com.mindworx.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;



public class PoHead {
	
	private String poNo;
	private Date poDate;
	private String suppName;
	private Date schArrivalDate;
	private List<PoLine> lines = new ArrayList<>();
	
	public String getPoNo() {
		return poNo;
	}
	public void setPoNo(String poNo) {
		this.poNo = poNo;
	}
	public Date getPoDate() {
		return poDate;
	}
	public void setPoDate(Date poDate) {
		this.poDate = poDate;
	}
	public String getSuppName() {
		return suppName;
	}
	public void setSuppName(String suppName) {
		this.suppName = suppName;
	}
	
	
	
	public Date getSchArrivalDate() {
		return schArrivalDate;
	}
	public void setSchArrivalDate(Date schArrivalDate) {
		this.schArrivalDate = schArrivalDate;
	}
	@Override
	public String toString() {
		return new com.google.gson.Gson().toJson(this);
	}
	public List<PoLine> getLines() {
		return lines;
	}
	public void setLines(List<PoLine> lines) {
		this.lines = lines;
	}
	
	
}
