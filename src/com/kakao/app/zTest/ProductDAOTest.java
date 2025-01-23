package com.kakao.app.zTest;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

import com.kakao.app.products.ProductDAO;
import com.kakao.app.products.ProductDTO;
import com.kakao.app.users.UserDTO;

public class ProductDAOTest {
	
	private ProductDAO dao;
	private Scanner sc;	
	
	public ProductDAOTest() {
		dao = new ProductDAO();
		sc = new Scanner(System.in);
		
	}
	
	//
	public void insertTest() {
				
		ProductDTO dto = new ProductDTO();
		//dto.setProductNum("하이2");
		dto.setProductName("12345");
		dto.setProductRate(2.8);
		dto.setProductDate(Date.valueOf(LocalDate.now().plusYears(1)));
		dto.setProductDetail("저렴한 ");
								
		try {
			System.out.println(dao.insert(dto));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	
	//
	public void getListTest() throws Exception {
		List<ProductDTO> list = dao.getList();
		
		if (list != null) {
			
			for (ProductDTO dto : list) {
				System.out.print(dto.getProductNum() + " || ");
				System.out.print(dto.getProductName() + " || ");
				System.out.print(dto.getProductRate() + " || ");
				System.out.print(dto.getProductDate() + " || ");
				System.out.print(dto.getProductDetail());
				System.out.println();
				
				
			}
		
		}
		
	}
	
	
	//
	public void getDetailTest() throws Exception {
		
		System.out.println("아이디를 입력해주세요");		
		ProductDTO dto = new ProductDTO();
		dto.setProductNum(sc.nextLong());
		dto = dao.getDetail(dto);
		
		if (dto != null) {
			System.out.print(dto.getProductNum() + " || ");
			System.out.print(dto.getProductName() + " || ");
			System.out.print(dto.getProductRate() + " || ");
			System.out.print(dto.getProductDate() + " || ");
			System.out.print(dto.getProductDetail());
			System.out.println();
		}
		
	}
	
	
	//
	public void updateRateTest() throws Exception {
		
		ProductDTO dto = new ProductDTO();
		System.out.println("내용을 변경할 상품의 번호를 입력해주세요");
		dto.setProductNum(sc.nextLong());
		
		System.out.println("새로운 이자율을 입력해주세요");
		dto.setProductRate(sc.nextDouble());
		
		
		System.out.println(dao.updateRate(dto));
			
		
	}
	
	

}
