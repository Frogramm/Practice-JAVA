package com.test.first.mission;

import java.util.Scanner;

public class Mission3_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요");
		String sung = scan.next();
		scan.close();
		if (sung.equals("남") || sung.equals("여")) {
			System.out.println("키를 입력해주세요");
			int ki = scan.nextInt();
			int ki1 = 150;
			if (sung.equals("남")) {
				ki1 = 160;
			}
			if (ki > ki1) {
				System.out.println("평균 초과입니다.");
			} else if (ki < ki1) {
				System.out.println("평균 미만입니다.");
			} else {

				System.out.println("평균 입니다.");
			}
		} else {
			System.out.println("다시 실행해주세요.");
		}
	}
}
