package com.kt.swe;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.BoardDAOService;
import com.kt.swe.DAO.BoardInfo;
import com.kt.swe.DAO.BoardInfoDAOService;
import com.kt.swe.DAO.Boards;
import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
public class BoardController{
	
	@Autowired
	private MemberDAOService memberdaoservice;
	
	@Autowired
	private BoardDAOService boarddaoservice;
	
	@Autowired
	private BoardInfoDAOService boardinfodaoservice;
	
	@RequestMapping("/board.do")
	public ModelAndView board(@RequestParam("Title") String title){
		BoardInfo num = boardinfodaoservice.oneBoard(title);
		List<Boards> result = boarddaoservice.selectBoard(num.getBoardAttributeNum());
		ModelAndView mav = duplicate();
		mav.setViewName("board");
		mav.addObject("title", title);
		mav.addObject("result", result);
		return mav;
	}
	
	@RequestMapping("/attendBoard.do")
	public ModelAndView boardattend(){
		ModelAndView mav = new ModelAndView("attendboard");
		return mav;
	}
	
	@RequestMapping("/attendBoardcomplete.do")
	public ModelAndView boardattendcomplete(@RequestParam("board") String board,
									@RequestParam("id") String id){
		ModelAndView mav = duplicate();
		BoardInfo boardinfo = new BoardInfo();
		String message = "attend ";
		boardinfo.setBoardAttributeNum("D");
		boardinfo.setBoardTitle(board);
		boardinfo.setUser(memberdaoservice.selectMember(id).getName());
		boardinfodaoservice.insertBoard(boardinfo);
		mav.addObject("message", message);
		mav.setViewName("attendboardcomplete");
		return mav;
	}
	
	@RequestMapping("/deleteattendedBoard.do")
	public ModelAndView deleteattendedboard(@RequestParam("title") String title){
		ModelAndView mav = duplicate();
		BoardInfo boardinfo = boardinfodaoservice.oneBoard(title);
		String message = "delete ";
		boarddaoservice.deleteoneattributeBoard(boardinfo.getBoardAttributeNum());
		boardinfodaoservice.deleteBoard(boardinfo.getBoardAttributeNum());
		mav.addObject("message", message);
		mav.setViewName("deleteattendboard");
		return mav;
	}
	
	@RequestMapping("/selectBoard.do")
	public ModelAndView selectboard(@RequestParam("num") int num){
		Boards board1 = null;
		ModelAndView mav = duplicate();
		board1 = boarddaoservice.selectoneBoard(num);
		mav.setViewName("selboard");
		mav.addObject("oneboard", board1);
		return mav;
	}
	
	@RequestMapping("/insertBoard.do")
	public ModelAndView insertboard(@RequestParam("title") String title){
		ModelAndView mav = duplicate();
		mav.setViewName("insboard");
		mav.addObject("title", title);
		return mav;
	}
	
	@RequestMapping("/insertcompleteBoard.do")
	public ModelAndView insertcompleteboard(@RequestParam("board") String boardname,
											@RequestParam("title") String title,
											@RequestParam("id") String id,
											@RequestParam("content") String content) throws UnknownHostException{
		ModelAndView mav = duplicate();
		Boards board = new Boards();
		BoardInfo number = boardinfodaoservice.oneBoard(boardname);
		Members member = memberdaoservice.selectMember(id);
		InetAddress net = InetAddress.getLocalHost();
		String message = "Insert Board";
		
		board.setContentAttributeNum(7);
		board.setBoardAttributeNum(number.getBoardAttributeNum());
		board.setCreatorID(id);
		board.setCreator(member.getName());
		board.setContentTitle(title);
		board.setContent(content);
		board.setIP(net.getHostAddress());
		board.setHit(0);
		boarddaoservice.insertBoard(board);
		mav.setViewName("insertcompleteboard");
		mav.addObject("message", message);
		return mav;
	}
	
	@RequestMapping("/deleteBoard.do")
	public ModelAndView deleteboard(@RequestParam("num") int num){
		ModelAndView mav = duplicate();
		boarddaoservice.deleteBoard(num);
		mav.setViewName("loginsuccess");
		return mav;
	}
	
	@RequestMapping("/editBoard.do")
	public ModelAndView ediboard(@RequestParam("num") int num){
		ModelAndView mav = duplicate();
		Boards board1 = boarddaoservice.selectoneBoard(num);
		mav.setViewName("ediboard");
		mav.addObject("board1", board1);
		return mav;
	}
	
	@RequestMapping("/editCompleteBoard.do")
	public ModelAndView ediboard1(@RequestParam("num") int num,
									@RequestParam("title") String title,
									@RequestParam("context") String context){
		ModelAndView mav = duplicate();
		boarddaoservice.updateBoard(num, title, context);
		mav.setViewName("ediboardcomplete");
		Boards board1 = boarddaoservice.selectoneBoard(num);
		mav.addObject("oneboard", board1);
		return mav;
	}
	
	public ModelAndView duplicate(){
		ModelAndView mav = new ModelAndView();
		List<BoardInfo> board = boardinfodaoservice.allBoard();
		mav.addObject("board", board);
		return mav;
	}
}