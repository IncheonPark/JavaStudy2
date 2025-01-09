package com.kakao.app.io;

import java.io.File;

public class IOMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 파일을 다루는 클래스
		File file = new File("c:\\test");
		
		boolean check = file.exists();
		
		System.out.println(check);
		
		check = file.isDirectory();		
		System.out.println(check);
		
		check = file.isFile();
		System.out.println(check);
		
		File file2 = new File(file, "study2\\sub"); 
		if(!file2.exists()) {
			file2.mkdir(); // 중간이 비어 있으면 못 만든다.
			file2.mkdirs(); // 중간이 비어 있어도 만들 수 있다.		
			
		} 
		
		File file3 = new File(file, "study2");  
		file3.delete(); // 안에 내용물이 있으면 못 지운다.
		
		
		

	}

}
