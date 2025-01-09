package com.kakao.app.utils.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatMain1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		// 2025년 1월 9일 형식으로 출력해보자.
		Calendar calendar = Calendar.getInstance();
		
		String pattern = "yyyy년 MM월 dd일 E HH:mm:ss";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		
		
		String str = sd.format(calendar.getTime());
		System.out.println(str);
		
		//
		String d = "2050.10.30";
		pattern = "yyyy.MM.dd";
		
		sd.applyPattern(pattern);
		
		Date date = sd.parse(d);
		
				
		//
		long t = date.getTime();
		calendar.setTimeInMillis(t);
		
		System.out.println(date);
		System.out.println(calendar.getTime());

	}

}
