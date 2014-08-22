package com.kt.swe.DAO;

import java.util.ArrayList;

public interface MemberMapper {
	ArrayList<Members> allMember();
	Members selectMember(String id);
	void deleteMember(String id);
	void updateMember(Members member);
	void insertMember(Members member);
}