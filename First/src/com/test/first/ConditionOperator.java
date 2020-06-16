package com.test.first;

public class ConditionOperator {
	public static void main(String[] args) {
		int num1 = 3;
		
//		boolean isOdd = (num1 % 2 == 1 ? true : false);
//		System.out.printf("%d is odd? : %b\n", num1, isOdd);
		String result = (num1 % 2 == 1 ? "홀수" : "짝수");
		System.out.printf("%d is %s\n", num1,result);
		
	}
}
