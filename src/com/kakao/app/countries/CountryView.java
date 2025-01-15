package com.kakao.app.countries;

import java.util.ArrayList;

public class CountryView {
	
	
	public void view (String message) {
		
		System.out.println(message);
		
	}
	
	
	public void view (CountryDTO countryDTO) {
		
		System.out.println("국가번호 \t 국가이름 \t 대륙번호");
		System.out.print(countryDTO.getCountry_id() + "\t");
		System.out.print(countryDTO.getCountry_name() + "\t");
		System.out.print(countryDTO.getRegion_id() + "\t");
		System.out.println();
		
	}
	
	
	public void view (ArrayList<CountryDTO> arr) {
		
		System.out.println("국가번호 \t 국가이름 \t 대륙번호");
		
		for(CountryDTO countryDTO : arr) {
			
			System.out.print(countryDTO.getCountry_id() + "\t");
			System.out.print(countryDTO.getCountry_name() + "\t");
			System.out.print(countryDTO.getRegion_id() + "\t");
			System.out.println();
			
		}
		
		
		
	}
	
	

}
