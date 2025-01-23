package com.kakao.app.accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kakao.app.utils.DBConnection;

public class AccountDAO {
	
	
	// 계좌 추가 insert
	public int insert(AccountDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO ACCOUNTS "
				+ " VALUES (?, ?, ?, ?, ? )";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, inputDto.getAccountNum());
		st.setString(2, inputDto.getUserName());
		st.setLong(3, inputDto.getProductNum());
		st.setLong(4, inputDto.getAccountBalance());
		st.setDate(5, inputDto.getAccountDate());
		
		int check = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		return check;
		
	}
	
	
	
	// 특정 회원의 계좌 리스트 조회
	public List<AccountDTO> getList(AccountDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, inputDto.getUserName());
		
		ResultSet rs = st.executeQuery();
		
		List<AccountDTO> list = new ArrayList<>();
		
		while(rs.next()) {			
			AccountDTO dto = new AccountDTO();
			dto.setAccountNum(rs.getString(1));
			dto.setUserName(rs.getString(2));
			dto.setProductNum(rs.getLong(3));
			dto.setAccountBalance(rs.getLong(4));
			dto.setAccountDate(rs.getDate(5));
			
			list.add(dto);
			
		}
		
		DBConnection.disConnect(rs, st, con);
		return list;
		
		
	}
	
	
	// 특정회원의 특정 계좌를 조회
	public AccountDTO getDetail(AccountDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM ACCOUNTS WHERE USERNAME = ? AND PRODUCTNUM = ? ";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(0, inputDto.getUserName());
		st.setLong(0, inputDto.getProductNum());
		
		ResultSet rs = st.executeQuery();
		
		AccountDTO dto = new AccountDTO();
		
		while (rs.next()) {			
			dto.setAccountNum(rs.getString(1));
			dto.setUserName(rs.getString(2));
			dto.setProductNum(rs.getLong(3));
			dto.setAccountBalance(rs.getLong(4));
			dto.setAccountDate(rs.getDate(5));
						
		}
		
		DBConnection.disConnect(rs, st, con);
		return dto;
		
	}
	
	
		
	// 특정 회원의 특정 계좌 잔액을 수정
	public int updateBalance(AccountDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE ACCOUNTS SET ACCOUNTBALANCE = ? "
				+ " WHERE USERNAME = ? AND PRODUCTNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, inputDto.getAccountBalance());
		st.setString(2, inputDto.getUserName());
		st.setLong(3, inputDto.getProductNum());
		
		int check = st.executeUpdate();
		
		
		DBConnection.disConnect(st, con);
		return check;
		
	}
	
	
	

}
