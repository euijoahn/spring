package com.kt.swe.DAO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOService implements BoardDAO{

	@Autowired
	private SqlSession sqlSession;

	
	@Override
	public List<Boards> selectBoard(String BoardAttributeNum) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		List<Boards> result = boardmapper.selectBoard(BoardAttributeNum);
		return result;
	}
	
	
	@Override
	public void insertBoard(Boards board) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.insertBoard(board);
	}


	@Override
	public Boards selectoneBoard(int ContentAttributeNum) {
		Boards board = new Boards();
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		board = boardmapper.selectoneBoard(ContentAttributeNum);
		return board;
	}


	@Override
	public void deleteBoard(int ContentAttributeNum) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.deleteBoard(ContentAttributeNum);
	}


	@Override
	public void updateBoard(int ContentAttributeNum, String ContentTitle, String Content){
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.updateBoard(ContentAttributeNum, ContentTitle, Content);
	}


	@Override
	public int selectBoardcount() {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		int result = (int)boardmapper.selectBoardcount();
		return result;
	}


	@Override
	public void deleteoneattributeBoard(String BoardAttributeNum) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.deleteoneattributeBoard(BoardAttributeNum);
	}

}