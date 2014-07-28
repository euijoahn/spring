package com.kt.swe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping("/Login.do")
	public ModelAndView Login() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
}