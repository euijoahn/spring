package com.kt.swe;

import org.springframework.web.servlet.ModelAndView;

public class CommonController{
	private ModelAndView mav = new ModelAndView();
	
	public void setModelname(String name){
		this.mav.setViewName(name);
	}
	
	public String getModelname(){
		return this.mav.getViewName();
	}
	
	public void setModelObject(String name, Object object){
		this.mav.addObject(name, object);
	}
	
	public ModelAndView getModel(){
		return this.mav;
	}
	
	public void setModel(ModelAndView mav){
		this.mav = mav;
	}
}