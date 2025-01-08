package com.kakao.app.langs.ex1;

import java.util.ArrayList;

public class PersonView {
	
	public void view(ArrayList<Person> pList) {
		
			for (int i = 0; i < pList.size(); i++) {
				System.out.println("===========================");
				System.out.println(pList.get(i).getName());
				System.out.println(pList.get(i).getPhone());
				System.out.println(pList.get(i).getEmail());
				System.out.println(pList.get(i).getBirth());
														
			}
			
		
		
	}

}
