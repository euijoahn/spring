/* 
 * class : LogoutController
 * role : ���������� �������� ���� controller ������
 */
package com.kt.swe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.LogDAOService;
import com.kt.swe.DAO.Logs;

@Controller
public class LogoutController extends CommonController{
	
	@Autowired
	private LogDAOService logdaoservice;
	 
	/* 
	 * function : logout
	 * role : ���������� ���� index�������� �������� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/logout.do")
	public ModelAndView logout(@RequestParam("id") String id){
		Logs log = new Logs();
		log.setID(id);
		log.setnum(2);
		logdaoservice.insertLog(log);
		
		setModelname("logout");
		return getModel();
	}
}