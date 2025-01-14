package com.kakao.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kakao.app.utils.DBconnection;

public class LocationDAO  {
	
	
	
	
	public void getList() throws Exception {
		
		String sql = "select * from locations order by 2 desc";
		
		Connection connection = DBconnection.getConnection();
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		
		DBconnection.disConnect(rs, st, connection);
		
	}
	
	
	//---------------
	public void getDetail() throws Exception {
		
		String sql = "select * from locations where location_id = 1000";
		
		Connection connection = DBconnection.getConnection();
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getString(6));
			
		} else {
			System.out.println("출력 데이터가 없습니다.");
			
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		
		
	}

}
