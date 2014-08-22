/* 
 * class : JoinController
 * role : controller of join
 */
package com.kt.swe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
public class JoinController extends CommonController{
	
	@Autowired
	private MemberDAOService memberDAOService;
	
	/* 
	 * function : join
	 * role : ȭ�鿡 ���� �� �� �ִ� �������� ����ϴ� controller 
	 * return type : ModelAndView
	 */
	@RequestMapping("/join.do")
	public ModelAndView join(){
		setModelname("join");
		return getModel();
	}
	
	/* 
	 * function : joincheck
	 * role : ���� ���������� �Է¹��� ���� �����ͺ��̽��� �����Ű�� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/joincheck.do")
	public ModelAndView joincheck(@RequestParam("inputID") String id,
							@RequestParam("inputPassword") String password,
							@RequestParam("Name") String name,
							@RequestParam("Phonenum") String phonenum){
		Joincomfirm join = new Joincomfirm();
		Members checkmember = new Members();
		Members member = new Members();
		String getId = null;
		
		setModel(join.comfirm(id, password, name, phonenum));
		
		try{
			checkmember = memberDAOService.selectMember(id);
			getId = checkmember.getID();
			setModelname("joinfailed");
		}catch(NullPointerException e){
			if(getModelname().equals("joincomplete")){
				member.setID(id);
				member.setName(name);
				member.setPassword(password);
				member.setPhone_num(phonenum);
				memberDAOService.insertMember(member);
				String message = "Join";
				setModelObject("message", message);
			}
		}
		return getModel();
	}
}