package com.test.first.mission;

public class Pratice3 {
	public static void main(String[] args) {
		int ran = 9;
		// 1~9사이 랜덤값
		int[] arr = new int[ran];
		//1~9 사이의 랜덤한 값이 중복되지않게 arr배열에 입력 및 출력
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.printf("for(i)문 값 : %d\n" , i);
			arr[i] = (int)(Math.random()*9+1); // 1~9값 arr[i]에 입력
			for(int z = 0 ; z<i ; z++) {
				System.out.printf("arr[%d]의값 : %d arr[%d]의값 : %d\n", z, arr[z], i, arr[i]);
				if(arr[z] == arr[i]) {
					i--;
					break;
				}
			}
			}
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}

}
