package com.test.first;

public class Operator5 {
	public static void main(String[] args) {
		int n1 = 11;
		int n2 = 11;
		boolean result = (n1 == n2);
		System.out.println(n1 == n2); //==연산자는 boolean type 이다.
		System.out.println(result);
		
		result = (n1 != n2);
		System.out.println(n1 != n2);
		System.out.println(result);
		
		result = n1 >= n2;
		System.out.println("n1 > n2 : " + result);
		result = n2 >= n1;
		System.out.println("n2 > n1 : " + result);
		
		// '==' '+=' '-=' '>=' '<=' '!='  <<<< 비교연산자 //// 비교연산자 결과값에 느낌표(!) 를 붙이게되면 반대의 결과값이 나온다.
		// == 연산자는 문자열 비교 불가능 
		
	}
}
