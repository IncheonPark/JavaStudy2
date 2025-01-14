package com.kakao.app;

import com.kakao.app.departments.DepartmentController;
import com.kakao.app.departments.DepartmentDAO;
import com.kakao.app.front.FrontController;
import com.kakao.app.locations.LocationController;
import com.kakao.app.locations.LocationDAO;
import com.kakao.app.utils.DBconnection;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("프로그램 실행");
		
//		DBconnection con = new DBconnection();
//		con.getConnection();
		
		FrontController frontController = new FrontController();
		frontController.start();
		
		
		
		
		System.out.println("프로그램 종료");

	}

}
