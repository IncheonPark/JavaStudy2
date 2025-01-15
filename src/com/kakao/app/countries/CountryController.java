package com.kakao.app.countries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryController {
	
	private CountryView countryView;
	private CountryService countryService;
	
	
	public CountryController() {
		countryView = new CountryView();
		countryService = new CountryService();
	}
	
	
	public void start() throws Exception {
				
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while (check) {
			System.out.println("1. 국가 리스트 출력");
			System.out.println("2. 국가 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			if (select == 1) {
				ArrayList<CountryDTO> arr = countryService.getList();
				countryView.view(arr);
				
			} else if (select == 2) {
				CountryDTO countryDTO = countryService.getDetail(sc);
				
				if (countryDTO != null) {
					countryView.view(countryDTO);
				} else {
					countryView.view("데이터가 없습니다.");
				}
				
			} else {
				check = false;
				System.out.println("종료합니다.");
				
			}
			
		}
		
		
		
		
		
	}

}
