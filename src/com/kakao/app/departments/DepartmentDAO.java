package com.kakao.app.departments;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kakao.app.utils.DBconnection;

public class DepartmentDAO {
	
	
	
	// DAO > Data Access Object
	// DB의 데이터를 조회하거나, 입력, 수정, 삭제 기능
	
	// 1. 접속 정보 선언
	
	// 2. 커넥션 객체
	
	// 3. SQL문 생성
	
	// 4. 미리 보내기
	
	// 5. ?
	
	// 6. 최종 전송 및 결과 처리
	
	// 7. 연결 해제
	
	
	public ArrayList<DepartmentDTO> getList() throws Exception {
		Connection connection = DBconnection.getConnection();
		String sql = "select * from departments order by 2 desc";
		PreparedStatement st = connection.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		ArrayList<DepartmentDTO> arr = new ArrayList<>();
		
		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getInt(3));
//			System.out.println(rs.getInt(4));
			
			DepartmentDTO departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt(1));
			departmentDTO.setDepartment_name(rs.getString(2));
			departmentDTO.setManager_id(rs.getInt(3));
			departmentDTO.setLocation_id(rs.getInt(4));
			arr.add(departmentDTO);
			
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		return arr;
		
	}
	
	
	//
	public DepartmentDTO getDetail(DepartmentDTO departmentDTO2) throws Exception {
		
		DepartmentDTO departmentDTO = null;
		
		Connection connection = DBconnection.getConnection();
		
		String sql = "select * from departments where department_id = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, departmentDTO2.getDepartment_id());
		
		ResultSet rs = st.executeQuery();
		
		
		while(rs.next()) {
			//System.out.println(rs.getString("department_name"));
			departmentDTO = new DepartmentDTO();
			departmentDTO.setDepartment_id(rs.getInt(1));
			departmentDTO.setDepartment_name(rs.getString(2));
			departmentDTO.setManager_id(rs.getInt(3));
			departmentDTO.setLocation_id(rs.getInt(4));
			
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		
		return departmentDTO;
		
	}
	
	

	

}
