package com.kakao.app.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyException1 {
	
	
	public void m1(Scanner sc) throws Exception { //throws는 익셉션을 던져줄테니 메서드를 부른 쪽에서 처리하라는 뜻
		
		System.out.println("숫자를 입력하세요");
		
//		try {
			//익셉션이 발생하면 > throw new InputMismatchException()이 만들어진다
			int num = sc.nextInt();
			
			//익셉션이 발생하면 throw new ArithmeticException()이 만들어진다
			num = 20/num;
			
			System.out.println(num);
			
//		} catch (InputMismatchException ex) {			
//			System.out.println("정수만 입력하세요");
//			
//		} catch (ArithmeticException ex) {
//			System.out.println("0으로 나눌 수 없습니다");
			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
		
		
		
		
	}

}
