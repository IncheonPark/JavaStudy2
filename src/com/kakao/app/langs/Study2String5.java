package com.kakao.app.langs;

import java.util.Scanner;

public class Study2String5 {
	
	// String의 불변성
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name1 = "iu";
		String name2 = "iu"; 
		// Heap영역에 같은 문자열 값(상수)이 있는지 찾아보고, 있으면 그 문자열의 주소를 가져와버린다. name1, name2 같은 이유
		String name3 = new String("iu");
		String name4 = sc.next();
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(name1 == name2);
		System.out.println(name1 == name3);
		System.out.println(name1 == name4);
		System.out.println(name3 == name4);
		
		System.out.println(name1.toString());
		System.out.println(name2.toString());
		System.out.println(name3.toString());
		System.out.println(name4.toString());
		
		name1 = name1+"hi"+"hello"; 
		// 기존 상수 객체에 이어 붙이는게 아니라, 둘을 합친 새로운 상수 객체를 생성한다.
		// 위 같은 상황이 너무 많이 발생하면 메모리 낭비가 발생한다.
		System.out.println(name2);
		
		
	}

}
