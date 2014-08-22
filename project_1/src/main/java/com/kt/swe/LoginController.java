package com.kt.swe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.BoardDAOService;
import com.kt.swe.DAO.BoardInfo;
import com.kt.swe.DAO.BoardInfoDAOService;
import com.kt.swe.DAO.MemberDAOService;

@Controller
public class LoginController {

	@Autowired
	private MemberDAOService memberDAOService;
	
	@Autowired
	public BoardDAOService boardDAOService;
	
	@Autowired
	private BoardInfoDAOService boardinfoDAOService;
	
	@RequestMapping("/login.do")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	
	@RequestMapping("/logincheck.do")
	public ModelAndView logincheck(@RequestParam("ID") String id, 
												@RequestParam("Password") String password){
		Authenticator auth = new Authenticator(password, memberDAOService.selectMember(id).getPassword());
		boolean check = auth.check();
		ModelAndView mav = new ModelAndView();
		mav.addObject("check", check);
		mav.setViewName("check");
		return mav;
	}
	
	@RequestMapping("/loginsuccess.do")
	public ModelAndView loginsuccess(){
		ModelAndView mav = new ModelAndView();
		List<BoardInfo> board = boardinfoDAOService.allBoard();
		mav.addObject("board", board);
		mav.setViewName("loginsuccess");
		return mav;
	}
	
	@RequestMapping("/loginfail.do")
	public ModelAndView loginfail(){
		ModelAndView mav = new ModelAndView("loginfail");
		return mav;
	}
}