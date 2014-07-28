package com.kt.swe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
public class LoginCheckController {

	@Autowired
	private MemberDAOService DAOService;
	
	@RequestMapping("/Logincheck.do")
	private ModelAndView logincheck()
	{
		ModelAndView mav = new ModelAndView("logincheck");
		List<Members> memberList = DAOService.allMember();
		mav.addObject("list", memberList);
		
		return mav;
	}
	/*
	@RequestMapping("/Logincheck.do")
	public String logincheck(Locale locale, Model model){
		
		List<Members> memberList = memberDAOService.allMember();
		model.addAttribute("list", memberList);
		
		return "logincheck";
	}*/
}