package com.kakao.app.langs.ex1;

import java.util.Scanner;

import javax.sound.sampled.TargetDataLine;

public class PersonController {
	
	public void start() {
		
		// 1. 주소록 초기화
		// 2. 주소록 출력
		// 3. 검색 (이름, PathInfo.find() 메서드로 만들 것)
		// 4. 주소록 정보 추가 (PathInfo.add())
		// 5. 주소록 삭제 (이름으로 검색 후 삭제 PathInfo.delete())
		// 6. 종료
		
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		PersonInfo pi = null;
		
		while (flag) {
			System.out.println("1. 주소록 초기화 / 2. 주소록 출력 / 3. 학생 검색 / 4. 주소록 정보 추가 / 5. 주소록 삭제 / 6. 종료");
			int select = sc.nextInt();
			
			switch (select) {
			// 1. 주소록 초기화
			case 1 : 
				pi = new PersonInfo();
				pi.init();
				break;
				
			case 2 :
				// 2. 주소록 출력
				PersonView personView = new PersonView();
				if(pi != null) {
					personView.view(pi.input());
					break;
				} else {
					System.out.println("출력할 인원이 없습니다.");
					break;
				}
				
				
			case 3 :
				if(pi != null) {
					pi.find(pi.input(), sc.next());
					break;
				} else {
					System.out.println("검색할 인원이 없습니다.");
					break;
				}
				
				
			case 4 :
				if(pi != null) {
					//기존 배열 한칸 늘린 다음 학생 한명 추가하기
					System.out.println("학생을 추가합니다. 학생 데이터를 입력하세요");
					System.out.println("이름, 전화번호, 이메일, 생년월일,");

					//띄어쓰기하면 이후 데이터 못 받음, 주의!
					if(pi.getData() != null) {
						pi.setData(pi.getData() + sc.next());
					} else {
						pi.setData(sc.next());
					}
					
					pi.init();
					break;
				} else {
					//배열 새로 만들어서 추가하기
					pi = new PersonInfo();
					System.out.println("학생이 없습니다. 학생 데이터를 입력하세요");
					System.out.println("이름, 전화번호, 이메일, 생년월일,");
					
					 //띄어쓰기하면 이후 데이터 못 받음, 주의!				
					if(pi.getData() != null) {
						pi.setData(pi.getData() + sc.next());
					} else {
						pi.setData(sc.next());
					}
					
					pi.init();
					break;
				}
				
				
			case 5 :
				break;
				
			case 6 : 				
				
			default : 
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
