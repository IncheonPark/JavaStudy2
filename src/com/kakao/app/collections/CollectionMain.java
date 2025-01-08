package com.kakao.app.collections;

import java.util.Scanner;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudyStack stack = new StudyStack();
		
		stack.add(1);
		stack.info();
		
		
		stack.add(5);
		stack.info();
		
		stack.add(7);
		stack.info();
		
		stack.add(9);
		stack.info();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.set(1);
		stack.info();
		
		
		stack.set(5);
		stack.info();
		
		stack.set(5);
		stack.info();
		
		stack.set(7);
		stack.info();
		
		stack.set(9);
		stack.info();
		
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
		
		

	}

}
