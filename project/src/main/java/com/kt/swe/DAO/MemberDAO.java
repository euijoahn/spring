package com.kt.swe.DAO;

import java.util.ArrayList;

public interface MemberDAO {
	ArrayList<Members> allMember();
	Members selectMember(String id);
	void deleteMember(String id);
	void insertMember(Members member);
	void updateMember(Members member);
}
