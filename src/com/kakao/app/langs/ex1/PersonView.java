package com.kakao.app.langs.ex1;

public class PersonView {
	
	public void view(Person[] people) {
		
			for (int i = 0; i < people.length; i++) {			
				System.out.println("===========================");
				System.out.println(people[i].getName());
				System.out.println(people[i].getPhone());
				System.out.println(people[i].getEmail());
				System.out.println(people[i].getBirth());
										
			}
			
		
		
	}

}
