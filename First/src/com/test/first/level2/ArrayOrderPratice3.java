package com.test.first.level2;

public class ArrayOrderPratice3 {
	public static void main(String[] args) {
		//버블정렬 오름차순
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int gaep;
		for (int i = 1; i < arr.length-1; i++) {
			for (int z = 0; z < ((arr.length)-i); z++) {
				if(arr[z] < arr[z+1]) {
					gaep = arr[z];
					arr[z] = arr[z+1];
					arr[z+1] = gaep;
				}
			}
			}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}

