package com.kakao.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrayList = new ArrayList<>();
		HashSet<Integer> hashSet = new HashSet<>();
		
		arrayList.add(1);
		arrayList.add(2);
		boolean check = hashSet.add(10);
		hashSet.add(20);
		hashSet.add(10);
		
		
		
		System.out.println(arrayList); // 주소를 부르는 대신 오버라이딩한 toString()을 호출함
		System.out.println(hashSet); // 주소를 부르는 대신 오버라이딩한 toString()을 호출함
		

	}

}
