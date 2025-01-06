package com.kakao.app.langs;

public class Study2String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 하나의 문자열을 여러개의 문자열로 분리
		// 50-60-40-70 => 50, 60, 40, 70 인 네개의 문자열로 분리
		// parsing
		String data = "50-60-40-70";
		String[] datas = data.split("-");
		
		for(int i = 0; i < datas.length; i++) {
			System.out.println(datas[i]);
		}
		
		//기호를 바꿔서 스플릿 해보기---------------------
		String data2 = "55-65,45,75";
		data2 = data2.replace("-", ",");
		
		String[] datas2 = data2.split(",");
		
		for(int i = 0; i < datas2.length; i++) {
			System.out.println(datas2[i]);
		}
		
	}

}
