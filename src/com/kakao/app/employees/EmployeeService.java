package com.kakao.app.employees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EmployeeService {
	
	
	// 의존성 (Defendency)
	private EmployeeDAO employeeDAO;
	
	
	public EmployeeService() {
		// 의존성 주입 (Defendency Injection) > 줄여서 DI
		employeeDAO = new EmployeeDAO();
	}
	
	
	//
	public void getInfo() throws Exception {
		
		Map <String, Object> map = employeeDAO.getInfo();		
		
		for(String key : map.keySet()) {	
			Object value = map.get(key);
			System.out.print("key: " + key + "/ value: " + value + "\t");
			
		}
		System.out.println();
		
		int[] arr = new int[5];		
		for(int a : arr) {
			
		}
		
		Set <String> set = new HashSet<>();		
		for (String str : set) {			
			
		}
		
		
	}
	
	
	//
	public ArrayList<EmployeeDTO> getList(Scanner sc) throws Exception {
		
		System.out.println("last_name에 들어갈 문자를 입력하세요");
		ArrayList<EmployeeDTO> arr = employeeDAO.getList(sc.next());
		
		return arr;
		
	}
	
	
	//
	public void getDetail() {
		
		
		
	}
	
	
	
	

}
