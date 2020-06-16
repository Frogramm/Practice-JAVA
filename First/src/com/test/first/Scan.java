package com.test.first;

import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //컨트롤 쉬프트 O-> 임포트 단축키 // Scanner 이름 = new Scanner(System.in);
		System.out.print("나이?");
		int age = scan.nextInt();
		System.out.println("나이 : " + age);
		System.out.print("이름?");
		String name = scan.next();
		System.out.println("이름 : " + name);
		scan.close(); // 코딩이 길어질 경우 닫아 줘야 서버에 영향이 없다.
	}
}
