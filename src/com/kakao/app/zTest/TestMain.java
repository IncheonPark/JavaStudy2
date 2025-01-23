package com.kakao.app.zTest;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//DBConnectionTest dbc = new DBConnectionTest();			
			//dbc.getConnectionTest();
			
			// Users Table ------------------------------------------------------
//			UserDAOTest daoTest = new UserDAOTest();
//			daoTest.getListTest();
//			daoTest.getDetailTest();

			// Products Table ------------------------------------------------------
			ProductDAOTest daoTest = new ProductDAOTest();
			//daoTest.insertTest();
			daoTest.getListTest();
			//daoTest.getDetailTest();
			//daoTest.updateRateTest();
			
			// Accounts Table ------------------------------------------------------
			// 1. 계좌 추가
			// 2. 계좌들의 정보를 조회 > 특정한 회원의 계좌 목록
			// 3. 계좌 상세정보를 조회 > 회원의 특정 계좌
			// 4. 계좌 잔액을 수정 > 회원의 특정 계좌의 잔액
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
