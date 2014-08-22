package com.kt.swe.DAO;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LogDAOService implements LogDAO{

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insertLog(Logs log) {
		LogMapper logmapper = sqlSession.getMapper(LogMapper.class);
		logmapper.insertLog(log);
	}
	
}