package com.test.first.mission;

import java.util.Scanner;

/*
 * 월을 입력해주세요 : (1~12)
 * 3~5월  = 봄입니다.
 * 6~8월 = 여름입니다.
 * 9~11 = 가을입니다.
 * 12~2 = 겨울입니다.
 * 그외값 잘못입력했습니다.
 */
public class Mission4 {
	public static void main(String[] args) {
		System.out.println("월을 입력해주세요 : (1~12)");
		Scanner scan = new Scanner(System.in);
		String month = scan.next();
		scan.close();
		switch (month) {
		case "12":
		case "1":
		case "2":
			System.out.println("겨울입니다.");
			break;
		case "3":
		case "4":
		case "5":
			System.out.println("봄입니다.");
			break;
		case "6":
		case "7":
		case "8":
			System.out.println("여름입니다.");
			break;
		case "9":
		case "10":
		case "11":
			System.out.println("가을입니다.");
			break;
		default:
			System.out.println("잘못 입력 하였습니다.");
			break;
		}
	}

}
