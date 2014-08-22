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
	public Members selectMember(String id){
		Members result = null;
		MemberMapper membermapper = sqlSession.getMapper(MemberMapper.class);
		result = membermapper.selectMember(id);
		return result;
	}

	@Override
	public void deleteMember(String id) {
		MemberMapper membermapper = sqlSession.getMapper(MemberMapper.class);
		membermapper.deleteMember(id);
	}

	@Override
	public void insertMember(Members member) {
		MemberMapper membermapper = sqlSession.getMapper(MemberMapper.class);
	    membermapper.insertMember(member);
	}

	@Override
	public void updateMember(Members member) {
		MemberMapper membermapper = sqlSession.getMapper(MemberMapper.class);
		membermapper.updateMember(member);
	}
}
