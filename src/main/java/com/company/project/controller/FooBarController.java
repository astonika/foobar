package com.company.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.project.model.Record;
import com.company.project.service.FooBarService;
import com.company.project.util.Page;

@Controller
public class FooBarController {

	private Page<Record> page = new Page<Record>();

	@Value("${resultPage}")
	private String resultPage;
	
	@Autowired
	private FooBarService fooBarService;

	@RequestMapping({ "/", "/index", "/foobar" })
	public String index(ModelMap model) {
		try {
			model.addAttribute("page", fooBarService.xinxingcailiao());
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("page", page);
		} 
			return resultPage;
	}

}
