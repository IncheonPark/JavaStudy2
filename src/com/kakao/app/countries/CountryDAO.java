package com.kakao.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.kakao.app.utils.DBconnection;

public class CountryDAO {
	
	
	//
	public void getList() throws Exception {
		
		Connection connection = DBconnection.getConnection();
		String sql = "select * from countries";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		DBconnection.disConnect(rs, st, connection);
		
	}
	
	
	//
	public CountryDTO getDetail() throws Exception {
		
		CountryDTO countryDTO = null;
		Connection connection = DBconnection.getConnection();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력할 지역 ID를 입력하세요. (숫자)");
		int select = sc.nextInt();		
		String sql = "select * from countries where REGION_ID = " + select;
		
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			countryDTO = new CountryDTO();
			countryDTO.setCountry_id(rs.getString(1));
			countryDTO.setCountry_name(rs.getString(2));
			countryDTO.setRegion_id(rs.getInt(3));
			
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		return countryDTO;
		
	}
	
	
	

}
