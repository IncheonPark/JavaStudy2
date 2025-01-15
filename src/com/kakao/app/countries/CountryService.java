package com.kakao.app.countries;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryService {
	
	private CountryDAO countryDAO;
	
	
	public CountryService() {
		
		countryDAO = new CountryDAO();
		
	}
	
	
	public ArrayList<CountryDTO> getList() throws Exception {
		
		return countryDAO.getList();
		
	}
	
	
	//
	public CountryDTO getDetail(Scanner sc) throws Exception {
				
		CountryDTO countryDTO = new CountryDTO();
		
		System.out.println("조회할 국가 번호 입력");
		countryDTO.setCountry_id(sc.next());
		
		countryDTO = countryDAO.getDetail(countryDTO);
		
		return countryDTO;
		
	}

}
