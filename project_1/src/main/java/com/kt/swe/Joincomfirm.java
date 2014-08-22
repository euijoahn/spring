package com.kt.swe;

import org.springframework.web.servlet.ModelAndView;

public class Joincomfirm{
	public ModelAndView main(String id, String password, String name, String phonenum){
		ModelAndView mav = new ModelAndView();
		if(id.equals("ID") || password.equals("Password") || name.equals("Name") || phonenum.equals("Phone Number")){
			mav.setViewName("joinfailed");
		}else{
			mav.setViewName("joincomplete");
		}
		return mav;
	}
}