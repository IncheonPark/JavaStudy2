package com.kakao.app.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class StudyServer {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		ServerSocket ss = new ServerSocket(8282);
		
		// 클라이언트의 접속을 기다린다.
		System.out.println("클라이언트의 접속을 기다리는 중");
		
		// 클라이언트와 1:1 Socket 연결
		Socket socket = ss.accept();
		
		System.out.println("클라이언트와 연결 성공");
		
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		OutputStream os = socket.getOutputStream(); // 0과 1을 처리하는 애
		OutputStreamWriter ow = new OutputStreamWriter(os); // 0과 1을 문자로 처리해주는 애
		BufferedWriter bw = new BufferedWriter(ow); // 문자를 문자열로 처리해주는 애
		
		
		boolean check = true;
		while(check) {			
			
			System.out.println("클라이언트의 입력을 기다리는 중");
			String message = br.readLine();
			
			if(message.toLowerCase().equals("end")) {
				System.out.println("클라이언트에서 보낸 값이 end, 종료합니다.");
				break;
			}
			
			System.out.println("Client : " + message);			
			
			//----------------------------			
			System.out.println("클라이언트로 보낼 메세지를 입력하세요");
			message = sc.next();
			
			bw.write(message+"\r\n");
			bw.flush();
			
			System.out.println("서버 종료");
			
			if(message.toLowerCase().equals("end")) {
				System.out.println("입력받은 값이 end, 종료합니다.");
				break;
			}
			
		}
			
			br.close();
			ir.close();
			is.close();
			
			bw.close();
			ow.close();
			os.close();
			
			socket.close();
			ss.close();
			sc.close();
		
		
		
	}
	

}
