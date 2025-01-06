package com.kakao.app.langs;

public class Study2String3 {
	
	public static void main(String[] args) {
		
		String number = "010-1234-5678";
		
		// substring(idx) : idx부터 끝까지
		// 문자열에서 일부분을 추출할 때 사용
		String str = number.substring(9);
		System.out.println(str);
		
		// substring(idx1, idx2) : idx1부터 idx2미만 까지
		str = number.substring(4,8); //4~7
		System.out.println(str);
		
		
		// gif 확장자만 출력해보기
		String name = "win.ter.gif";
		int dot = name.lastIndexOf("."); // 뒤에서부터 검색
		
		String answer = name.substring(dot+1);
		
		System.out.println(answer);
		
		// 주민번호 뒷자리 첫번째로 남녀 구분하기 (1~4까지) -----------
		
		String number2 = "991212-4234567";
		
		number2 = number2.charAt(7)+"";
		
		if (number2.equals("1") || number2.equals("3")) {
			System.out.println("앞자리 번호는 " + number2 + " : 남자입니다.");
			
		} else if (number2.equals("2") || number2.equals("4")) {
			System.out.println("앞자리 번호는 " + number2 + " 여자입니다.");

		} else {
			System.out.println("앞자리 번호가 잘못되었습니다.");
		}
		
		
		
		
		
		
		
		
	}

}
