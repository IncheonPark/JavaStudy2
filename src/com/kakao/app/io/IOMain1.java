package com.kakao.app.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		// 키보드로부터 입력
		// 0, 1 형태로 들어오는 신호를 > 문자로 바꿈 ( h, e, l, l, o) -> hello
		
		// 0, 1을 관리하는 클래스
		InputStream is = System.in; // 객체 생성이 안돼서 System.in을 넣는다.
		
		
		// 문자를 관리하는 클래스
		InputStreamReader ir = new InputStreamReader(is);
		
				
		// 보조 스트림 (문자열)
		BufferedReader br = new BufferedReader(ir);
		
		
		// br으로 입력 받아보기
		System.out.println("입력 하세요");
		
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {			
			e.printStackTrace();
			
		} finally {
			// 예외가 발생하던 안하던 무조건 실행하는 영역
			try {
				sc.close();
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램을 종료합니다");
		
	}

}
