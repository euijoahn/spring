/* 
 * class : Joincomfirm
 * role : �������� ���� ������ Ȯ�����ִ� Ŭ����
 */
package com.kt.swe;

import org.springframework.web.servlet.ModelAndView;

public class Joincomfirm{
	/* 
	 * function : comfirm
	 * role : �������� ���� Join�ÿ� ���Ǵ��� Ȯ���ϰ� View�� �̸��� �����Ѵ�.
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