package com.test.first.level7;

public class Starcraft {
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Medic medic = new Medic();
		FireBat fb = new FireBat();
//		System.out.println(m1.toString());//.toString은 생략 가능
//		//마린, 현재HP : 50;
		fb.attack(m1);
		fb.attack(m1);
		fb.attack(m1);
		
		System.out.println(m1);
		
		m1.attack(fb);
		m1.attack(fb);
		
		System.out.println(fb);
		medic.heal(fb);
		medic.heal(m1);
		medic.heal(medic);
		
		System.out.println(m1);
//		System.out.println(fb instanceof Carable); //fb에 들어있는 값이 Carable로 형 변환이 가능하냐?
//		System.out.println(m1 instanceof Carable); //m1에 들어있는 값이 Carable로 형 변환이 가능하냐?
		
		
		
	}
}
