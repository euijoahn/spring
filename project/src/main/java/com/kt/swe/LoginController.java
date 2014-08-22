/* 
 * class : LoginController
 * role : �α��ο� ��õ� ���� �ϴ� ControllerŬ����
 */
package com.kt.swe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.BoardInfo;
import com.kt.swe.DAO.BoardInfoDAOService;
import com.kt.swe.DAO.LogDAOService;
import com.kt.swe.DAO.Logs;
import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
@SessionAttributes("member")
public class LoginController extends CommonController{

	@Autowired
	private MemberDAOService memberdaoservice;
	
	@Autowired
	private BoardInfoDAOService boardinfodaoservice;
	
	@Autowired
	private LogDAOService logdaoservice;
	
	/* 
	 * function : login
	 * role : �α��� �������� ��µǵ����ϴ� Controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/login.do")
	public ModelAndView login() {
		setModelname("login");
		return getModel();
	}
	
	/* 
	 * function : logincheck
	 * role : Login�ÿ� �´°��� ���� jsp�������� ����ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/logincheck.do")
	public ModelAndView logincheck(@RequestParam("ID") String id, 
												@RequestParam("Password") String password){
		Authenticator auth = new Authenticator();
		boolean check = false;
		Members member = new Members();
		
		try{
			auth.setPwd(password);
			auth.setCheckpwd(memberdaoservice.selectMember(id).getPassword());
			member.setID(id);
			check = auth.check();
			setModelObject("member", member);
			setModelObject("check", check);
			setModelname("check");
		}catch(NullPointerException e){
			setModelname("loginfail");
		}
		return getModel();
	}
	
	/* 
	 * function : loginsuccess
	 * role : �ùٸ��� �Է��ؼ� ������ �������� �����ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/loginsuccess.do")
	public ModelAndView loginsuccess(@ModelAttribute("member") Members member){
		List<BoardInfo> board = boardinfodaoservice.allBoard();
		
		Logs log = new Logs();
		log.setID(member.getID());
		log.setnum(1);
		logdaoservice.insertLog(log);
		
		setModelObject("board", board);
		setModelname("loginsuccess");
		return getModel();
	}
	
	/* 
	 * function : loginfail
	 * role : �߸��Է��ؼ� ������ �������� �����ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/loginfail.do")
	public ModelAndView loginfail(){
		setModelname("loginfail");
		return getModel();
	}
}