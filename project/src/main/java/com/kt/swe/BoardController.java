/*
 * class : BoardController
 * role : Controller of Board(insert, delete, update)
 */
package com.kt.swe;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.kt.swe.DAO.BoardDAOService;
import com.kt.swe.DAO.BoardInfo;
import com.kt.swe.DAO.BoardInfoDAOService;
import com.kt.swe.DAO.Boards;
import com.kt.swe.DAO.LogDAOService;
import com.kt.swe.DAO.Logs;
import com.kt.swe.DAO.MemberDAOService;
import com.kt.swe.DAO.Members;

@Controller
@SessionAttributes("member") //member��� ��ü�� ModelAttribute("member")�� ����� ���ǿ� ����
public class BoardController extends CommonController{
	
	@Autowired
	private MemberDAOService memberdaoservice;
	
	@Autowired
	private BoardDAOService boarddaoservice;
	
	@Autowired
	private BoardInfoDAOService boardinfodaoservice;
	
	@Autowired
	private LogDAOService logdaoservice;

	/* 
	 * function : board
	 * role : �α��� �Ŀ� ó������ ������ Board�� �����͸� ó��
	 * return type : ModelAndView
	 */
	@RequestMapping("/board.do")
	public ModelAndView board(@RequestParam("Title") String title,
							@RequestParam("id") String id){
		Members member = new Members();
		BoardInfo num = boardinfodaoservice.oneBoard(title);
		List<Boards> result = boarddaoservice.selectBoard(num.getBoardAttributeNum());
		setModel(duplicate());
		
		member.setID(id);
		setModelname("board");
		setModelObject("member", member);
		setModelObject("title", title);
		setModelObject("result", result);
		return getModel();
	}
	
	/* 
	 * function : boardattend
	 * role : �Խ����� �߰��ϱ� ���ؼ� ���� controller, �Է¹��� �������� ���
	 * return type : ModelAndView
	 */
	@RequestMapping("/attendBoard.do")
	public ModelAndView boardattend(@ModelAttribute("member") Members member){
		setModelname("attendboard");
		return getModel();
	}
	
