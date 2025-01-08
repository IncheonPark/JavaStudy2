package com.kakao.app.utils.collections;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		ArrayList ar = new ArrayList();
		ar.add(1);
		
		// 꺼내는 타입이 안전하지 않다
		if(ar.get(0) instanceof Integer) {
			int n = (Integer)ar.get(0);
		}
		
		// Element 변수
		// 모으려고 하는 타입을 선언
		// <> Generic 제네릭 - 클래스, 메서드 등에 사용 : 타입의 안정성 때문에 출시했다
		
		ArrayList <Integer> arr = new ArrayList<>();
		arr.add(3);
		arr.add(5);
		int n = arr.get(1);
		

	}

}
