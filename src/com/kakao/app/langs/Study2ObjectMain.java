package com.kakao.app.langs;

public class Study2ObjectMain {

	public static void main(String[] args) {
		
		String str = new String();
		System.out.println(str.CASE_INSENSITIVE_ORDER);
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String name = "Winter";
		
		System.out.println(name.length());
		
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		System.out.println(name.indexOf("W"));
		System.out.println(name.indexOf("i"));
		System.out.println(name.indexOf("n"));
		
		System.out.println();
		System.out.println(name.indexOf("in"));
		System.out.println(name.indexOf("it"));
		
		System.out.println();
		System.out.println(name.indexOf('W'));
		
		System.out.println(name.indexOf("i", 1));
		
		System.out.println();
		System.out.println();
		
		// 주어진 문자열에서 특정 문자가 들어있는 인덱스를 찾아 출력하는 프로그램을 작성해보자 -----------------------
		name = "Hello Hello Hello";
		String find = "e";
		
		for (int i = 0; i < name.length(); i++) {
			System.out.println("========");
			System.out.println(i);
			
			if (name.indexOf(find, i) > -1 ) {
				System.out.println(name.indexOf(find, i));
				i = name.indexOf(find, i); //찾으면 다음 인덱스로 바로 건너뛰게 만든다 (안하면 그 전까지 이미 찾은 인덱스를 반복 출력한다.)
			} else {
				break;
			}
			
		}
		
		
		
		
			
		
		
		
		
		
		

	}

}
