package com.kakao.app.zTest;

import java.util.List;
import java.util.Scanner;

import com.kakao.app.users.UserDAO;
import com.kakao.app.users.UserDTO;

public class UserDAOTest {
	
	private UserDAO dao;
	private Scanner sc;
	
	
	public UserDAOTest() {
		dao = new UserDAO();
		sc = new Scanner(System.in);
	}
	
	
	//
	public void insertTest() throws Exception {
		// TODO Auto-generated method stub
		
		UserDTO dto = new UserDTO();
		dto.setUserName("하이2");
		dto.setPassword("12345");
		dto.setName("하이루");
		dto.setPhone("전화번호1");
		dto.setEmail("이메일1");
								
		try {
			System.out.println(dao.join(dto));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		

	}
	
	
	//
	public void getListTest() throws Exception {
		
		List<UserDTO> list = dao.getList();
		
		if (list != null) {
			
			for (UserDTO dto : list) {
				System.out.print(dto.getUserName() + " || ");
				System.out.print(dto.getPassword() + " || ");
				System.out.print(dto.getName() + " || ");
				System.out.print(dto.getPhone() + " || ");
				System.out.print(dto.getEmail());
				System.out.println();
				
				
			}
		}
		
	}
	
	
	//
	public void getDetailTest() throws Exception {
		
		System.out.println("아이디를 입력해주세요");		
		UserDTO dto = new UserDTO();
		dto.setUserName(sc.next());
		dto = dao.getDetail(dto);
		
		if (dto != null) {
			System.out.print(dto.getUserName() + " || ");
			System.out.print(dto.getPassword() + " || ");
			System.out.print(dto.getName() + " || ");
			System.out.print(dto.getPhone() + " || ");
			System.out.print(dto.getEmail());
			System.out.println();
		}
		
		
	}
	

}
