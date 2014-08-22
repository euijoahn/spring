package com.kt.swe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kt.swe.DAO.MemberDAOService;

@Controller
public class IndexController {
	@Autowired
	public MemberDAOService memberDAOService;
	
	@RequestMapping("/index.do")
	public String home() {
		return "index";
	}
}