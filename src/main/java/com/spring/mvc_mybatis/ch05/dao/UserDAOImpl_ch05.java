package com.spring.mvc_mybatis.ch05.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch05.dto.UserDTO_5;

@Repository
public class UserDAOImpl_ch05 implements UserDAO_ch05{

	@Autowired
	private SqlSession sqlSession;
	
	//목록조회
	@Override
	public List<UserDTO_5> selectUserList() {
		List<UserDTO_5> list = sqlSession.selectList("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.selectUserList");
		return list;
	}
	
	//1건조회
	@Override
	public UserDTO_5 selectUser(int userId) {
		return sqlSession.selectOne("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.selectUser", userId);
	}

	//insert후 목록조회
	@Override
	public int insertUser(UserDTO_5 dto) {
		return sqlSession.insert("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.insertUser", dto);
	}

	
	//update후 목록조회
	@Override
	public int updateUser(UserDTO_5 dto) {
		return sqlSession.update("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.updateUser", dto);
	}
	
	//delete후 목록조회
	@Override
	public int deleteUser(int userId) {
		return sqlSession.delete("com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05.deleteUser", userId);
	}
}
