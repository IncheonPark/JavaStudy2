package com.kakao.app.utils.collections;

import java.util.ArrayList;

public class ListMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList
		ArrayList ar = new ArrayList();
		
		ar.add(1);
		ar.add('2');
		ar.add("Three");
		ar.add(true);
		ar.add(ar);
		
		System.out.println(ar);
		System.out.println(ar.get(2));
		
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		ar.add(1, "hello"); // 해당 인덱스에 끼워넣고, 나머지는 뒤로 한칸씩 밀림
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.set(1, "world"); // 해당 인덱스를 수정한다
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		ar.remove(1); // 해당 인덱스를 삭제한다
		for(int i=0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		boolean check = ar.contains(1);
		System.out.println("check : " + check);
	
		
		
		
		
		ar.clear();
		System.out.println(ar.size()+10);
		
	}

}
