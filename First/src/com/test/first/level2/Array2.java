package com.test.first.level2;

public class Array2 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		int[][] arr2 = {
				{10,20,30},
				{12,13,14,15}
		};
		arr[1][2] = 10;
		int[][][] arr3 = new int[3][4][5];
		int[] arr4 = new int[60]; // 할당된 인덱스의 개수는 같으나, 부여되는 의미와 주소는 다름
		System.out.println(arr.length);// 2 출력 (자식의 개수)
		System.out.println(arr2.length);// 2출력
		System.out.println(arr2[0].length); // 3출력 (자식안에있는 값 개수)
		System.out.println(arr2[1].length); // 4출력 (자식안에있는 값 개수)
		for(int i = 0 ; i<arr2.length; i++) {
			for(int z = 0 ; z < arr2[i].length; z++) {
				System.out.print(arr2[i][z] + ", ");
			}
			System.out.println();
		}
		}
	}
