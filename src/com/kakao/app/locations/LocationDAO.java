package com.kakao.app.locations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kakao.app.utils.DBconnection;

public class LocationDAO  {
	
	
	
	
	public ArrayList<LocationDTO> getList() throws Exception {
		
		String sql = "select * from locations order by 2 desc";
		
		Connection connection = DBconnection.getConnection();
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		ArrayList<LocationDTO> arr = new ArrayList<>();
		
		while(rs.next()) {
//			System.out.println(rs.getInt(1));
//			System.out.println(rs.getString(2));
//			System.out.println(rs.getString(3));
//			System.out.println(rs.getString(4));
//			System.out.println(rs.getString(5));
//			System.out.println(rs.getString(6));
			
			LocationDTO locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt(1));
			locationDTO.setStreet_address(rs.getString(2));
			locationDTO.setPostal_code(rs.getString(3));
			locationDTO.setCity(rs.getString(4));
			locationDTO.setState_province(rs.getString(5));
			locationDTO.setCountry_id(rs.getString(6));
			arr.add(locationDTO);			
			
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		return arr;
		
	}
	
	
	//---------------
	public LocationDTO getDetail(LocationDTO locationDTO2) throws Exception {
		
		LocationDTO locationDTO = null;
		
		String sql = "select * from locations where location_id = ?";
		
		Connection connection = DBconnection.getConnection();
		
		PreparedStatement st = connection.prepareStatement(sql);
		st.setInt(1, locationDTO2.getLocation_id());
		
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			locationDTO = new LocationDTO();
			locationDTO.setLocation_id(rs.getInt(1));
			locationDTO.setStreet_address(rs.getString(2));
			locationDTO.setPostal_code(rs.getString(3));
			locationDTO.setCity(rs.getString(4));
			locationDTO.setState_province(rs.getString(5));
			locationDTO.setCountry_id(rs.getString(6));
						
//			LOCATION_ID
//			STREET_ADDRESS
//			POSTAL_CODE
//			CITY
//			STATE_PROVINCE
//			COUNTRY_ID
		}
		
		DBconnection.disConnect(rs, st, connection);
		
		return locationDTO;
		
	}

}
