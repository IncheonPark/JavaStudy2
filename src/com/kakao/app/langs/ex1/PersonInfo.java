package com.kakao.app.langs.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class PersonInfo {
	
	private String data;
	private String[] datas;
	private Person person;
	private ArrayList<Person> pList = new ArrayList<>(); 
	
	
	public PersonInfo () {
		this.data = "iu, 010-1234-5678, iu@naver.com, 95-11-22,";
		this.data = this.data + "winter, 010-2222-2222, winter@gmail.com, 01-02-03,";
		this.data = this.data + "suji, 010-3333-4444, suji@naver.com, 98-12-11,";
		System.out.println(this.data);
	}
	
	
	
	// 메서드명 init 만들기
	// data의 변수의 값을 파싱	
	public ArrayList<Person> init () {
		this.datas = this.data.split(",");
		
		for (int i = 0; i < datas.length; i++) {
//			if(i % 4 == 0) {
//				System.out.println("============================");
//			}
			datas[i] = datas[i].trim();
//			System.out.println(datas[i]);
		}
		
		
		for (int i = 0; i < datas.length/4; i++) {
			pList.add(new Person());
			pList.get(i).setName(datas[i*4+0]);
			pList.get(i).setPhone(datas[i*4+1]);
			pList.get(i).setEmail(datas[i*4+2]);
			pList.get(i).setBirth(datas[i*4+3]);
		}
		
		return pList;
		
	}

	
	
	// 검색 기능
	public Person find(ArrayList<Person> pList, String name) {
		boolean check = false;
		
		for (int i = 0; i < pList.size(); i++) {
			if (pList.get(i).getName().equals(name)) {
				person = new Person();
				person.setName(pList.get(i).getName());
				person.setPhone(pList.get(i).getPhone());
				person.setEmail(pList.get(i).getEmail());
				person.setBirth(pList.get(i).getBirth());
				
				check = true;
				break;
			}
			
		}
		
		if (check == false) {
			System.out.println("이름이 같은 학생을 찾지 못했습니다.");
		} else {
			System.out.println("검색을 완료했습니다.");
		}
		
		return person;
		
	}
	
	// 학생 추가 메서드
	public ArrayList<Person> add (ArrayList<Person> pList, String input) {
		//확인용 출력
		System.out.println(pList.get(pList.size()-1).getName());
		
		StringTokenizer st = new StringTokenizer(input, ",");
		
		person = new Person();
		person.setName(st.nextToken());
		person.setPhone(st.nextToken());
		person.setEmail(st.nextToken());
		person.setBirth(st.nextToken());
		
		pList.add(person);
		
		System.out.println("학생이 추가 되었습니다.");
		
		return pList;
		
	}
	
	
	// 학생 삭제 메서드
	public ArrayList<Person> delete (ArrayList<Person> pList, Person person){
		boolean check = false;
		
		for(int i = 0; i < pList.size(); i++) {
		
			if(pList.get(i).getName().equals(person.getName())) {
				pList.remove(i);

				check = true;
				break;
				
			}
			
		}
		
		if (check == false) {
			System.out.println("이름이 같은 학생을 찾지 못했습니다.");
		} else {
			System.out.println("삭제를 완료했습니다.");
		}
		
		return pList;
		
	}
	
	
	
	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	
	
	

	
	
	

}
