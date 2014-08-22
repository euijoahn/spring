package com.kt.swe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
public class JoinController{
	
	@Autowired
	private MemberDAOService memberDAOService;
	
	@RequestMapping("/join.do")
	public ModelAndView join(){
		ModelAndView mav = new ModelAndView("join");
		return mav;
	}
	
	@RequestMapping("/joincheck.do")
	public ModelAndView join(@RequestParam("ID") String id,
							@RequestParam("Password") String password,
							@RequestParam("Name") String name,
							@RequestParam("Phonenum") String phonenum){
		ModelAndView mav = new ModelAndView();
		Joincomfirm join = new Joincomfirm();
		mav = join.main(id, password, name, phonenum);
		
		if(mav.getViewName().equals("joincomplete")){
			Members member = new Members();
			member.setID(id);
			member.setName(name);
			member.setPassword(password);
			member.setPhone_num(phonenum);
			memberDAOService.insertMember(member);
			String message = "Join";
			mav.addObject("message", message);
		}
		return mav;
	}
}