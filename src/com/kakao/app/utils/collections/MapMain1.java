package com.kakao.app.utils.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List, Set의 부모 => Collection
		
		// 하지만 Map은 아니다. Map <K,V> 에서 K은 키타입을 지정, V는 밸류타입을 지정하라는 뜻.
		
		// Map
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("서울", 100);
		map.put("인천", 200);
		map.put("홍천", 300);
		
		//map.put("인천", 400);
		
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.get("서울"));
		System.out.println(map.get("서")); // 없는 키를 쓰면 null이 나온다.
		
		// 필요할 떄 키를 따로 꺼낼 상황이 있다
		// keySet() => 리턴 타입이 Set <맵의 키 타입> 이다.
		Iterator <String> keys = map.keySet().iterator();
		
		while (keys.hasNext()) {
			String k = keys.next();
			System.out.println("Key : " + k);
			Integer v = map.get(k);
			System.out.println("Value : " + v);
		}
		
		
		
		

	}

}
