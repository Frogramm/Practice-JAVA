package com.test.first.mission;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 1 입력");
		String n1 = scan.next();
		int num1 = Integer.parseInt(n1);
		System.out.println("숫자 2 입력"); // int 로 파싱
		String n2 = scan.next();
		int num2 = Integer.parseInt(n2);
		System.out.println();
		scan.close();
	}
}
