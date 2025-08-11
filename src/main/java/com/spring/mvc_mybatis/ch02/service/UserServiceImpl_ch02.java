package com.spring.mvc_mybatis.ch02.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.spring.mvc_mybatis.ch02.dao.UserDAO_ch02;
import com.spring.mvc_mybatis.ch02.dto.UserDTO_2;

@Service
public class UserServiceImpl_ch02 implements UserService_ch02{
	
	@Autowired
	private UserDAO_ch02 userDAO;
	
	@Override
	public void getBoardInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		List<UserDTO_2> list = userDAO.getBoardInfo_1();
		
		model.addAttribute("list", list);
	}

	@Override
	public void getBoardInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException {
		List<UserDTO_2> list = userDAO.getBoardInfo_2();
		
		model.addAttribute("list", list);
	}

}
