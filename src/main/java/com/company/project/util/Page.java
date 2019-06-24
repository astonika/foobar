package com.company.project.util;

import java.util.List;

import lombok.Data;

@Data
public class Page<T> {

	private int total;
	private List<T> rows;
	private String pf_flow;

}
