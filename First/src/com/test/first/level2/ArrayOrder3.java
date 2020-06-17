package com.test.first.level2;

public class ArrayOrder3 {
	public static void main(String[] args) {
		// 버블정렬
		//뒤에서부터 정렬
		//가장 큰 값이 맨 뒤로 가게끔 해서 뒤에서 부터 앞으로 정렬
		
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int gaep;
		for (int i = 1; i < arr.length - 1; i++) {
			for (int z = 0; z < ((arr.length) - i); z++) {
				//arr.length = 배열의 길이
				//int i 값에 1을쓰는이유 
				//계산을하면 최후에 남는 값은 자동으로 최소값이 되어서 0번 주소의 값은
				//자동으로 할당되게 되어있어서 굳이 0값을 비교할 필요가 없음.
				//z비교값이 ((arr.length) - i) 들어가는 이유
				//뒤에서부터 채우기 때문에, 값이 지정된값을 비교할 필요는 없음.
				//(-i) 를 하는 이유는 i가 증가할수록 비교하는 배열값이 줄어들기 때문에
				//i만큼 빼줘야 중복 계산을 하지 않음.
				if (arr[z] > arr[z + 1]) {//arr[z]값이랑 arr[z+1]을 비교했을때 arr[z]가 더크면
					gaep = arr[z]; 
					arr[z] = arr[z + 1];
					arr[z + 1] = gaep;
					//arr[z]주소의 값 arr[z+1]주소의 값을 교체
				}
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}
