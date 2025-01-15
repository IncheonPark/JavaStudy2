package com.kakao.app.locations;

import java.util.ArrayList;
import java.util.Scanner;

public class LocationService {
	
	private LocationDAO locationDAO;
	
	
	public LocationService () {
		locationDAO = new LocationDAO();
	}
	
	
	//
	public ArrayList<LocationDTO> getList() throws Exception {
		
		return locationDAO.getList();
		
	}
	
	
	//
	public LocationDTO getDetail(Scanner sc) throws Exception {
		
		LocationDTO locationDTO = new LocationDTO();
		
		System.out.println("조회할 지역 번호 입력");
		locationDTO.setLocation_id(sc.nextInt());
		
		locationDTO = locationDAO.getDetail(locationDTO);
		
		return locationDTO;
		
	}
	
	
	

}
