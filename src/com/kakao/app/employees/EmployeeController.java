package com.kakao.app.employees;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeController {
	
	private EmployeeService employeeService;
	private EmployeeView employeeView;
	
	
	public EmployeeController() {
		// 의존성 주입
		employeeService = new EmployeeService();
		employeeView = new EmployeeView();
	}
	
	
	
	//
	public void start() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while (check) {
			
			System.out.println("1. 사원 목록 출력 / 2. 부서 정보 출력 / 3. 종료하기");			
			int select = sc.nextInt();
			
			if (select == 1) {
				ArrayList<EmployeeDTO> arr = employeeService.getList(sc);
				employeeView.view(arr);
				
			} else if (select == 2) {
				employeeService.getInfo();
			} else {
				check = false;
				System.out.println("종료합니다.");
				
			}
			
		}
		
		
	}
	
	

}
