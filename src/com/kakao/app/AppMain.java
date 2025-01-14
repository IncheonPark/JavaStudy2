package com.kakao.app;

import com.kakao.app.departments.DepartmentDAO;
import com.kakao.app.locations.LocationDAO;
import com.kakao.app.utils.DBconnection;
import com.kakao.app.utils.Test;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 실행");
		
//		DBconnection con = new DBconnection();
//		con.getConnection();
		
		DepartmentDAO dao = new DepartmentDAO();
		LocationDAO dao2 = new LocationDAO();
		
		try {
			dao.getDetail();
			dao2.getDetail();
			dao.getList();
			
		} catch (Exception e) {			
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");

	}

}