	/* 
	 * function : boardattendcomplete
	 * role : �Խ����� �߰��Ҷ� �Է¹��� ������ �����ͺ��̽��� insert�ϱ� ���� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/attendBoardcomplete.do")
	public ModelAndView boardattendcomplete(@RequestParam("board") String board,
									@ModelAttribute("member") Members member){
		setModel(duplicate());
		BoardInfo boardinfo = new BoardInfo();
		String message = "attend ";
		
		Logs log = new Logs();
		log.setID(member.getID());
		log.setnum(6);
		logdaoservice.insertLog(log);
		
		boardinfo.setBoardAttributeNum("D");
		boardinfo.setBoardTitle(board);
		boardinfo.setUser(member.getID());
		boardinfo.setnumberofboard(0);
		boardinfodaoservice.insertBoard(boardinfo);
		setModelObject("message", message);
		setModelname("attendboardcomplete");
		return getModel();
	}
	
	/* 
	 * function : deleteattendBoard
	 * role : �Խ����� �����ϱ� ���ؼ� �����ͺ��̽��� delete����� ������ controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/deleteattendedBoard.do")
	public ModelAndView deleteattendedboard(@RequestParam("title") String title, 
											@ModelAttribute("member") Members member){
		setModel(duplicate());
		BoardInfo boardinfo = boardinfodaoservice.oneBoard(title);
		String message = "delete ";
		
		Logs log = new Logs();
		log.setID(member.getID());
		log.setnum(7);
		logdaoservice.insertLog(log);
		
		boarddaoservice.deleteoneattributeBoard(boardinfo.getBoardAttributeNum());
		boardinfodaoservice.deleteBoard(boardinfo.getBoardAttributeNum());
		setModelObject("message", message);
		setModelname("deleteattendboard");
		return getModel();
	}
	
	/* 
	 * function : selectboard
	 * role : ������ �Խù��� �ڼ��ϰ� ���� ���ؼ� ������ �Խù������� �ҷ����� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/selectBoard.do")
	public ModelAndView selectboard(@RequestParam("num") int num,
									@RequestParam("param") String param,
									@ModelAttribute("member") Members member){
		setModel(duplicate());
		Boards board1 = new Boards();
		Boards board2 = new Boards();
		int hit;
		Logs log = new Logs();
		
		board2.setContentAttributeNum(num);
		board2.setBoardAttributeNum(param);
		board1 = boarddaoservice.selectoneBoard(board2);
		hit = board1.getHit();
		board1.setHit(++hit);
		boarddaoservice.updatehit(board1);	
		log.setID(member.getID());
		log.setnum(3);
		logdaoservice.insertLog(log);
		setModelObject("oneboard", board1);
		setModelname("selectboard");
		return getModel();
	}
	
	/* 
	 * function : insertboard
	 * role : ���ο� �Խù��� �ø��� ���ؼ� �Է¹��� �������� ����ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/insertBoard.do")
	public ModelAndView insertboard(@RequestParam("title") String title,
									@ModelAttribute("member") Members member){
		setModel(duplicate());
		setModelObject("title", title);
		setModelname("insertboard");
		return getModel();
	}
	
	/* 
	 * function : board
	 * role : ���ο� �Խù��� �ø��� ���ؼ� �Է¹��� ������ �����ͺ��̽��� �Ѱ��ֱ� ���� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/insertcompleteBoard.do")
	public ModelAndView insertcompleteboard(@RequestParam("board") String boardname,
											@RequestParam("title") String title,
											@RequestParam("content") String content,
											@ModelAttribute("member") Members member) throws UnknownHostException{
		setModel(duplicate());
		Boards board = new Boards();
		BoardInfo number = boardinfodaoservice.oneBoard(boardname);
		InetAddress net = InetAddress.getLocalHost();
		String message = "Insert Board";
		String id = member.getID();
		String name = memberdaoservice.selectMember(id).getName();
		int attributenum = number.getnumberofboard();
		Logs log = new Logs();

		log.setID(member.getID());
		log.setnum(4);
		logdaoservice.insertLog(log);
		board.setContentAttributeNum(++attributenum);
		board.setBoardAttributeNum(number.getBoardAttributeNum());
		board.setCreatorID(id);
		board.setCreator(name);
		board.setContentTitle(title);
		board.setContent(content);
		board.setIP(net.getHostAddress());
		board.setHit(0);
		boarddaoservice.insertBoard(board);
		number.setnumberofboard(attributenum);
		boardinfodaoservice.updatenumberofboard(number);
		setModelname("insertcompleteboard");
		setModelObject("message", message);
		return getModel();
	}
	/* 
	 * function : deleteboard
	 * role : �Խõ� �Խù��� ����� ���� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/deleteBoard.do")
	public ModelAndView deleteboard(@RequestParam("num") int num,
									@RequestParam("param") String param,
									@ModelAttribute("member") Members member){
		setModel(duplicate());
		Boards board = new Boards();
		BoardInfo boardinfo = new BoardInfo();
		int number;
		
		boardinfo = boardinfodaoservice.oneattributeBoard(param);
		number = boardinfo.getnumberofboard();
		board.setBoardAttributeNum(param);
		board.setContentAttributeNum(num);
		boardinfo.setBoardAttributeNum(param);
		boardinfo.setnumberofboard(--number);
		boarddaoservice.deleteBoard(board);
		boardinfodaoservice.updatenumberofboard(boardinfo);
		setModelname("loginsuccess");
		return getModel();
	}
	
	/* 
	 * function : ediboard
	 * role : �ԽõǾ��ִ� �Խù��� ������ ��ȯ�ϱ� ���ؼ� edit �������� ����ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/editBoard.do")
	public ModelAndView editboard(@RequestParam("num") int num,
								@RequestParam("param") String param,
								@ModelAttribute("member") Members member){
		setModel(duplicate());
		Boards board2 = new Boards();
		Boards board1 = new Boards();
		
		board2.setBoardAttributeNum(param);
		board2.setContentAttributeNum(num);
		board1 = boarddaoservice.selectoneBoard(board2);
		setModelname("editboard");
		setModelObject("board1", board1);
		return getModel();
	}
	
	/* 
	 * function : editcompleteboard
	 * role : edit���������� ������ ������ �����ͺ��̽��� ������Ʈ �ϴ� controller
	 * return type : ModelAndView
	 */
	@RequestMapping("/editCompleteBoard.do")
	public ModelAndView editcompleteboard(@RequestParam("num") int num,
									@RequestParam("title") String title,
									@RequestParam("context") String context,
									@ModelAttribute("member") Members member){
		setModel(duplicate());
		Boards board = new Boards();
		Boards temp = new Boards();
		String message = "edit ";
		Logs log = new Logs();

		log.setID(member.getID());
		log.setnum(5);
		logdaoservice.insertLog(log);
		board.setContentAttributeNum(num);
		board.setContentTitle(title);
		board.setContent(context);
		boarddaoservice.updateBoard(board);
		temp.setContentAttributeNum(num);
		temp.setBoardAttributeNum(board.getBoardAttributeNum());
		Boards board1 = boarddaoservice.selectoneBoard(temp);
		setModelObject("oneboard", board1);
		setModelObject("message", message);
		setModelname("editboardcomplete");
		return getModel();
	}
	
	/* 
	 * function : duplicate
	 * role : ���� �޴����� �ߺ��Ǵ� �ڵ带 ��� ��Ƽ� �Լ��� ����
	 * return type : ModelAndView
	 */
	public ModelAndView duplicate(){
		List<BoardInfo> board = boardinfodaoservice.allBoard();
		setModelObject("board", board);
		return getModel();
	}
}