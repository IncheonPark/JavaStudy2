package com.kakao.app.utils.collections.test;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine marine = new Marine();
		Marine marine2 = new Marine();
		Medic medic = new Medic();
		
		Wraith wraith = new Wraith();
		
		ArrayList<Marine> arr = new ArrayList<>(); //뒤에 <>는 내용 생략 가능
		arr.add(marine);
		arr.add(marine2);
		
		
		GroundUnit m = arr.get(0);
		// ----------------------------------------
		// <? extends GroundUnit>
		// <? super GroundUnit>
		ArrayList<GroundUnit> arr2 = new ArrayList<>(); //뒤에 <>는 내용 생략 가능
		arr2.add(marine2);
		arr2.add(medic);
		
		UnitView view = new UnitView();
		view.view(arr2);
		
		
	}

}
