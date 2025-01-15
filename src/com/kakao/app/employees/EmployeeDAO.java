package com.kakao.app.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kakao.app.utils.DBconnection;

public class EmployeeDAO {
	
	public Map<String, Object> getInfo() throws Exception {
		
		
		// 부서별로 부서번호, 월급 평균, 사원 수 출력
		Connection con = DBconnection.getConnection();
		
		String sql = "SELECT avg(salary) a, count(employee_id) b"
				+ " FROM EMPLOYEES "
				+ " GROUP BY department_id";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		//st.setString(0, sql);
		
		ResultSet rs = st.executeQuery();
		
		//List <Map<String, Object>> arr = new ArrayList<>();
		
		Map<String, Object> map = new HashMap<>();
		
		while(rs.next()) {
			map.put("avg", rs.getDouble("a"));
			map.put("count", rs.getInt(2));
				
		}
		
		
		DBconnection.disConnect(rs, st, con);
		
		return map;
		
		
	}
	
	
	
	//
	public ArrayList<EmployeeDTO> getList(String search) throws Exception {
		
		ArrayList<EmployeeDTO> arr = new ArrayList<>();
		
		// 1. DB연결
		Connection con = DBconnection.getConnection();
		
		// 2. SQL문 생성 - ?를 ||로 감싸주어야한다. 문자열이 그냥 들어가면 양쪽에 ' '가 붙어서 문제가 생긴다.
		String sql = "SELECT EMPLOYEE_ID, LAST_NAME, JOB_ID FROM EMPLOYEES "
				+ " WHERE last_name LIKE '%'||?||'%'";
		
		
		// 3. 미리 전송
		PreparedStatement st = con.prepareStatement(sql);		
		
		// 4. ? 값 지정
		st.setString(1, search);
		
		// 5. 최종 전송 및 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeeDTO.setLast_name(rs.getString("LAST_NAME"));
			employeeDTO.setJob_id(rs.getString("JOB_ID"));
			
			arr.add(employeeDTO);
			
		}
		
		// 6. 자원 해제
		DBconnection.disConnect(rs, st, con);
		
		return arr;
		
	}
	
	
	

}
