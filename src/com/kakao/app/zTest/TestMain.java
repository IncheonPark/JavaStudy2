package com.kakao.app.zTest;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//DBConnectionTest dbc = new DBConnectionTest();			
			//dbc.getConnectionTest();
			
			UserDAOTest daoTest = new UserDAOTest();
			daoTest.getListTest();
			daoTest.getDetailTest();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}

}
