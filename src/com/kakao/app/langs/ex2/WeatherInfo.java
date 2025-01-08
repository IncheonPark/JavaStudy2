package com.kakao.app.langs.ex2;

import java.util.StringTokenizer;

public class WeatherInfo {
	
	private StringBuffer info;	
	
	
	public WeatherInfo() {
		this.info = new StringBuffer();		
		this.info.append("seoul, 10, 0.3, 맑음,");
		this.info.append("일산, -12, 0.56, 흐림,");
		this.info.append("인천* 32* 0.95 * 무더위, ");
		this.info.append("제주* 56* 0.02* 건조,");
	}
	
	public WeatherDTO [] init(StringBuffer buffer) {
		System.out.println(buffer);
		
		//버퍼를 String 토큰으로 만들기
		String strInfo = buffer.toString();
		strInfo = strInfo.replace('*', ',');
		
		StringTokenizer st = new StringTokenizer(strInfo, ",");
		String[] strInfos = new String[st.countTokens()];
		
		for (int i = 0; i < strInfos.length; i ++) {
			strInfos[i] = st.nextToken().trim();
			System.out.println(strInfos[i]);

		}
		
		//---------------------------------
		//String 토큰들 DTO 객체에 넣어주기
		WeatherDTO[] wDto = new WeatherDTO[strInfos.length/4];
		
		//strInfos 길이 확인용 출력문
		System.out.println("strInfos길이 : " + strInfos.length);
		
		for(int i = 0; i < strInfos.length; i++) {
			WeatherDTO dto = new WeatherDTO();
			wDto[i/4] = dto;
			dto.setCity(strInfos[i]);
			dto.setTemp(Integer.parseInt(strInfos[++i]));			
			dto.setHumidity(Double.parseDouble(strInfos[++i]));
			dto.setStatus(strInfos[++i]);
		
		}
		
		return wDto;
	}
	
	
	public WeatherDTO[] init_old(StringBuffer buffer) {
		//info의 정보를 파싱해서
		//WeaterDTO에 담아서
		//WeaterDTO들을 리턴해보자
		System.out.println(buffer);
		String strInfo = buffer.toString();
		strInfo = strInfo.replace('*', ',');		
		
		String[] strInfos = strInfo.split(",");
						
		for(int i = 0; i < strInfos.length; i++) {
						
			strInfos[i] = strInfos[i].trim();
			System.out.println(strInfos[i]);
			
		}		
		
		WeatherDTO[] wDto = new WeatherDTO[strInfos.length/4];
		
		//strInfos 길이 확인용 출력문
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
	
		
	// 5. 삭제 메서드 : 기존 DTO들에서 검색한 DTO 한개 삭제
	// 25.01.08 현재, String 비교 if문 조건 충족 후 newDtos[0].getCity()가 바뀌는 버그가 있음
	// 25.01.08 해결완료 (dtos를 변경하니까 Heap영역에서 받아올 때 의도치 않은 값 받아오는 것 확인, String 변수 하나 만들어서 데이터를 최초에 한번만 받도록 코드 변경)
	public WeatherDTO[] delete (WeatherDTO[] dtos, WeatherDTO[] newDtos) {
		
		int count = 0;
		String forEqauls = newDtos[0].getCity();
		//확인용 출력문
		System.out.println("삭제용 뉴디티오 0번 도시 : " + newDtos[0].getCity());
		System.out.println("디티오 길이 : " + dtos.length);
		System.out.println("디티오 마지막 도시 : " + dtos[dtos.length-1].getCity());
		System.out.println("=====================================");
		
		for (int i = 0; i < dtos.length; i++) {
			// 확인용 출력문
			System.out.println("위쪽에서 new,getCity : " + newDtos[0].getCity());
			// 확인용 출력문
			System.out.println("위쪽에서 forEqauls 출력 : " + forEqauls);
			
//			if(dtos[i].getCity().equals(newDtos[0].getCity())) { *** 기존 비교문 ***
			if(dtos[i].getCity().equals(forEqauls)) {
				
				// 확인용 출력문
				System.out.println(dtos[i].getCity().equals(newDtos[0].getCity()));				
				count++;
				// 확인용 출력문
				System.out.println("if문 안의 i : " + i);
				System.out.println("if문 안의 count : " + count);
			}
			
			if(count >= dtos.length) {
				break;
			}
			
			//확인용 출력문
			System.out.println("중간에서 new,getCity : " + newDtos[0].getCity());
			System.out.println("i : " + i);
			System.out.println("count : " + count);
			
			// 확인용 출력문
			System.out.println("새로 넣는 시티 : " + dtos[count].getCity());
			dtos[i].setCity(dtos[count].getCity());			
			dtos[i].setTemp(dtos[count].getTemp());
			dtos[i].setHumidity(dtos[count].getHumidity());
			dtos[i].setStatus(dtos[count].getStatus());
			
			count++;
			
			System.out.println("바닥에서 new,getCity : " + newDtos[0].getCity());
			
		}
		
		newDtos = new WeatherDTO[dtos.length-1]; //한명 적은 DTO 배열을 만듬
		for (int i = 0; i < newDtos.length; i++) {
			
			newDtos[i] = dtos[i];
			
		}
		
		return newDtos;
		
		
	}
	
	// 4. 추가 메서드
	public WeatherDTO[] add(WeatherDTO[] dtos, String sc) {
		//DTO를 담은 배열, 스캐너 입력 값
		StringBuffer buffer = new StringBuffer(sc);		
		WeatherDTO[] wDto = new WeatherDTO[dtos.length+1];
		
		//버퍼를 파싱한 WeatherDTO[] 객체를 리턴해준다.
		WeatherDTO[] addedDto = this.init(buffer);
		
		for(int i = 0; i < dtos.length; i++) {
			wDto[i] = dtos[i];			
		}
		
		for(int i = 0; i < wDto.length; i++) {
			if (i < dtos.length) {
				wDto[i] = dtos[i];
			} else {
				wDto[i] = addedDto[0];
				//addedDto의 0번 인덱스가 필요하므로 dtos.length만큼 반복한 수를 i에서 빼준다.
			}			
			
		}
		return wDto;
		
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
	
	
	
	//---------------------------------------

	public StringBuffer getInfo() {
		return info;
	}

	public void setInfo(StringBuffer info) {
		this.info = info;
	}
	
	

}
