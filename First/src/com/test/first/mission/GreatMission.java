package com.test.first.mission;

import java.util.Scanner;

public class GreatMission {
	public static void main(String[] args) {
		// 랜덤한 중복되지 않응 숫자 3개
		// 1~9
		// 4 8 2 출력
		// 자리가 맞고 숫자도 맞으면 S
		// 숫자가 맞고 자리가 틀리면 B
		// 숫자도틀리고 자리도 틀리면 O
		int countO = 0;
		int countB = 0;
		int countS = 0;
		final int ran = 3;
		int[] rArr = new int[ran];
		int[] myArr = new int[ran];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < rArr.length; i++) { //랜덤값 호출
			rArr[i] = (int) (Math.random() * 9 + 1); // 1~9값 rArr[i]에 입력
			for (int z = 0; z < i; z++) {
				if (rArr[z] == rArr[i]) {
					i--;
					break;
				}
			}
		}
		System.out.printf("값1 : %d | 값2 : %d | 값3 : %d\n", rArr[0], rArr[1], rArr[2]);
		
		while (true) {
			//내값 입력
			for (int x = 0; x < myArr.length; x++) {
				System.out.printf("값%d : ", x + 1);
				myArr[x] = scan.nextInt();
			}
			countS = 0;
			countB = 0;
			countO = 0;
			for (int q = 0; q < myArr.length; q++) {
				for (int e = 0; e < myArr.length ; e++) {
					if (myArr[q] == rArr[e]) {
						if (q == e) {
							countS++;
						} else {
							countB++;
						}
					}
				}
			}
			if(countS+countB<=ran) {
				countO = (ran-countS-countB);
			}
			if (countS == ran) {
				break;
			}
			System.out.printf("O : %d | S : %d | B : %d\n", countO, countS, countB);
		}
		scan.close();
		System.out.println("게임종료");
	}
}
