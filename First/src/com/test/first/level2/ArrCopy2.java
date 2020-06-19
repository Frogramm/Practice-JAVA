package com.test.first.level2;

import java.util.Arrays;

public class ArrCopy2 {
	public static void main(String[] args) {
		int[] arr = {2, 4, 6, 7, 10, 55}; //주소명 : A	
		int[] arr2 = copyArr(arr); 		  //주소명 : C
		
		System.out.println(arr == arr2);
		System.out.println("arr의 주소" + arr);
		System.out.print("arr : " + Arrays.toString(arr) +"\n");
		System.out.println("arr2 : " + Arrays.toString(arr2) + "\n");
	}
	
	public static int[] copyArr(int[] n) { //주소명 : A
		System.out.println("n의 주소값" + n);
		System.out.println();
		int[] temp = new int[n.length]; //temp 는 주소명 : C || new 는객체를 만들때 사용
		System.out.println("temp의 주소값" + temp);
		System.out.println();
		for(int i = 0 ; i < n.length ; i++) {
			temp[i] = n[i]; 
		}
		return temp; //
	}
}