package com.test.first.level7;

public class Starcraft {
	
	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		System.out.println(m1.toString());//.toString은 생략 가능
		//마린, 현재HP : 50;
		m1.attack(m2);
		m1.attack(m2);
		System.out.println(m2);
	}
}
