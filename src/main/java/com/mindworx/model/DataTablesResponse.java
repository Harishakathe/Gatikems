package com.mindworx.model;

import java.util.ArrayList;
import java.util.List;

public class DataTablesResponse<T> {
	 
	private int draw;
	private long recordsTotal;
	private long recordsFiltered;
	private String error;
	private List<T> data = new ArrayList<>();

	 public DataTablesResponse(int draw, long recordsTotal,
	   long recordsFiltered, String error, List<T> data) {
	  super();
	  this.draw = draw;
	  this.recordsTotal = recordsTotal;
	  this.recordsFiltered = recordsFiltered;
	  this.error = error;
	  this.setData(data);
	 }

	 public int getDraw() {
	  return draw;
	 }
	 public void setDraw(int draw) {
	  this.draw = draw;
	 }
	 public long getRecordsTotal() {
	  return recordsTotal;
	 }
	 public void setRecordsTotal(long recordsTotal) {
	  this.recordsTotal = recordsTotal;
	 }
	 public long getRecordsFiltered() {
	  return recordsFiltered;
	 }
	 public void setRecordsFiltered(long recordsFiltered) {
	  this.recordsFiltered = recordsFiltered;
	 }
	 public String getError() {
	  return error;
	 }
	 public void setError(String error) {
	  this.error = error;
	 }

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	 
}
