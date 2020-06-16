package com.test.first;

public class Operator2 {
	public static void main(String[] args) {
		int n1=10;
		int n2=10;
		
		int result = n1++; // 값을 더하기 전에 초기화
		System.out.println("result " + result);
		System.out.println("n1 : " + n1);
		
		int result2 = ++n2;// 값을 더한 후에 초기화
		System.out.println("result : " + result2);
		System.out.println("n2 : " + n2);
	}
}
