package com.kakao.app.langs;

public class Study1ObjectMain {

	public static void main(String[] args) {

		// 주의. 자바 문서에서 접근 지정자가 생략되어 있으면 public이다.
		Object obj = new Object();
		System.out.println(obj.toString());
		System.out.println(obj); //내부적으로 toString이 호출된다.
		
		Object obj2 = new Object();
		System.out.println(obj2.toString());
		System.out.println(obj2);
		
		ObjectTest objectTest = new ObjectTest();
		obj = (Object)objectTest;
		System.out.println(obj.toString());
		System.out.println(obj);
		
		System.out.println(obj == objectTest);
		System.out.println(obj.equals(objectTest));
		
		String name = "winter";
		String name2 = new String("winter");
		
		System.out.println(name == name2); // 참조변수(주소)를 비교 > false 출력
		System.out.println(name.equals(name2)); // 문자열을 비교, 오버라이딩 된 equals를 사용했다. > true 출력
		
		//==============================
		objectTest.num1 = 10;
		objectTest.m1();
		objectTest.toString();
		String str = objectTest.toString();
		System.out.println(str);
		System.out.println(obj.hashCode());
		
		
		
		
	}

}
