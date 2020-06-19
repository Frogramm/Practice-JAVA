package com.test.first.level2;

import java.util.Arrays;

public class ArrCopy {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 10 };
		int[] arr2 = new int[arr.length];
		
		//int[] arr2 = arr <<<== 배열 주소 자체를 복사
		
		
		//배열안에 있는 값만 복사
		for(int i = 0 ; i < arr.length ; i++) {
			arr2[i] = arr[i]; 
		}
		//배열안에 있는 값만 복사
		
		arr2[2] = 77;
		System.out.println(arr == arr2);
		System.out.print("arr : " + Arrays.toString(arr) +"\n");
		System.out.println("arr2 : " + Arrays.toString(arr2) + "\n");
	}

}
