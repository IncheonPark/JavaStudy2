package com.kakao.app.locations;

import java.util.ArrayList;
import java.util.Scanner;

public class LocationController {
	
	private LocationService locationService;
	private LocationView locationView;
	
	
	public LocationController() {
		
		this.locationService = new LocationService();
		this.locationView = new LocationView();
		
	}
	
	
	public void start() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while (check) {
			
			System.out.println("1. 지역 리스트 출력");
			System.out.println("2. 지역 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			if (select == 1 ) {
				ArrayList<LocationDTO> arr = locationService.getList();
				locationView.view(arr);
				
			} else if (select == 2) {
				LocationDTO locationDTO = locationService.getDetail(sc);
				
				if (locationDTO != null) {
					locationView.view(locationDTO);
					
				} else {
					locationView.view("데이터가 없습니다");
					
				}
				
			} else {
				check = false;
				System.out.println("종료합니다.");
				
			}
			
		
		}
		
		
	}
	
	

}
