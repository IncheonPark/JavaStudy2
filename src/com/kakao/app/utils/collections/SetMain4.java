package com.kakao.app.utils.collections;

import java.util.HashSet;
import java.util.Random;

public class SetMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		// 로또 번호 뽑기
		int num = 0;
		
		HashSet<Integer> hash = new HashSet<>();
		
		while (hash.size() < 6 ) {
			num = random.nextInt(45)+1;
			hash.add(num);
			
		}
		
		System.out.println(hash);
		
		
		
		
		
		

	}

}
