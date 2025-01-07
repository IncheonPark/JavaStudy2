package com.kakao.app.langs.Wrapper;

import java.util.Scanner;

public class Wrapper2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 현재 나이 구하기
		Scanner sc = new Scanner(System.in);
//		System.out.println("생년월일 6자리 입력");
//		
//		String birth = sc.next(); // 920919
//		
//		//년도만 추출
//		birth = birth.substring(0, 2); // 인덱스 0~1까지 추출
//		
//		//추출한 년도 앞에 "19"추가
//		birth = "19"+birth;
//		System.out.println(birth);
//		
//		//문자열 1992를 int형 1992로 변환
//		int inputBirth = Integer.parseInt(birth);
//		
//		//2025에서 1992를 뺌 = 현재 나이
//		int age = 2025 - inputBirth;
//		
//		System.out.println("현재 나이는 : " + age);
		
		
		// 920919-1234567 형태의 주민번호 입력 후 나이 구하기 ------------------------------------------
//		System.out.println("921225-1234567 형태의 주민번호를 입력해주세요");
//		String number = sc.next();
//		
//		if (number.charAt(7) == '3' || number.charAt(7) == '4') {
//			
//			number = number.substring(0, 2);
//			number = "20" + number;
//			
//			System.out.println("현재 나이는 : " + (2025 - Integer.parseInt(number)));
//			
//		} else if (number.charAt(7) == '1' || number.charAt(7) == '2') {
//			
//			number = number.substring(0, 2);
//			number = "19" + number;
//			
//			System.out.println("현재 나이는 : " + (2025 - Integer.parseInt(number)));
//			
//		} else {
//			System.out.println(number.charAt(7));
//			System.out.println("주민등록번호 뒷자리가 형식에 맞지 않습니다.");
//		}
		
		
		// 3~5월 봄, 6~8월 여름, 9~11월 가을, 12~2월 겨울-----------------------------------------
		// 920919-1234567 형태의 주민번호 입력 후 계절 구하기 ------------------------------------------
		System.out.println("921225-1234567 형태의 주민번호를 입력해주세요");
		
		String month = sc.next().substring(2, 4);
		int seoson = Integer.parseInt(month);
		
		System.out.println(seoson);
		
		if (3 <= seoson && seoson <= 5) {
			System.out.println("봄에 태어났습니다.");
			
		} else if (6 <= seoson && seoson <= 8) {
			System.out.println("여름에 태어났습니다.");
			
		} else if (9 <= seoson && seoson <= 11) {
			System.out.println("가을에 태어났습니다.");
			
		} else {
			System.out.println("겨울에 태어났습니다.");
			
		}
		
		
		
		

	}

}
