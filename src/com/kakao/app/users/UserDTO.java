package com.kakao.app.users;

public class UserDTO {
	
	// 멤버 변수 선언자는 private으로 한다.
	
	// 데이터 타입과 변수명은 테이블과 동일하게 만든다
	
	// 게터,세터가 필요하다
		
	// 생성자는 기본 생성자 필수
	
	private String userName;
	private String password;
	private String name;
	private String phone;
	private String email;
	
	
	
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
	
	
	

}
