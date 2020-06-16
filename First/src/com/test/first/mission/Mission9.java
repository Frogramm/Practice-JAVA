package com.test.first.mission;

public class Mission9 {
	public static void main(String[] args) {
		/*
		 * arr 1~100값이 들어가도록 해주세요
		 *  순서대로 0번방에1 1번방에2 
		 *  ...... 99번방에 100
		 *  각방에있는 모든 값을 더해서 출력
		 */
		int sum = 0;
		int ary = 10;
		int[] arr = new int[ary];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		for (int z = 0; z < arr.length; z++) {
			sum += arr[z];
		}
		System.out.printf("합계 = %d\n", sum);
		for (int q = 0; q < arr.length; q++) { //1번방법
			System.out.print(arr[q]);
			if (q + 1 < arr.length) { // q+1이 배열 길이보다 커지면  "," 출력 X
				System.out.print(", ");
			}
		}
		System.out.println();
		for(int y = 0 ; y < arr.length; y++) { //2번방법 , 제일 간단
			if(y != 0) {
				System.out.print(", "); //y가 0이면 ","출력 X // 나머지는 ","출력
			}
			System.out.print(arr[y]);
		}
	}
}
