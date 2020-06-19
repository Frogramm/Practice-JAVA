package com.test.first.level2;

public class Method4 {
	public static void main(String[] args) {
		sum(4, 5);
		sum(5, 7, 9);
		sum(1, 2, 3, 4);
	}

	public static void sum(int... arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum : " + sum);
	}

//	public static void sum(int a, int ...arr) {
//		맨 첫째 는 일반 a 로 받고 뒤는 arr배열로 받는다.
//	}

}
