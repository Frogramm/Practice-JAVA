package com.test.first.mission;

import java.util.Scanner;

public class Mission8 {
	public static void main(String[] args) {
		// 랜덤값 10~90을 맞추는 게임
		int max = 90, min = 10;
		System.out.printf("랜덤값 %d~%d을 맞추는 게임\n", min, max);
		System.out.println("--------------------");
		Scanner scan = new Scanner(System.in);
		int rr = (int) (Math.random() * ((max - min) + 1) + min);
		while (true) {
			System.out.print("값 입력 : ");
			int gaep = scan.nextInt();
			if (gaep < min || gaep > max) {
				System.out.println("다시 입력해주세요.");
			} else if (gaep > rr) {
				System.out.println("DOWN");
			} else if (gaep < rr) {
				System.out.println("UP");
			} else {
				break;
			}
		}
		System.out.println("Great");
		scan.close();
	}
}
