package com.kakao.app.thread;

public class StudyThread22 implements Runnable {
	
	@Override
	public void run() {
		// 동시에 실행할 내용으로 오버라이딩
		this.m22();
	}
	
	
	
	
	private void m22() {
		
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
