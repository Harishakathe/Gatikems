package com.mindworx.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataTablesRequest<T> {
	
	private int draw;
	private int start;

	private int length;
	private Search search;
	@JsonProperty("order")
	private List<DataTablesOrder> orders;
	private List<DataTablesColumn> columns;
	public int getDraw() {
		return draw;
	}
	public void setDraw(int draw) {
		this.draw = draw;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Search getSearch() {
		return search;
	}
	public void setSearch(Search search) {
		this.search = search;
	}
	public List<DataTablesOrder> getOrders() {
		return orders;
	}
	public void setOrders(List<DataTablesOrder> orders) {
		this.orders = orders;
	}
	public List<DataTablesColumn> getColumns() {
		return columns;
	}
	public void setColumns(List<DataTablesColumn> columns) {
		this.columns = columns;
	}
	
}
