package com.kt.swe.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardInfoDAOService implements BoardInfoDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public ArrayList<BoardInfo> allBoard() {
		ArrayList<BoardInfo> result = new ArrayList<BoardInfo>();
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		result = boardInfomapper.allBoard();
		return result;
	}
	
	@Override
	public BoardInfo oneBoard(String boardTitle) {
		BoardInfo boardinfo = new BoardInfo();
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		boardinfo = boardInfomapper.oneBoard(boardTitle);
		return boardinfo;
	}

	@Override
	public BoardInfo oneattributeBoard(String boardAttributeNum) {
		BoardInfo boardinfo = new BoardInfo();
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		boardinfo = boardInfomapper.oneattributeBoard(boardAttributeNum);	
		return boardinfo;
	}
	
	@Override
	public void insertBoard(BoardInfo boardinfo) {
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		boardInfomapper.insertBoard(boardinfo);
	}

	@Override
	public void deleteBoard(String boardAttributeNum) {
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		boardInfomapper.deleteBoard(boardAttributeNum);
	}

	@Override
	public void updatenumberofboard(BoardInfo boardinfo) {
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		boardInfomapper.updatenumberofboard(boardinfo);
	}

	@Override
	public int count() {
		BoardInfoMapper boardInfomapper = sqlSession.getMapper(BoardInfoMapper.class);
		int number = boardInfomapper.count();
		return number;
	}
}