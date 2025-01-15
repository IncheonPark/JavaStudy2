package com.kakao.app.departments;

import java.util.ArrayList;
import java.util.Scanner;

public class DepartmentService {
	
	DepartmentDAO departmentDAO;
	
	public DepartmentService() {
		departmentDAO = new DepartmentDAO();
	}
	
	
	//
	public ArrayList<DepartmentDTO> getList() throws Exception {
		
		return departmentDAO.getList();
		
	}
	
	
	//
	public DepartmentDTO getDetail(Scanner sc) throws Exception {
		
		DepartmentDTO departmentDTO = new DepartmentDTO();
		
		System.out.println("조회할 부서 번호 입력");
		departmentDTO.setDepartment_id(sc.nextInt());
		
		departmentDTO = departmentDAO.getDetail(departmentDTO);
		
		
		return departmentDTO;
		
	}
	
	

}
