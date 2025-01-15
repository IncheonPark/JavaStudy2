package com.kakao.app.front;

import java.util.Scanner;

import com.kakao.app.countries.CountryController;
import com.kakao.app.departments.DepartmentController;
import com.kakao.app.employees.EmployeeController;
import com.kakao.app.locations.LocationController;

public class FrontController {
	
	private DepartmentController departmentController;
	private LocationController locationController;
	private CountryController countryController;
	private EmployeeController employeeController;
	
	
	public FrontController() {
		departmentController = new DepartmentController();
		locationController = new LocationController();
		countryController = new CountryController();
		employeeController = new EmployeeController();
	}
	
	
	public void start() {
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			try {
				System.out.println("1. 부서 관리");
				System.out.println("2. 지역 관리");
				System.out.println("3. 국가 관리");
				System.out.println("4. 사원 관리");
				System.out.println("5. 종료");
				
				int select = sc.nextInt();
				
				if (select == 1) {
					departmentController.start();
					
				} else if (select == 2) {
					locationController.start();
					
				} else if (select == 3) {
					countryController.start();
					
				} else if (select == 4) {
					employeeController.start();
					
				} else {
					check = false;
					System.out.println("종료합니다.");
					
				}
				
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			
			
			
		}
		
	}
	
	
	

}
