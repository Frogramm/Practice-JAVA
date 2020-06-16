package com.test.first.mission;

import java.util.Scanner;

public class Mission7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0; // while문 안에 선언하게되면 값이 계속 초기화되며, 밑에서 출력 불가.
		while (true) {
			System.out.printf("숫자를 입력(종료:0) : ");
			int num1 = scan.nextInt();
			if (num1 == 0) {
				break;
			} else if (num1 % 2 == 0) { // 짝수만 합계에 적용
				sum += num1;
			}
		}
		System.out.printf("합계 : %d", sum);
		scan.close();
	}
}
