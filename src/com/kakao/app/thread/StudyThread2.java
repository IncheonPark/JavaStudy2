package com.kakao.app.thread;

public class StudyThread2 extends Thread {
	
	@Override
	public void run() {
		// 동시에 실행할 내용으로 오버라이딩
		this.m2();
	}
	
	
	
	
	private void m2() {
		
		for(int i = 0; i < 25; i ++) {
			
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
