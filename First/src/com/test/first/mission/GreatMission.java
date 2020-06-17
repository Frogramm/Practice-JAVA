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
		int countO = 0; // O B S 체크할 숫자 선언 및 초기화
		int countB = 0;
		int countS = 0;
		final int ran = 4;
		int[] rArr = new int[ran];   //랜덤한값 들어갈 배열 선언
		int[] myArr = new int[ran];  //내가 입력할값 배열 선언
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < rArr.length; i++) { //랜덤값 호출
			rArr[i] = (int) (Math.random() * 9 + 1); // 1~9값 rArr[i]에 입력
			for (int z = 0; z < i; z++) {
				if (rArr[z] == rArr[i]) { // 중복되면 재출력
					i--;
					break;
				}
				System.out.printf("arr[%d] i값 : %d, arr[%d] z값 : %d\n", i ,rArr[i], z, rArr[z]);
			}
		}
		while (true) {
			//내값 입력
			for (int x = 0; x < myArr.length; x++) {
				System.out.printf("값%d : ", x + 1);
				myArr[x] = scan.nextInt();
				//내값입력
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
				countO = (ran-countS-countB);
			if (countS == ran) {
				break;
			}
			System.out.printf("O : %d | S : %d | B : %d\n", countO, countS, countB);
		}
		scan.close();
		System.out.println("게임종료");
	}
}
