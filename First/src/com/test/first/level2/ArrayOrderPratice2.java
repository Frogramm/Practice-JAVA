package com.test.first.level2;

public class ArrayOrderPratice2 {
	public static void main(String[] args) {
		// 선택정렬 오름차순
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int max;
		for (int i = 0; i < arr.length - 1; i++) {
			max = i;
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[max] < arr[z]) {
					max = z;
				}
			}
			if (max != i) {
				int gaep = arr[max];
				arr[max] = arr[i];
				arr[i] = gaep;
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}