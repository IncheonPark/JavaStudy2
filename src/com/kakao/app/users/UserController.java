package com.kakao.app.users;

import java.util.Scanner;

public class UserController {
	
	
	private UserService userService;
	private UserInput userInput;
	
	
	//
	public UserController() {
		// TODO Auto-generated constructor stub
		this.userService = new UserService();
		this.userInput = new UserInput();
	}
	
	
	//
	public void start(Scanner sc) throws Exception {
		
		// 로그인
		boolean check = true;
		
		while (check) {
			
			System.out.println("1. 회원 가입 / 2. 로그인 / 3. 회원 목록 출력 / 4. 종료 ");
			
			int select = sc.nextInt();
			
			if (select == 1) {
				UserDTO userDTO = userInput.join(sc);
				int result = userService.join(userDTO);
				
			} else if (select == 2) {
				UserDTO userDTO = userInput.login(sc);
				userDTO = userService.login(userDTO);
				
				
			} else if (select == 3) {
				
				
			} else {
				break;
				
			}
			
			
		}
		
		
		
		
	}
	
	

}
