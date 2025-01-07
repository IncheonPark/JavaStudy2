package com.kakao.app.langs;

public class Study3StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "a";
		str = str + "b";
		System.out.println(str);
		// 이 과정에서 a, b, ab 객체 세개가 만들어진다. 불필요한 객체 생성을 개선하기 위해 StringBuffer를 쓴다.
		
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		sb.append("b");
		// 객체를 하나만 쓴다.
		
		System.out.println(sb);
		
		str = sb.toString();
		// StringBuffer 타입은 바로는 못 집어넣고 toString()으로 String타입으로 리턴해줘야 한다.
		

	}

}
