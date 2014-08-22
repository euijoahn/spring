package com.kt.swe.DAO;

import java.util.ArrayList;

public interface MemberDAO {
	ArrayList<Members> allMember();
	Members selectMember(String ID);
	void insertMember(Members member);
	void updateMember(Members member);
	void deleteMember(String ID);
}
