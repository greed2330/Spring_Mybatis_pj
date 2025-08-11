package com.spring.mvc_mybatis.ch03.dto;

import java.sql.Date;
import java.util.List;

//1:다수 => UserDTO_2(부모T) : BoardDTO(자식T) => user 1명이 게시글 여러개를 가지고 있다.(1:다 관계)
public class UserDTO_3 {
	private int userId;	//PK => mvc_user_tbl - user_id
	private String userName;
	private Date regDate;
	private List<BoardDTO_3> boardDTO;	// mvc_board_tbl 내포 - user_id가 FK
	
	public UserDTO_3() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserDTO_3(int userId, String userName, Date regDate, List<BoardDTO_3> boardDTO) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.regDate = regDate;
		this.boardDTO = boardDTO;
	}
//	CREATE TABLE mvc_user_tbl(
//	user_id 	NUMBER(2) PRIMARY KEY,
//	user_name   VARCHAR2(30),
//	reg_date    DATE
//);

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public List<BoardDTO_3> getBoardDTO() {
		return boardDTO;
	}

	public void setBoardDTO(List<BoardDTO_3> boardDTO) {
		this.boardDTO = boardDTO;
	}
	
	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userName=" + userName + ", regDate=" + regDate + ", boardDTO="
				+ boardDTO + "]";
	}
	
}
