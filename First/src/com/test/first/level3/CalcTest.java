package com.test.first.level3;
//전역변수 == 멤버필드
//
public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calc.sum(20,30)); //30
		
		Calc calc1 = new Calc();
		calc1.n1 = 20;
		calc1.n2 = 30;
		System.out.println(calc1.sum());
		calc1.n1 = 30;
		calc1.n2 = 40;
		System.out.println(calc1.sum());
	}
}
