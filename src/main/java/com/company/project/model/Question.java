package com.company.project.model;

import java.util.List;

public class Question extends BaseModel<Long> {
	private String title;
	private String content;
	private Topic[] topics;
	private User owner;
	private List<Answer> answers;
	
}
