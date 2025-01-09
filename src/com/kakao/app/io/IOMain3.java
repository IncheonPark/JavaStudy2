package com.kakao.app.io;

import java.io.File;

public class IOMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("c:\\test", "Test.java");
		
		long size = file.length();
		System.out.println(size);
		
		file = new File("c:\\test");
		
		// -------------------------
		String[] list = file.list();
		
		for (String i : list) {
			
			File file2 = new File("c:\\test", i);
			
			if(file2.isDirectory()) {
				System.out.println(i + "는 폴더입니다.");
			} else {
				System.out.println(i + "는 파일입니다.");
			}			
			
		}
		
		// -------------------------
		File[] files = file.listFiles();
		
		for (File f : files) {
			System.out.println(f.getName());
		}
		
		

	}

}
