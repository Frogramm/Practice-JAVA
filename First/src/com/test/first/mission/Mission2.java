package com.test.first.mission;
import java.util.*;

public class Mission2 {
	public static void main(String[] args) {
		/* 스캐너로 함수값 하나를 입력 받고, 그값이 홀수면 홀수
		 * 그값이 짝수면 짝수 출력
		 */
		Scanner num = new Scanner(System.in);
		System.out.println("값을 입력하세요.");
		int r = num.nextInt();
		num.close();
		if( (r % 2) == 0 )
		{
		System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
}
