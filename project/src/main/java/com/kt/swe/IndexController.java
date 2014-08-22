/* 
 * class : IndexController
 * role : �ʱ�ȭ���� ����ϴ� Ŭ����
 */
package com.kt.swe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.BoardInfoDAOService;

@Controller
public class IndexController extends CommonController{
	
	@Autowired
	private BoardInfoDAOService boardinfodaoservice;
	
	/* 
	 * function : home
	 * role : �ʱ�ȭ�鿡 ����·� ��Ÿ���� ���� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/index.do")
	public ModelAndView home() {
		setModelname("index");
		return getModel();
	}
}