package com.kakao.app.utils.tokens;

import java.util.StringTokenizer;

public class TokenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바에서는 클래스 담을 변수 선언 시
		// 같은 패키지 내에 있는지 혹은 java.lang에 있는지 찾음
		// 있다면, import 안하고 사용한다.
		// 아니라면 import 해야한다.
		
		// 하나의 문자열을 여러개의 문자열로 분리하는 작업 : Parsing
		// 분리한 문자열 하나 하나를 Token이라 부른다.
		
		String data = "동우-189.82-280.0-인천";
		StringTokenizer st = new StringTokenizer(data, "-");
		int count = st.countTokens();
		System.out.println(count);
		
		boolean check = st.hasMoreTokens();
		System.out.println(check);
		
		while(st.hasMoreTokens()) {
			
			String t = st.nextToken();
			System.out.println(t);
			
		}
		
		
		
		
		

	}

}
