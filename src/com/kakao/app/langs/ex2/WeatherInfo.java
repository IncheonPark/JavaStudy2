package com.kakao.app.langs.ex2;

public class WeatherInfo {
	
	private StringBuffer info;	
	
	
	public WeatherInfo() {
		this.info = new StringBuffer();		
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("일산, -12, 0.56, 흐림,");
		this.info.append("인천* 32* 0.95* 무더위, ");
		this.info.append("제주* 56* 0.02* 건조,");
	}
	
	
	// 5. 삭제 메서드 : 기존 DTO들에서 검색한 DTO 한개 삭제
	public WeatherDTO[] delete (WeatherDTO[] dtos, WeatherDTO[] newDtos) {
				
		int count = 0;
		//확인용 출력문
		System.out.println("뉴닷 0번 도시 : " + newDtos[0].getCity());
		System.out.println("=====================================");
		
		for (int i = 0; i < dtos.length; i++) {
						
			if(dtos[i].getCity().equals(newDtos[0].getCity())) {
				count++;
			}
			
			if(count >= dtos.length) {
				break;
			}
			
			//확인용 출력문
			System.out.println("i : " + i);
			System.out.println("count : " + count);
			
			dtos[i].setCity(dtos[count].getCity());
			System.out.println("새로 넣는 시티 : " + dtos[i].getCity());
			dtos[i].setTemp(dtos[count].getTemp());
			dtos[i].setHumidity(dtos[count].getHumidity());
			dtos[i].setStatus(dtos[count].getStatus());
			
			count++;
			
		}
		
		newDtos = new WeatherDTO[dtos.length-1]; //한명 적은 DTO 배열을 만듬
		for (int i = 0; i < newDtos.length; i++) {
			
			newDtos[i] = dtos[i];
			
			
		}
		
		return newDtos;
		
		
	}
	
	
	// 3. 검색 메서드
	public WeatherDTO[] find(WeatherDTO [] dtos, String city) {
		
		WeatherDTO[] newDtos = null;
		
		for (int i = 0; i < dtos.length; i++) {
			
			if (city.equals(dtos[i].getCity())) {
				newDtos = new WeatherDTO[1];
				newDtos[0] = dtos[i];
				
			}
			
		}
		// 도시명으로 찾은 DTO 필드 출력
		if (newDtos != null) {
			WeatherView view = new WeatherView();
			view.view(newDtos);
		}
		
		return newDtos;
		
	}
	
	
	public WeatherDTO[] init() {
		//info의 정보를 파싱해서
		//WeaterDTO에 담아서
		//WeaterDTO들을 리턴해보자
		System.out.println(info);
		String strInfo = info.toString();
		strInfo = strInfo.replace('*', ',');		
		
		String[] strInfos = strInfo.split(",");		
		
		WeatherDTO[] wDto = new WeatherDTO[strInfos.length/4];
		
		for(int i = 0; i < strInfos.length; i++) {
						
			strInfos[i] = strInfos[i].trim();
			System.out.println(strInfos[i]);			
			
		}
		System.out.println("strInfos길이 : " + strInfos.length);
		
		for(int i = 0; i < strInfos.length; i++) {
			WeatherDTO dto = new WeatherDTO();
			wDto[i/4] = dto;
			dto.setCity(strInfos[i]);
			dto.setTemp(Integer.parseInt(strInfos[++i]));			
			dto.setHumidity(Double.parseDouble(strInfos[++i]));
			dto.setStatus(strInfos[++i]);
			
		}
		//wDto 확인용 출력문
//		for(int i = 0; i < wDto.length; i ++) {
//			System.out.println(wDto[i]);
//			System.out.println("wDto " + wDto[i].getCity());
//			
//		}
		
		return wDto;
		
	}
	
	
	//---------------------------------------

	public StringBuffer getInfo() {
		return info;
	}

	public void setInfo(StringBuffer info) {
		this.info = info;
	}
	
	

}
