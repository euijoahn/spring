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
	public List<Boards> selectBoard(String boardAttributeNum) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		List<Boards> result = boardmapper.selectBoard(boardAttributeNum);
		return result;
	}
	
	@Override
	public Boards selectoneBoard(Boards board) {
		Boards board1 = new Boards();
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		board1 = boardmapper.selectoneBoard(board);
		return board1;
	}

	@Override
	public void insertBoard(Boards board) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.insertBoard(board);
	}

	@Override
	public void deleteBoard(Boards board) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.deleteBoard(board);
	}


	@Override
	public void updateBoard(Boards board){
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.updateBoard(board);
	}



	@Override
	public void deleteoneattributeBoard(String boardAttributeNum) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.deleteoneattributeBoard(boardAttributeNum);
	}


	@Override
	public void updatehit(Boards board) {
		BoardMapper boardmapper = sqlSession.getMapper(BoardMapper.class);
		boardmapper.updatehit(board);
	}

}