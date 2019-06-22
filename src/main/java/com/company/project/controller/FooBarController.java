package com.company.project.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.company.project.model.Record;
import com.company.project.service.FooBarService;
import com.company.project.util.Page;

@Controller
public class FooBarController {

	private int i = 0;
	private Page<Record> page = new Page<Record>();
	private List<List<Record>> rowses = new ArrayList<List<Record>>();

	@Autowired
	private FooBarService fooBarService;

	// public static void main(String[] args) {
	// System.out.println(new FooBarAction().xinxingcailiao(new ModelMap()));
	// }

	// @Scheduled(cron = "0 0/7 * * * ?")
	public void foobar() {
		System.out.println("    ========schedule===========    " + new Date());
		// fooBarService.xinxingcailiao();
		i++;
		page.setRows(rowses.get((i %= 2)));
	}

	@RequestMapping("/xinxingcailiao")
	public String xinxingcailiao(ModelMap model) {
		try {
			model.addAttribute("xinxingcailiao", fooBarService.xinxingcailiao());
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("xinxingcailiao", page);
		}
		return "index4"; // 逻辑视图名viewName --视图解析器--具体的真实视图对象
	}
	@RequestMapping({"/","/index","/foobar"})
	public String index(ModelMap model) {
//		try {
//			model.addAttribute("xinxingcailiao", fooBarService.xinxingcailiao());
//		} catch (Exception e) {
//			e.printStackTrace();
			model.addAttribute("page", page);
//		}
		return "index5"; // 逻辑视图名viewName --视图解析器--具体的真实视图对象
	}
	
}
