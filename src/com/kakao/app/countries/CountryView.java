package com.kakao.app.countries;

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
	
	

}
