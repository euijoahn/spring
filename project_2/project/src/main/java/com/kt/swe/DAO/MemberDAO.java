package com.kt.swe.DAO;

import java.util.ArrayList;

public interface MemberDAO {
	ArrayList<Members> allMember();
	Members oneMember();
	void insMember(Members member);
	void updMember(String ID);
	void delMember(String ID);
}
