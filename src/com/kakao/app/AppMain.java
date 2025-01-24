package com.kakao.app;

import java.util.UUID;

public class AppMain {

	public static void main(String[] args) {
		
		// 프로그램 실행, 또는 테스트 코드 실행
		
		// 유니버셜 유니크 아이덴티파이어
		String id = UUID.randomUUID().toString();
		System.out.println(id);
		
	}

}
