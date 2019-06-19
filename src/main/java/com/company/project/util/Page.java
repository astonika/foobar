package com.company.project.util;

import java.io.Serializable;
import java.util.List;

public class Page<T extends Serializable> {

	private int total;
	private List<T> rows;
	private String pf_flow;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}

	public String getPf_flow() {
		return pf_flow;
	}

	public void setPf_flow(String pf_flow) {
		this.pf_flow = pf_flow;
	}

	@Override
	public String toString() {
		return "Page [total=" + total + ", rows=" + rows + "]";
	}

}
