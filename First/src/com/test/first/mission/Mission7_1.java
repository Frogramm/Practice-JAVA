package com.test.first.mission;

public class Mission7_1 {
	public static void main(String[] args) {
		/*
		 * While조건문을 사용하여, 1~100을 모두 더한 값이 출력 되도록 하세요.
		 * 합계 : 5050
		 */
		int i = 0, sum = 0;
		while (i++ < 100) { // i 증감식 while 문에 포함, int 동시 선언 가능
			sum += i;
			System.out.println(sum);
		}
		System.out.printf("합계 : %d", sum);
	}
}
