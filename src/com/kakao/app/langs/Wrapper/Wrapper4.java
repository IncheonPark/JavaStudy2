package com.kakao.app.langs.Wrapper;

public class Wrapper4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 17;
		
		System.out.println(Integer.toBinaryString(num));
		
		// 비트 맨 앞은 음수 여부, 1이면 음수
		// 보수법
		// 음수로 표현할 때는 값을 다 바꾼다.
		// 마지막 수에 1을 더한다
		// ex) -1을 출력하면 11111111 11111111 11111111 11111111로 나온다.
		
		System.out.println(Integer.toHexString(num));
		
		System.out.println(Integer.toOctalString(num));
		

	}

}
