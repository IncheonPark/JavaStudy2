package com.kakao.app.users;

import java.util.List;

public class UserService {
	
	
	// Controller DAO사이에서 데이터의 전처리나, 후처리를 담당한다.
	
	private UserDAO userDAO;
	
	public UserService() {
		// TODO Auto-generated constructor stub
		this.userDAO = new UserDAO();
	}
	
	
	// 1. 가입
	public int join(UserDTO userDTO) throws Exception {
		
		int result = userDAO.join(userDTO);
		
		return result;
		
	}
	
	// 2. 목록 조회
	public List<UserDTO> getList() throws Exception {
		
		
		List<UserDTO> result = userDAO.getList(); 
		
		return result;
		
	}
	
	// 3. 로그인 (디테일)
	public UserDTO login(UserDTO userDTO) throws Exception {
		
		UserDTO result = userDAO.getDetail(userDTO);
		
		if(result != null) {
			if(result.getPassword().equals(userDTO.getPassword())) {
				return result;
			} else { // 아이디는 맞았지만, 비밀번호는 틀렸을 때
				return null;
			}
			
		} else { // 아이디부터 틀렸을 때
			return result;
			
		}
		
	}
	
	
	
	
	
	
	

}
