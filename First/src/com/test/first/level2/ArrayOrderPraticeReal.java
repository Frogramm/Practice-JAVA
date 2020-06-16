package com.test.first.level2;

public class ArrayOrderPraticeReal {
	public static void main(String[] args) {
		int[] arr = { 18, 27, 38, 91, 46, 51, 53, 67, 11, 28};
		for(int i = 0 ; i < arr.length-1; i++) {
			for(int z = i+1; z < arr.length; z++) {
				if(arr[i] > arr[z]) {
					int gap = arr[i];
					arr[i] = arr[z];
					arr[z] = gap;
				}
			}
		}
		for(int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
