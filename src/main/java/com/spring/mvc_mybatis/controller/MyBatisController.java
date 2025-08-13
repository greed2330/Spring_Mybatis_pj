package com.spring.mvc_mybatis.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mvc_mybatis.ch01.service.UserServiceImpl_ch01;
import com.spring.mvc_mybatis.ch02.service.UserServiceImpl_ch02;
import com.spring.mvc_mybatis.ch03.service.UserService_ch03;
import com.spring.mvc_mybatis.ch04.service.UserService_ch04;
import com.spring.mvc_mybatis.ch05.service.UserService_ch05;
import com.spring.mvc_mybatis.ch06.service.UserService_ch06;

@Controller
public class MyBatisController {
	private static final Logger logger = LoggerFactory.getLogger(MyBatisController.class);
	
	@Autowired
	private UserServiceImpl_ch01 service1;
	
	@Autowired
	private UserServiceImpl_ch02 service2;
	
	@Autowired
	private UserService_ch03 service3;
	
	@Autowired
	private UserService_ch04 service4;
	
	@Autowired
	private UserService_ch05 service5;
	
	@Autowired
	private UserService_ch06 service6;
	
	//ch01 -------------------
	//ch01 user:address => 1:1 => assocation
	@RequestMapping("/getAddressInfo_1")
	public String getAddressInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
		throws ServletException, IOException{
		logger.info("url => /getAddressInfo_1");
		
		service1.getAddressInfo_1(request, response, model);
		
		return "address/getAddressInfo";
	}
	
	//ch02 -------------------
	//ch02 user:board => 1:다수 => collection
	@RequestMapping("/getAddressInfo_2")
	public String getAddressInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
		throws ServletException, IOException{
		logger.info("url => /getAddressInfo_2");
		
		service1.getAddressInfo_2(request, response, model);
		
		return "address/getAddressInfo";
	}
	
	@RequestMapping("/getBoardInfo_1")
	public String getBoardInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getBoardInfo_1");
		
		service2.getBoardInfo_1(request, response, model);
		
		return "board/getUserBoardInfo";
	}
	
	@RequestMapping("/getBoardInfo_2")
	public String getBoardInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getBoardInfo_2");
		
		service2.getBoardInfo_2(request, response, model);
		
		return "board/getUserBoardInfo";
	}
	
	// ch03---------------------------------------------
	// ch03. 동적 SQL => 중요
	@RequestMapping("/getSearchInfo_1")
	public String getSearchInfo_1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getSearchInfo_1");
		
		service3.getSearchInfo_1(request, response, model);
		
		return "search/getSearchInfo";
	}
	
	@RequestMapping("/getSearchInfo_2")
	public String getSearchInfo_2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getSearchInfo_2");
		
		service3.getSearchInfo_2(request, response, model);
		
		return "search/getSearchInfo";
	}
	
	@RequestMapping("/getSearchInfo_3")
	public String getSearchInfo_3(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getSearchInfo_2");
		
		service3.getSearchInfo_3(request, response, model);
		
		return "search/getSearchInfo";
	}
	
	@RequestMapping("/updateUser")
	public String updateUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /updateUser");
		
		service3.updateUser(request, response, model);
		
		return "search/getSearchInfo2";
	}
	
	@RequestMapping("/getUserSearchInfo")
	public String getUserSearchInfo(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserSearchInfo");
		
		service3.getUserSearchInfo(request, response, model);
		
		return "search/getUserSearchInfo";
	}
	
	// ch04 ---------------------------------------------
	// ch04. 배열, List
	// 1.collection="멤버변수"인 경우
	@RequestMapping("/getUserSearchInfo1")
	public String getUserSearchInfo1(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserSearchInfo1");
		service4.getUserInfo1(request, response, model);
		
		return "array/array1";
	}
	
	// 2.collection="array"인 경우
	@RequestMapping("/getUserSearchInfo2")
	public String getUserSearchInfo2(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserSearchInfo2");
		
		service4.getUserInfo2(request, response, model);
		
		return "array/array2";
	}
	
	// 2.collection="list"인 경우
	@RequestMapping("/getUserSearchInfo3")
	public String getUserSearchInfo3(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserSearchInfo3");
		
		service4.getUserInfo3(request, response, model);
		
		return "array/array3";
	}
	
	// ch05 ---------------------------------------------
	@RequestMapping("/getUserList")
	public String getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserList");
		
		service5.getUserList(request, response, model);
		
		return "user/getUserList";
	}
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserList");
		
		service5.getUser(request, response, model);
		
		return "user/getUserList2";
	}
	
	@RequestMapping("/insertUserList")
	public String insertUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /insertUserList");
		
		service5.insertUserList(request, response, model);
		
		return "user/getUserList3";
	}
	
	@RequestMapping("/updateUserList")
	public String updateUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /updateUserList");
		
		service5.updateUserList(request, response, model);
		
		return "user/getUserList3";
	}
	
	@RequestMapping("/deleteUserList")
	public String deleteUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /updateUserList");
		
		service5.deleteUserList(request, response, model);
		
		return "user/getUserList3";
	}
			
	//ch06---------------------------------------
	@RequestMapping("/ch06_getUserList")
	public String ch06_getUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserList");
		
		service6.getUserList(request, response, model);
		
		return "user/getUserList";
	}
	
	@RequestMapping("/ch06_getUser")
	public String ch06_getUser(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /getUserList");
		
		service6.getUser(request, response, model);
		
		return "user/getUserList2";
	}
	
	@RequestMapping("/ch06_insertUserList")
	public String ch06_insertUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /insertUserList");
		
		service6.insertUserList(request, response, model);
		
		return "user/getUserList3";
	}
	
	@RequestMapping("/ch06_updateUserList")
	public String ch06_updateUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /updateUserList");
		
		service6.updateUserList(request, response, model);
		
		return "user/getUserList3";
	}
	
	@RequestMapping("/ch06_deleteUserList")
	public String ch06_deleteUserList(HttpServletRequest request, HttpServletResponse response, Model model)
			throws ServletException, IOException{
		logger.info("url => /updateUserList");
		
		service6.deleteUserList(request, response, model);
		
		return "user/getUserList3";
	}
}