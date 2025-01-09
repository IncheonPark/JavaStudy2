package com.kakao.app.utils.Date;

import java.util.Calendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar = Calendar.getInstance(); // 객체 없이 클래스 영역의 static 메서드로 불러옴
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		
		// 현재 년도
		System.out.println(calendar.get(Calendar.YEAR));
		
		// 현재 월
		System.out.println(calendar.get(Calendar.MONTH)+1); // +1 해 줘야됨
		
		// 현재 일
		System.out.println(calendar.get(Calendar.DATE));
		
		// 현재 시간
		System.out.println(calendar.get(Calendar.HOUR)); // 오후 12시일 때 0으로 출력 (12시간 모드)
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); // 오후 12시일 때 12로 출력  (24시간 모드)
		
		// 현재 분
		System.out.println(calendar.get(Calendar.MINUTE));
		
		// 현재 초
		System.out.println(calendar.get(Calendar.SECOND));
		
		
		// 밀리세컨즈 ( 1 / 1천 초)
		int mil = calendar.get(Calendar.MILLISECOND);


	}

}
