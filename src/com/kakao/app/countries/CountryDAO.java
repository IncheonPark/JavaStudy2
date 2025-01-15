package com.kakao.app.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.kakao.app.utils.DBconnection;

public class CountryDAO {
	
	// DAO > Data Access Object
		// DB의 데이터를 조회하거나, 입력, 수정, 삭제 기능
		
		// 1. 접속 정보 선언
		
		// 2. 커넥션 객체
		
		// 3. SQL문 생성
		
		// 4. 미리 보내기
		
		// 5. ? 값 세팅
		
		// 6. 최종 전송 및 결과 처리
		
		// 7. 연결 해제
	
	
	//
	public ArrayList<CountryDTO> getList() throws Exception {
		
		Connection connection = DBconnection.getConnection();
		String sql = "select * from countries";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		ArrayList<CountryDTO> arr = new ArrayList<>();
		
		while(rs.next()) {
			CountryDTO countryDTO2 = new CountryDTO();
			countryDTO2.setCountry_id(rs.getString(1));
			countryDTO2.setCountry_name(rs.getString(2));
			countryDTO2.setRegion_id(rs.getInt(3));
			arr.add(countryDTO2);
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		
		return arr;
		
	}
	
	
	//
	public CountryDTO getDetail(CountryDTO countryDTO2) throws Exception {
		
		CountryDTO countryDTO = null;
		Connection connection = DBconnection.getConnection();
		
				
		String sql = "select * from countries where Country_ID = ?"; // 오라클은 
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		// ? 값을 세팅
		st.setString(1, countryDTO2.getCountry_id());
		
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
