package com.kakao.app.departments;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentController {
	
	private DepartmentService departmentService;
	private DepartmentView departmentView;
	
	
	public DepartmentController() {
		departmentService = new DepartmentService();
		departmentView = new DepartmentView();
		
	}
	
	
	public void start() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 부서 리스트 출력");
			System.out.println("2. 부서 상세정보 출력");
			System.out.println("3. 종료");
			
			int select = sc.nextInt();
			
			if (select == 1) {
				ArrayList<DepartmentDTO> arr = departmentService.getList();
				departmentView.view(arr);
				
			} else if (select == 2) {
				DepartmentDTO departmentDTO = departmentService.getDetail(sc);
				
				if(departmentDTO != null) {
					departmentView.view(departmentDTO);
					
				} else {
					departmentView.view("없는 부서입니다.");
					
				}
				
			} else {
				check = false;
				System.out.println("종료합니다.");
				
			}			
			
			
		}
		
		
	}
	
		

}
