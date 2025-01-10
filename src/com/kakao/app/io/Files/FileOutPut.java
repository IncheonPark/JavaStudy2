package com.kakao.app.io.Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutPut {
	
	private Scanner sc = new Scanner(System.in);
	
	
	//------------------------------------------
	public String add() {
		// 도시명, 기온, 습도, 날씨 상태를 각각, 4번 입력 받아서
		// sample.text에 추가하기
		// 항목 사이에 "-" 는 자동으로 들어가게 형식 만들기
		
		String sumStr = "";
		
		for (int i = 0; i < 3; i++) {
			System.out.println("도시 기온 습도 날씨 순으로");
			System.out.println("입력해주세요 " + i + "/4");
			sumStr = sumStr + sc.next() + "-";
		}
		
		System.out.println("도시 기온 습도 날씨 순으로");
		System.out.println("입력해주세요 4/4");
		sumStr = sumStr + sc.next();
				
		return sumStr;
		
	}
	
	
	//-------------------------------------
	public void write() {
		System.out.println("write() 실행");

		boolean check = true;
		
		while(check) {
			System.out.println("Press Any key to Start, 종료할거면 end 입력");
			String data = sc.next();
			
			if ( ! (data.toLowerCase().equals("end") ) ) {
				
				// 4번 입력 주는 메서드
				String sumStr = this.add(); //sumStr을 리턴 해준다.
				
				
				this.output(sumStr);
				
			} else {
				check = false;
			}
						
		}
		
		sc.close();
		System.out.println("write() 종료");

	}
	
	//---------------------------------------
	private void output (String data) {
		System.out.println("output() 실행합니다");
		
		// \t	\n	\" 등 특수기능을 하는 문자열 있으니 경로 작성할 때 주의할 것 
				
		// 파일에 내용을 출력
		File file = new File("C:\\test\\sample.text");
		
		file = new File("C:\\test", "sample.text");
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(file, true); // true가 있으면 이어 붙이기를 한다.
			
			fw.write(data); // 없거나 false이고 똑같은 파일명이 있다면, 내용을 덮어 씌운다.
			
			// 두 실행문은 세트로 생각하자
			// 버퍼 초기화
			fw.write("\r\n");
			// 버퍼 강제 비움
			fw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				fw.close();
				System.out.println("fw.close() 실행");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			
		}
		
		
		System.out.println("output() 종료합니다");
	}
	
	

}
