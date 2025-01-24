package com.kakao.app.users;

import java.util.Scanner;

public class UserInput {
	
	
	// 가입 정보를 입력하는 메서드
	public UserDTO join(Scanner sc) {
		
		UserDTO userDTO = new UserDTO();
		
		System.out.println("아이디를 입력하세요");
		userDTO.setUserName(sc.next());
		
		System.out.println("비밀번호를 입력하세요");
		userDTO.setPassword(sc.next());
		
		System.out.println("이름을 입력하세요");
		userDTO.setName(sc.next());
		
		System.out.println("전화번호를 입력하세요");
		userDTO.setPhone(sc.next());
		
		System.out.println("이메일을 입력하세요");
		userDTO.setEmail(sc.next());
		
		return userDTO;
		
	}
	
	
	

}
