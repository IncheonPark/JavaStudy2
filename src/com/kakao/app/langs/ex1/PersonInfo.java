package com.kakao.app.langs.ex1;

public class PersonInfo {
	
	private String data;
	private String[] datas;
	private Person[] people;
	
	
	public PersonInfo () {
		this.data = "iu, 010-1234-5678, iu@naver.com, 95-11-22,";
		this.data = this.data + "winter, 010-2222-2222, winter@gmail.com, 01-02-03,";
		this.data = this.data + "suji, 010-3333-4444, suji@naver.com, 98-12-11,";
		System.out.println(this.data);
	}
	
	
	
	// 메서드명 init 만들기
	// data의 변수의 값을 파싱	
	public void init () {
		this.datas = this.data.split(",");
		
		for (int i = 0; i < datas.length; i++) {
//			if(i % 4 == 0) {
//				System.out.println("============================");
//			}
			datas[i] = datas[i].trim();
//			System.out.println(datas[i]);
		}
		
		people = new Person[datas.length/4];
		
	}
	
	
	public Person[] input() {
		
		for (int i = 0; i < people.length; i++) {
//			if (i*4 >= datas.length) {
//				System.out.println("인원이 더 없습니다");
//				break;
//			}
			people[i] = new Person();
			people[i].setName(datas[i*4+0]); //++i도 가능
			people[i].setPhone(datas[i*4+1]);
			people[i].setEmail(datas[i*4+2]);
			people[i].setBirth(datas[i*4+3]);
						
		}
		
		return people;
		
	}
	
	// 검색 기능
	public void find(Person[] people, String name) {
		boolean check = false;
		
		for (int i = 0; i < people.length; i++) {
			if (people[i].getName().equals(name)) {
				System.out.println(people[i].getName());
				System.out.println(people[i].getPhone());
				System.out.println(people[i].getEmail());
				System.out.println(people[i].getBirth());
				check = !check;
				break;
			}
			
		}
		
		if (check == false) {
			System.out.println("이름이 같은 학생을 찾지 못했습니다.");
		}
		
		
		
	}
	
	
	
	
	
	public String getData() {
		return data;
	}




	public void setData(String data) {
		this.data = data;
	}




	
	
	

	
	
	

}
