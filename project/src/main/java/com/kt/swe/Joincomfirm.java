/* 
 * class : Joincomfirm
 * role : 정상적인 값이 들어가는지 확인해주는 클레스
 */
package com.kt.swe;

import org.springframework.web.servlet.ModelAndView;

public class Joincomfirm{
	/* 
	 * function : comfirm
	 * role : 정상적인 값이 Join시에 사용되는지 확인하고 View의 이름을 리턴한다.
	 * return type : ModelAndView
	 */
	public ModelAndView comfirm(String id, String password, String name, String phonenum){
		ModelAndView mav = new ModelAndView();
		if(id.equals("ID") || password.equals("Password") || name.equals("Name") || phonenum.equals("Phone Number")){
			mav.setViewName("joinfailed");
		}else{
			mav.setViewName("joincomplete");
		}
		return mav;
	}
}