package com.test.first;

public class Operator6 {
	public static void main(String[] args) {
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		System.out.println(str1 == str2); // 오류는 나지 않으나, false 출력 
		System.out.println(str1.equals(str2)); // 문자열 비교는 equals 로 해야한다. int 등은 오류남
		System.out.println("안녕".equals(str2)); // 변수는 뒤쪽에 넣는게 가장 안정적이다.
		System.out.println("안녕".equals("안녕"));
		System.out.println(str1.equals("안녕"));
	}
}
