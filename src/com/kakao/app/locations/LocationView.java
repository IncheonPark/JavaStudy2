package com.kakao.app.locations;

public class LocationView {
	
	
	
	public void view (String message) {
		System.out.println(message);
	}
	
	
	public void view (LocationDTO locationDTO) {
		
//		LOCATION_ID
//		STREET_ADDRESS
//		POSTAL_CODE
//		CITY
//		STATE_PROVINCE
//		COUNTRY_ID
		
		System.out.println("지역번호 \t 거리주소 \t 우편번호 \t 도시 \t 지방 \t 국가번호");
		System.out.print(locationDTO.getLocation_id() + "\t");
		System.out.print(locationDTO.getStreet_address() + "\t");
		System.out.print(locationDTO.getPostal_code() + "\t");
		System.out.print(locationDTO.getCity() + "\t");
		System.out.print(locationDTO.getState_province() + "\t");
		System.out.print(locationDTO.getCountry_id() + "\t");
		System.out.println();
		
	}
	
	

}
