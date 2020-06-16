package com.test.first;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 10;
		int pay = 1;
		n1 = n1 + pay;
		System.out.println("n1 : " + n1);
		int n2 = 10;
		n2 = n2 + 2;
		System.out.println("n2 : " + n2);
		
		int n3 = 10;
		n3 += 2; // 음수 쓸때는 가독성을 늘려주는게 좋다 ex)(-2)
		System.out.println("n3 : " + n3);
	}
}
