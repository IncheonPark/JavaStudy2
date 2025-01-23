package com.kakao.app.users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kakao.app.utils.DBConnection;

public class UserDAO {
	
	
	// 1. 유저 가입하기 (추가 : DB의 insert)
	
	public int join (UserDTO userDTO) throws Exception  {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO USERS "
				+ " VALUES (?, ?, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, userDTO.getUserName());
		st.setString(2, userDTO.getPassword());
		st.setString(3, userDTO.getName());
		st.setString(4, userDTO.getPhone());
		st.setString(5, userDTO.getEmail());
		
		int checkNum = st.executeUpdate(); // 실행된 row의 갯수를 반환한다.
		
		
		DBConnection.disConnect(st, con);
		return checkNum;
		
		
	}
	
	
	// 2. 회원들의 목록을 조회하기, 단, password는 제외하고 나머지 정보 가져오기
	
	public List<UserDTO> getList() throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM USERS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<UserDTO> list = new ArrayList<>();
		
		while(rs.next()) {			
			UserDTO dto = new UserDTO();
			dto.setUserName(rs.getString(1));
			//dto.setPassword(rs.getString(2));
			dto.setName(rs.getString(3));
			dto.setPhone(rs.getString(4));
			dto.setEmail(rs.getString(5));
			
			list.add(dto);
		}
		
		
		DBConnection.disConnect(rs, st, con);
		return list;
		
	}
	
	
	// 3. 회원의 ID로 회원 한명의 모든 정보를 조회하기
	
	public UserDTO getDetail(UserDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM USERS WHERE USERNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, inputDto.getUserName());
		
		ResultSet rs = st.executeQuery();
		
		UserDTO dto = new UserDTO();
		
		while (rs.next()) {
			dto.setUserName(rs.getString(1));
			dto.setPassword(rs.getString(2));
			dto.setName(rs.getString(3));
			dto.setPhone(rs.getString(4));
			dto.setEmail(rs.getString(5));
			
		}
		
		DBConnection.disConnect(rs, st, con);
		return dto;
		
	}
	
	
	

}
