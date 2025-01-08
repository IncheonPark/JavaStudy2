package com.kakao.app.collections;

import java.util.Scanner;

public class StudyStack {
	
	private int [] ar = null;
		
	
	public int pop() {
		
		// ar 배열의 0번을 리턴하고
		// 0번의 값을 삭제
		
		int [] afterPop = new int [ar.length-1];		
		int forZero = ar[0];
		
		for (int i = 0; i < afterPop.length; i++) {
			afterPop[i] = ar[i+1];
		}
		
		ar = afterPop;
		
		for (int n : ar) {
			System.out.println(n);
		}
		
		System.out.println("=============");
		
		return forZero;
		
	}
	
	
	public void set(int num) {
		
		// ar이 null이면 1칸 배열을 만들고 num을 대입
		if (ar == null) {
			ar = new int[1];
			ar[0] = num;
		
		// null이 아니라면 num값과 ar의 값 중 일치하는게 있으면 대입하지 않고,
		// 일치하는게 없으면 ar의 배열에 한칸 더 큰 배열을 생성하고,
		// 마지막에 num을 대입
		} else {			
			boolean check = true;
			for(int i = 0; i < ar.length; i ++) {
				
				if(num == ar[i]) {
					check = false;
					break;
				}
			}
			
			if (check) {
				int [] copy = new int [ar.length+1];
				
				for (int i = 0; i < ar.length; i++ ) {
					copy[i] = ar[i];
				}
				
				copy[copy.length-1] = num; // 마지막에 num 대입
				ar = copy;
			}
			
			
		}
		
		
		
	}
	
	
	
	public void add(int num) {
		
		if (ar == null) {
			ar = new int[1];
			ar[0] = num;
			
		} else {
			int [] copy = new int [ar.length+1];
			
			for (int i = 0; i < ar.length; i++ ) {
				copy[i+1] = ar[i];
			}
			
			copy[0] = num;
			ar = copy;
		}
		
		
	}
	
	
	public void info() {
		
		// 향상된 for문
		for(int n : ar) {
			System.out.println(n);
		}
		System.out.println("===============");
		
	}
	

}
