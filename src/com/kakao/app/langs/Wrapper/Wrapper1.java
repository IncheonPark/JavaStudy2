package com.kakao.app.langs.Wrapper;

public class Wrapper1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Integer.BYTES); // int 타입은 4바이트여서 4를 출력
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE); // 바이트 당 비트 수 : 4 * 8
		
		Integer integer = new Integer("3"); // 줄 그어져 있으면 Deprecated(사용 권장하지 않음)이다.
		Double double1 = new Double("1.23");
		int num = integer.intValue();
		double d = double1.doubleValue();
		
		System.out.println(integer);
		System.out.println(num);
		System.out.println(double1);
		System.out.println(d);
		
		// Auto Boxing, 기본 타입을 레퍼런스 타입으로 포장하는 것
		Integer integer2 = 3; // 참조타입 변수에 정수형 3을 대입 가능 LOL
		
		// Auto UnBoxing
		num = integer2; // 참조변수 주소가 가리키는 정수형을 바로 꺼내서, 기본 타입 변수에 넣음 LOL
		
		// Wrapper 클래스들
		// Byte, Short, Integer, Long, Float, Double, Boolean, Character
		
		int num2 = Integer.parseInt("123");
		System.out.println(num2);

	}

}
