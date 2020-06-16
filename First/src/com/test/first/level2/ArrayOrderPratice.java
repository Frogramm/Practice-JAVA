package com.test.first.level2;

public class ArrayOrderPratice {
	public static void main(String[] args) {
	int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 10};
	// 0번째 배열에 3번째 배열값, 3번째배열에 0번째 배열값 입력
	//순차 정렬 (역순) 내림차순
	for(int i = 0 ;i < arr.length-1;i++) {
		for(int z = i+1 ; z < arr.length; z++) {
			if(arr[z] > arr[i]) {
				int paste = arr[z];
				arr[z] = arr[i];
				arr[i] = paste;
			} 
		}
	}
	for(int val : arr) {
		System.out.print(val + ", ");
	}
}
}
