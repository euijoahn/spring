package com.kt.swe.DAO;

import java.util.List;

public interface BoardDAO{
	List<Boards> selectBoard(String boardAttributeNum);
	Boards selectoneBoard(Boards board);
	void insertBoard(Boards board);
	void deleteBoard(Boards board);
	void updateBoard(Boards board);
	void deleteoneattributeBoard(String boardAttributeNum);
	void updatehit(Boards board);
}