package com.test.first.mission;

import java.util.Scanner;

public class GreatMission2 {
	public static void main(String[] args) {
		//1. 사이다 500
		//2. 콜라 600
		//3. 환타 700
		//4. 마운틴듀 800
		//5. 초코우유 400
		//메뉴를 선택하세요 (종료 : 0) :
		boolean exit = true;
		int hap = 0;
		Scanner scan = new Scanner(System.in);
		String[] drink = { "사이다", "콜라", "환타", "마운틴듀", "초코우유", "바나나우유"};
		int[] price = { 500, 600, 700, 800, 400, 400};
		System.out.println("메뉴");
		for(int i = 0 ; i < drink.length ; i++) {
			System.out.printf("%d.%s (%d원)\n", i+1, drink[i], price[i]);
		}
		while(exit) {
			System.out.printf("메뉴룰 선택하세요(종료 : 0)");
			int btn = scan.nextInt();
			int btn1 = btn-1;
			if(btn == 0) {
				exit = false;
			}
			else if( btn > drink.length || btn<0) {
				System.out.println("다시 입력해주세요.");
			}
			else {
			System.out.printf("%d.%s (%d원)\n", btn, drink[btn1], price[btn1]);
			hap += price[btn1];
			}
			
		}
		//switch문
//		int btn3 = scan.nextInt();
//		int btn4 = btn3-1;
//		switch(btn3) {
//		case 0 : break;
//		case 1 : case 2 : case 3 : case 4 : case 5 : case 6 : 
//		{
//			System.out.printf("%d.%s (%d원)\n", btn3, drink[btn4], price[btn4]);
//			hap += price[btn4];
//			}
//		default : System.out.printf("다시입력해주세요.");;
//		}
		scan.close();
		System.out.printf("종료 : %,d원 사용", hap);
	}
}
