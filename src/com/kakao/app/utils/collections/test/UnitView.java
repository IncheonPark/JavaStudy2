package com.kakao.app.utils.collections.test;

import java.util.ArrayList;

public class UnitView {
	
	public void view(ArrayList <? extends GroundUnit> ar) {
		
		System.out.println("extends 출력");
		
	}
	
public void view2(ArrayList <? super GroundUnit> ar) {
		
		System.out.println("super 출력");
		
	}

}
