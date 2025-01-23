package com.kakao.app.zTest;

import java.sql.Connection;

import com.kakao.app.utils.DBConnection;

public class DBConnectionTest {
	
	
	public void getConnectionTest() throws Exception {
		
		// DBConnection의 Connection 메서드 테스트
		Connection con = DBConnection.getConnection();
		
		if (con != null) {
			System.out.println("연결 성공");
			System.out.println(con);
		} else {
			System.out.println("연결 실패");
		}
		
		
		
	}
	

}
