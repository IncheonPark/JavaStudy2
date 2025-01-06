package com.kakao.app.langs;

public class Study2String2 {
	
	public static void main(String[] args) {
		
		String str = "     ";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		
		String str2 = "";
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str2.isEmpty()); // 글자 수가 0인지 판단
		System.out.println(str2.isBlank()); // 글자 수가 0또는 스페이스바 공백으로만 이루어졌는지 판단
		
		//replace(char a, char b)
		String r = str.replace(' ', 'a');
		System.out.println(str);
		System.out.println(r);
		
		String r2 = str.replace(" ", "b");
		System.out.println(str);
		System.out.println(r2);
		
		// abc Abc
		// 대문자, 소문자로 전부 변경
		r = "aBc";
		r.toUpperCase();
		System.out.println(str);
		System.out.println(r);
		
		 // 문자열 > 문자 배열
		char [] ch = str.toCharArray();
		
		// 공백 제거
		str = " winter ";
		System.out.println(str.length());
		System.out.println(str);
		r2 = str.trim();
		System.out.println(r2);
		System.out.println(str);
		
		
		
		
		
	}

}
