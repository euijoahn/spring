package com.kt.swe.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOService implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;

	@Override
	public ArrayList<Members> allMember() {
		ArrayList<Members> result = new ArrayList<Members>();
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		result = memberMapper.allMember();
		return result;
	}

	@Override
	public Members oneMember() {
		Members result = new Members();
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
		result = memberMapper.oneMember();		
		return result;
	}

	@Override
	public void insMember(Members member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updMember(String ID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delMember(String ID) {
		// TODO Auto-generated method stub
		
	}
}
