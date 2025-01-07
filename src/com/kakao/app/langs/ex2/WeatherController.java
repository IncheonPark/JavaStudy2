package com.kakao.app.langs.ex2;

import java.util.Scanner;

public class WeatherController {
	
	private WeatherInfo weatherInfo;
	private WeatherView weatherView;
	private Scanner sc;
	
		
	public WeatherController () {
		this.weatherInfo = new WeatherInfo();
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
	}
	
	
	public void start() {
		
		boolean check = true;
		WeatherDTO [] dtos = null;
		
		while(check) {
			
			System.out.println("1. 날씨 정보 초기화 / 2. 날씨 정보 출력 / 3. 날씨 정보 검색 (도시명)");
			System.out.println("4. 날씨 정보 추가  / 5. 날씨 정보 삭제 / 6. 프로그램 종료 ");
			
			int select = this.sc.nextInt();		
			if (select == 1) {
				dtos = weatherInfo.init(weatherInfo.getInfo());
				
			} else if (select == 2) {				
				if (dtos != null) {
					weatherView.view(dtos);
					
				} else {
					weatherView.view("날씨 정보 데이터가 비어있습니다.");				
					}
				
			} else if (select == 3) {
				if (dtos != null) {
					System.out.println("검색할 도시명을 입력해주세요.");			
					weatherInfo.find(dtos, sc.next());
					
				} else {
					weatherView.view("날씨 정보 데이터가 비어있습니다.");				
					}
				
			} else if (select == 4) {				
				if (dtos != null) {
					System.out.println("추가할 정보를 입력해주세요.");
					System.out.println("띄어쓰기 없이 도시,기온,습도,날씨 형태로 입력");
					System.out.println("ex) 서울,10,0.1,맑음");
					dtos = weatherInfo.add(dtos, sc.next());
					System.out.println("입력한 정보가 추가되었습니다.");
					
				} else {
					weatherView.view("날씨 정보 데이터가 비어있습니다.");				
					}
				
			} else if (select == 5) {				
				if (dtos != null) {
					System.out.println("검색할 도시명을 입력해주세요.");					
					dtos = weatherInfo.delete(dtos, weatherInfo.find(dtos, sc.next()));
					System.out.println("입력한 정보가 삭제되었습니다.");
					
				} else {
					weatherView.view("날씨 정보 데이터가 비어있습니다.");					
				}
				
				
			} else {
				System.out.println("프로그램이 종료됩니다.");
				check = !check;
			}
			
		}
		
		
		
		
		
	}

}
