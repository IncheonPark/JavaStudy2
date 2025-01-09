package com.kakao.app.utils.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class SetMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member();
		m1.setName("동우");
		m1.setAge(32);
		
		Member m2 = new Member();
		m2.setName("우동");
		m2.setAge(23);
		
		ArrayList<Member> arr = new ArrayList<>();
		arr.add(m1);
		arr.add(m2);
		
		HashSet<Member> hash = new HashSet<>();
		hash.add(m1);
		hash.add(m2);
		
		System.out.println(arr);
		System.out.println(hash);
		
		Member m3 = new Member(); // m1과 데이터는 같지만, 주소가 다르기 때문에 해쉬에서 다른 값으로 인식해서 인풋 성공
		m3.setName("동우");
		m3.setAge(32);
		
		arr.add(m3);
		hash.add(m3);
		
		arr.add(m1);
		hash.add(m1); // 데이터 중복으로 인풋 실패
		
		System.out.println(arr.size());
		System.out.println(hash.size());
		
		System.out.println(arr.contains("동우"));
		
		
		
		
		
		

	}

}
