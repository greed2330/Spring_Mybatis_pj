package com.spring.mvc_mybatis.ch05.service;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mvc_mybatis.ch05.dao.UserDAO_ch05;
import com.spring.mvc_mybatis.ch05.dto.UserDTO_5;

@Service
public class UserServiceImpl_ch05 implements UserService_ch05{

	@Autowired
	private UserDAO_ch05 dao;
	
	@Override
	public void getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("UserServiceImpl_ch05 - getUserList");
		
		List<UserDTO_5> list = dao.selectUserList();
		model.addAttribute("list", list);
	}

	@Override
	public void getUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("UserServiceImpl_ch05 - getUser");
		
		UserDTO_5 dto = dao.selectUser(1);
		
		model.addAttribute("dto", dto);
	}

	@Override
	public void insertUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("UserServiceImpl_ch05 - insertUserList");
		
		UserDTO_5 dto = new UserDTO_5(4, "사람", Date.valueOf("2025-08-13"));
		
		int cnt = dao.insertUser(dto);
		model.addAttribute("cnt", cnt);
		
		//목록조회
		List<UserDTO_5> list = dao.selectUserList();
		model.addAttribute("list", list);
	}

	@Override
	public void updateUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		System.out.println("UserServiceImpl_ch05 - updateUserList");
		
		UserDTO_5 dto = new UserDTO_5(3, "조국", Date.valueOf("2025-08-15"));
		
		int cnt = dao.updateUser(dto);
		model.addAttribute("cnt", cnt);
		
		//목록조회
		List<UserDTO_5> list = dao.selectUserList();
		model.addAttribute("list", list);
	}

	@Override
	public void deleteUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		
		int cnt = dao.deleteUser(3);
		model.addAttribute("cnt", cnt);
		
		//목록조회
		List<UserDTO_5> list = dao.selectUserList();
		model.addAttribute("list", list);
		
	}
	
}
