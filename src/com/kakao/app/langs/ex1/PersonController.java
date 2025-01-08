package com.kakao.app.langs.ex1;

import java.util.ArrayList;
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
		PersonView personView = new PersonView();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		PersonInfo pi = null;
		ArrayList<Person> pList = null;		
		
		while (flag) {
			System.out.println("1. 주소록 초기화 / 2. 주소록 출력 / 3. 학생 검색 / 4. 주소록 정보 추가 / 5. 주소록 삭제 / 6. 종료");
			int select = sc.nextInt();
			
			switch (select) {
			// 1. 주소록 초기화
			case 1 : 
				pi = new PersonInfo();
				pList = pi.init();
				System.out.println("주소록이 초기화 되었습니다.");
				break;
				
			case 2 :
				// 2. 주소록 출력				
				if(pList != null) {
					personView.view(pList);
					break;
				} else {
					System.out.println("출력할 인원이 없습니다.");
					break;
				}
				
				
			case 3 :
				if(pList != null) {
					Person person = pi.find(pList, sc.next());
					ArrayList<Person> aloneList = new ArrayList<>();
					aloneList.add(person);
					personView.view(aloneList);
					break;
				} else {
					System.out.println("검색할 인원이 없습니다.");
					break;
				}
				
				
			case 4 :
				if(pList != null) {
					//기존 배열 한칸 늘린 다음 학생 한명 추가하기
					System.out.println("학생을 추가합니다. 학생 데이터를 입력하세요");
					System.out.println("이름, 전화번호, 이메일, 생년월일,");

					//띄어쓰기하면 이후 데이터 못 받음, 주의!					
					pList = pi.add(pList, sc.next());					
					break;
					
				} else {					
					System.out.println("학생이 없습니다. 학생 데이터를 입력하세요");
					break;
					
				}
				
				
			case 5 :
				if (pList != null) {
					System.out.println("학생을 삭제합니다. 학생 이름를 입력하세요");
					Person person = pi.find(pList, sc.next());
					pList = pi.delete(pList, person);
					
					break;
				} else {
					System.out.println("학생이 없습니다. 학생 데이터를 입력하세요");
					break;
				}
				
				
				
			case 6 : 				
				
			default : 
				System.out.println("프로그램을 종료합니다.");
				flag = !flag;
			}
			
		}
		
		
		
		
		
		
		
		
		
	}

}
