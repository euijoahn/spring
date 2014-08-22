package com.kt.swe.DAO;

import java.util.ArrayList;

public interface BoardInfoDAO{
	ArrayList<BoardInfo> allBoard();
	BoardInfo oneBoard(String boardTitle);
	BoardInfo oneattributeBoard(String boardAttributeNum);
	int count();
	void insertBoard(BoardInfo boardinfo);
	void deleteBoard(String boardAttributeNum);
	void updatenumberofboard(BoardInfo boardinfo);
}