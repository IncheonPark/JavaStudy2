package com.kakao.app.products;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.kakao.app.utils.DBConnection;

public class ProductDAO {
	
	
	
	
	
	// 상품 추가
	public int insert(ProductDTO dto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "INSERT INTO PRODUCTS "
				+ " VALUES (PRODUCTNUM_SEQ.NEXTVAL, ?, ?, ?, ? )";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, dto.getProductName());
		st.setDouble(2, dto.getProductRate());
		st.setDate(3, dto.getProductDate());
		st.setString(4, dto.getProductDetail());
		
		int check = st.executeUpdate();
		
		
		DBConnection.disConnect(st, con);
		return check;
		
		
	}
	
	
	// 상품 리스트 조회
	public List<ProductDTO> getList() throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		List<ProductDTO> list = new ArrayList<>();
		
		while (rs.next()) {			
			ProductDTO dto = new ProductDTO();
			dto.setProductNum(rs.getLong(1));
			dto.setProductName(rs.getString(2));
			dto.setProductRate(rs.getDouble(3));
			dto.setProductDate(rs.getDate(4));
			dto.setProductDetail(rs.getString(5));
			
			list.add(dto);
			
		}
		
					
		DBConnection.disConnect(rs, st, con);
		return list;
		
	}
	
	
	
	// 상품 디테일 조회
	public ProductDTO getDetail(ProductDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "SELECT * FROM PRODUCTS WHERE PRODUCTNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setLong(1, inputDto.getProductNum());
		
		ResultSet rs = st.executeQuery();
		
		ProductDTO dto = new ProductDTO();
		
		while(rs.next()) {
			dto.setProductNum(rs.getLong(1));
			dto.setProductName(rs.getString(2));
			dto.setProductRate(rs.getDouble(3));
			dto.setProductDate(rs.getDate(4));
			dto.setProductDetail(rs.getString(5));
						
		}
		
		DBConnection.disConnect(rs, st, con);
		return dto;
		
	}
	
	
	// 선택한 제품의 이자율을 수정
	public int updateRate(ProductDTO inputDto) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE PRODUCTS SET PRODUCTRATE = ? WHERE PRODUCTNUM = ?";
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setDouble(1, inputDto.getProductRate());
		st.setLong(2, inputDto.getProductNum());
		
		int check = st.executeUpdate();
		
		
		DBConnection.disConnect(st, con);
		return check;
		
	}
	
	
	
	

}
