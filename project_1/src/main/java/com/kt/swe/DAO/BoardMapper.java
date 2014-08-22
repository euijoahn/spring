package com.kt.swe.DAO;

import java.util.List;

public interface BoardMapper{
	List<Boards> selectBoard(String BoardAttributeNum);
	void insertBoard(Boards board);
	Boards selectoneBoard(int ContentAttributeNum);
	void deleteBoard(int ContentAttributeNum);
	void updateBoard(int ContentAttributeNum, String ContextTitle, String Context);
	int selectBoardcount();
	void deleteoneattributeBoard(String BoardAttributeNum);
}