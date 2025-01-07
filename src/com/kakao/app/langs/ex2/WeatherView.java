package com.kakao.app.langs.ex2;

public class WeatherView {
	
	public void view(String str) {
		System.out.println(str);
	}
	
	public void view(WeatherDTO [] dtos) {
		// WeatherDTO들의 정보를 출력하는 용도
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		
		for(int i = 0; i < dtos.length; i++) {
			System.out.print(dtos[i].getCity()+"\t");
			System.out.print(dtos[i].getTemp()+"\t");
			System.out.print(dtos[i].getHumidity()+"\t");
			System.out.println(dtos[i].getStatus());
		}
		
		
	}

}
