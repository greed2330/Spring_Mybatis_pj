package com.spring.mvc_mybatis.ch06.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc_mybatis.ch06.dto.UserDTO_6;


@Repository
public class UserDAOImpl_ch06 implements UserDAO_ch06{

	@Autowired
	private SqlSession sqlSession;
	
	//목록조회
	@Override
	public List<UserDTO_6> selectUserList() {
		List<UserDTO_6> list = sqlSession.selectList("com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06.selectUserList");
		return list;
	}
	
	//1건조회
	@Override
	public UserDTO_6 selectUser(int userId) {
		return sqlSession.selectOne("com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06.selectUser", userId);
	}

	//insert후 목록조회
	@Override
	public int insertUser(UserDTO_6 dto) {
		return sqlSession.insert("com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06.insertUser", dto);
	}

	
	//update후 목록조회
	@Override
	public int updateUser(UserDTO_6 dto) {
		return sqlSession.update("com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06.updateUser", dto);
	}
	
	//delete후 목록조회
	@Override
	public int deleteUser(int userId) {
		return sqlSession.delete("com.spring.mvc_mybatis.ch06.dao.UserDAO_ch06.deleteUser", userId);
	}
}
