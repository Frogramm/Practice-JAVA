package com.test.first.level2;

public class Array {
	public static void main(String[] args) {
		// 배열 만드는 방법 1
		int[] arr = new int[4]; // 대괄호가 들어가면 배열 and 레퍼런스 변수 new키워드 --> 객체화 시킨다.
		arr[0] = 10; // 배열 선언 방법
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40; // 숫자값 초기화 안하면 0으로 셋팅
		char[] arr2 = new char[20];  // char 초기값은 " " 공백 이다.
		float[] arr3 = new float[10]; // 숫자값 초기화 안하면 0으로 셋팅 // boolean 은 false
		String[] arr4 = new String[200]; //레퍼런스 변수 안에 레퍼런스 변수 선언 
		
		//배열 만드는 방법 2
		int[] arr5 = {10, 20, 30, 40}; // 선언과 동시에 값 초기화.
		System.out.println(arr5[0]);
		//배열 쓰는 이유 : for반복문으로 활용 가능, 변수선언을 여러개 하기 싫어서
		
		
		//--------------------------------------------------------
		//나중에는 메소드로 만들고 메소드를 호출하는 방식으로 진행되는데, 확장성이 줄어들기때문에, 초기화 및 출력 문은 따로 쓰는게 좋다.
		
		
		int[] arr7 = new int[100];
		for(int i = 0; i<arr7.length ; i++) { //arr7.length << 배열안에 들어있는 크기만큼 출력된다. 현재문장에서는 100
			arr7[i] = 5; //arr7[0]~arr7[99] 까지 값에 5로 초기화
		}
			
		for(int i = 0; i<arr7.length ; i++) { //주소값. << 매우 중요
			System.out.println(arr7[i]); // arr7[0]~arr7[99] 값 출력
		}
				}
}
