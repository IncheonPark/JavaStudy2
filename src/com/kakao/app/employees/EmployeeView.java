package com.kakao.app.employees;

import java.util.ArrayList;

public class EmployeeView {
	
	
	
	public void view (ArrayList<EmployeeDTO> arr) {
		
		System.out.println("사원번호 \t\t 사원이름 \t\t 직업번호");
		
		for (EmployeeDTO employeeDTO : arr) {
			
			System.out.print(employeeDTO.getEmployee_id()+"\t\t");
			System.out.print(employeeDTO.getLast_name()+"\t\t");
			System.out.print(employeeDTO.getJob_id()+"\t\t");
			System.out.println();
			
		}
		
	}
	

}
