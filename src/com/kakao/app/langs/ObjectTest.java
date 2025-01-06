package com.kakao.app.langs;

public class ObjectTest {

	int num1;
	
	//toString 오버라이딩
	public String toString() {
		System.out.println(this.num1);
		return num1+"";
	}
	
	public void m1() {
		
		System.out.println(this.num1);
		
	}
	
}
