package com.kakao.app.accounts;

import java.util.Calendar;

public class AccountService {
	
	
	private AccountDAO accountDAO;
	
	
	public AccountService() {
		// TODO Auto-generated constructor stub
		accountDAO = new AccountDAO();
		
	}
	
	
	private static long count = 1;
	
	// 가입
	public int add(AccountDTO accountDTO) throws Exception {
		
		Calendar calendar = Calendar.getInstance();
		
		
		
		return 0;
		
	}
	
	
	

}
