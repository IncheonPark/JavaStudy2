package com.kakao.app.utils.Date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal1 = Calendar.getInstance();
		
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(Calendar.YEAR, 2100);
		
		System.out.println(cal1.getTime());
		System.out.println(cal2.getTime());
		
		cal2.set(1992, 9, 19, 12, 34, 56); // month를 1 적게 넣어야 함
		
		System.out.println(cal1.getTime());
		System.out.println(cal2.getTime());

		
		cal1.set(2025, 0, 9, 12, 10);
		cal2.set(2025, 0, 9, 12, 30);
		
		int calNum1 = cal1.get(Calendar.MINUTE);
		int calNum2 = cal2.get(Calendar.MINUTE);
		
		System.out.println(calNum2 - calNum1); // 이 로직은 시간이 올라가면 못 쓴다.
		
		//--------------------------
		long calLong1 = cal1.getTimeInMillis();
		long calLong2 = cal2.getTimeInMillis();
		
		System.out.println(calLong1/1000);
		System.out.println(calLong2/1000);
		
		long answer = calLong2 - calLong1;
		System.out.println(answer/1000 + "초");
		
		System.out.println(answer/(1000 * 60) + "분");
		
		
		// 내가 태어난 후로 지난 시간 구해보기
		cal1 = Calendar.getInstance();
		
		cal2 = Calendar.getInstance();
		cal2.set(1992, 8, 19);
		
		long clong1 = cal1.getTimeInMillis(); // 현재
		long clong2 = cal2.getTimeInMillis(); // 생년월일
		
		long cAnswer = clong1 - clong2;
		System.out.println("태어난 지 " + cAnswer/(1000 * 60 * 60 * 24) + "일 지났습니다.");
		System.out.println("태어난 지 " + (cAnswer/(1000 * 60 * 60 * 24))/365 + "년 지났습니다.");		
		
		System.out.println("태어난 지 " + cAnswer/(1000 * 60 * 60 * 24 * 365) + "년 지났습니다.");
		System.out.println("태어난 지 " + cAnswer/((long)1000 * 60 * 60 * 24 * 365) + "년 지났습니다.");
		// 인트 범위 넘어서 계산 버그있음 > 숫자 한개 롱타입으로 바꿔서 해결
		
		
		
		
		
		
		
		
	}

}
