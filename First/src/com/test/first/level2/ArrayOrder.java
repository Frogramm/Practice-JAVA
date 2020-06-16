package com.test.first.level2;

public class ArrayOrder {
	public static void main(String[] args) {
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 10};
		// 0번째 배열에 3번째 배열값, 3번째배열에 0번째 배열값 입력
		//순차 정렬
		for(int i = 0 ;i < arr.length-1;i++) { 
			for(int z = i+1 ; z < arr.length; z++) {
				if(arr[i] > arr[z]) {//i배열주소의 값과, i+1배열주소의 값을 비교
					//비교했을때 i배열 주소의 값이 더크면, 
					//z배열 주소의 값을 i주소의 값으로 교체
					int paste = arr[i];
					arr[i] = arr[z];
					arr[z] = paste;
				} 
			}
		}
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
