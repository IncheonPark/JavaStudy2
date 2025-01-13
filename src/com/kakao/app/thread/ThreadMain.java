package com.kakao.app.thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudyThread1 st1 = new StudyThread1();
		StudyThread2 st2 = new StudyThread2();
		
		//st1.run(); // 이렇게 호출하면 번갈아가면서 호출 안됨
		//st2.run();
		
		// OS한테 실행을 부탁해야한다.
		st1.start(); // run() 메서드 호출
		st2.start(); // run() 메서드 호출
		
		
		//-----
		StudyThread22 st22 = new StudyThread22(); // Runable 인터페이스를 구현한 경우는 Thread 객체를 구현해야 쓸 수 있다.
		Thread thread = new Thread(st22);
		
		thread.start();
		
		

	}

}
