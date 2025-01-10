package com.kakao.app.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class StudyClient {

	public static void main (String [] args) throws UnknownHostException, IOException {
		
		// ip : port
		// java에서는 ip + port 를 소켓이라 부른다.
		
		// 내 컴퓨터 IP 주소에 연결해보기
		// 서버에 접속
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.200.64", 8282);
		System.out.println("서버와 접속에 성공했습니다");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream(); // 0과 1을 처리하는 애
		OutputStreamWriter ow = new OutputStreamWriter(os); // 0과 1을 문자로 처리해주는 애
		BufferedWriter bw = new BufferedWriter(ow); // 문자를 문자열로 처리해주는 애
		
				
		while(true) {
			System.out.println("서버로 보낼 메세지를 입력하세요");
			String message = sc.next();
			
			bw.write(message+"\r\n");
			bw.flush();
			
			if (message.toLowerCase().equals("end")){
				System.out.println("입력한 값이 end, 종료합니다.");
				break;
			
			}
			
			//-----------------------------------------			
			System.out.println("서버의 입력을 기다리는 중");
			
			message = br.readLine();
			
			if (message.toLowerCase().equals("end")) {
				System.out.println("서버에서 보낸 값이 end, 종료합니다.");
				break;
				
			}
			
			System.out.println("Server : " + message);			
			
			System.out.println("클라이언트 종료");
		}
		
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		sc.close();

	}

}
