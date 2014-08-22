package com.kt.swe.DAO;

import java.util.ArrayList;

public interface BoardInfoMapper{
	ArrayList<BoardInfo> allBoard();
	void insertBoard(BoardInfo boardinfo);
	BoardInfo oneBoard(String BoardTitle);
	void deleteBoard(String BoardAttributeNum);
}