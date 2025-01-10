package com.kakao.app.io.Files;

public class Weather {
	
	private String city;
	private int temp;
	private double humidity;
	private String status;
	
	
	
	
	public void info() {
		// 멤버 변수의 값을 출력하는 메서드
		System.out.println("도시 : " + getCity());
		System.out.println("기온 : " + getTemp());
		System.out.println("습도 : " + getHumidity());
		System.out.println("날씨 : " + getStatus());
		System.out.println("======================");
		
	}
	
	
	//-------------------------
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
