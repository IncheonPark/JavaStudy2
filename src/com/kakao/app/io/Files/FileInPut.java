package com.kakao.app.io.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileInPut {
	
	
	
	
	
	//--------------------------------------
	public ArrayList<Weather> input() throws Exception {
		
		File file = new File("c:\\test\\sample.text"); // 파일을 만들고
				
		FileReader reader = new FileReader(file); // 파일에 리더를 연결하고 > 문자 한개씩 밖에 못 읽음
		
		BufferedReader br = new BufferedReader(reader); // 다시, 리더에 버퍼를 연결 > 문자열로 읽을 수 있음
		
		ArrayList<Weather> list = new ArrayList<>();
		Weather weather = null;
		
		
		while(true) {
			String data = br.readLine();
			
			if(data == null) {
				break;
			}			
			
			System.out.println(data);
			System.out.println("=======================");
			
			//-----------------------------
			StringTokenizer st = new StringTokenizer(data, "-");
			
			
			while(st.hasMoreTokens()) {
				//System.out.println(st.nextToken());
				
				//Weather에 Data를 입력하고
				//Weather들을 모아서 리턴
				//main메서드에 모든 내용을 출력
				weather = new Weather();
				weather.setCity(st.nextToken());
				weather.setTemp(Integer.parseInt(st.nextToken()));
				weather.setHumidity(Double.parseDouble(st.nextToken()));
				weather.setStatus(st.nextToken());
				
				list.add(weather); // 토큰 있으면 객체 넣고
				
				
			}
			
			
		}
		
		
		br.close();
		reader.close();
		
		return list;
		
	}

}
