package com.kakao.app.langs.Wrapper;

import java.util.Scanner;

//가짜 주민번호 판별기 만들기
	//   9 7 1 2 2 6 - 1 2 3 4 5 6 7
	// * 2 3 4 5 6 7   8 9 2 3 4 5   마지막 번호는 검증용 번호
	//-------------------------------------------------
	//  18+21+.......................
	// 122
	
	// 11로 나눈 나머지 값 구하기 ex) 1
	// 만약에 나머지 값이 두자리 수라면 ex) 10 / 11 => 10
	// 11-나머지 값 > 결과 값 구하기
	// 나머지 값을 다시 10으로 나눈 나머지 값을 구한다.
	
	
	// 나머지 값을 검증용 번호와 일치하는지 확인 ex) 1 == 7

public class Wrapper3 {
	
	public static void main(String[] args) {
		System.out.println("주민번호를 입력해주세요");
		System.out.println("921225-1234567 형식 ");
		Scanner sc = new Scanner(System.in);
		String number = sc.next(); //920919-1234567 형태 주민번호 입력
		int newNumber = 0;
		int times = 2;
		
		for (int i = 0; i < number.length()-1; i ++) {
			
			System.out.print(i);
			System.out.println(times);
			
			if(i != 6) {
				newNumber = newNumber + (Integer.parseInt(Character.toString(number.charAt(i)))*times);
				times++;
			}
			
			if(times > 9) {
				times = 2;
			}
			
		}
		System.out.println(newNumber);
		
		// 나머지 값 구하기
		newNumber = newNumber % 11;
		
		newNumber = 11 - newNumber;
		
		if (newNumber >= 10) {
			newNumber = newNumber % 10;
		}
		
		// 결과 값이 number의 끝자리와 일치하는지 확인한다
		if (newNumber == Integer.parseInt(""+number.charAt(number.length()-1))) {
			System.out.println("검증 값과 마지막 숫자가 일치합니다");
		} else {
			System.out.println("검증 값과 마지막 숫자가 일치하지 않습니다.");
		}
		
		
	}
	
	
}
