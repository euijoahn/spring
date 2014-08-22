package com.kt.swe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController{
	@RequestMapping("/logout.do")
	public ModelAndView main(){
		ModelAndView mav = new ModelAndView("logout");
		return mav;
	}
}