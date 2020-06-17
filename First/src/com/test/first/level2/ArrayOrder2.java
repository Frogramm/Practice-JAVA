package com.test.first.level2;

public class ArrayOrder2 {
	public static void main(String[] args) {
		// 선택정렬
		int[] arr = { 29, 33, 15, 88, 5, 46, 92, 1, 19 };
		int min; // 최소값 찾기위한값
		for (int i = 0; i < arr.length - 1; i++) { 
			//인덱스 값이 0~8까지이고 종류 9개 서로 비교를하면 8번 반복 , 때문에 배열길이-1번 만큼만 for문을 반복하면된다
			min = i; //i번째 부터 시작해야 하니까 i
			for (int z = i + 1; z < arr.length; z++) {
				if (arr[min] > arr[z]) { //arr[min]랑 arr[z]랑 비교해서, 
					min = z; // 만약 arr[min]값이 arr[z]보다 크면
					// 최소값은 z 인덱스 주소로 변경
				}
			}
			if (min != i) { //최소값 주소와, i주소가 같지 않다면, i와 min값 교체
				//결국 앞에서부터 순차적으로 최소값 작성. 
				//순차정렬과 다른이유 : 순차정렬과 앞에서부터 정렬은 동일하지만,
				//순차정렬은 일일이 값이 위 조건을 충족시킬때마다 두 주소끼리의 값을 교체 하였지만, 
				//선택 정렬은 최소값의 주소를 찾아서 0번 주소부터 대입.
				int gaep = arr[min];
				arr[min] = arr[i];
				arr[i] = gaep;
			}
		}
		for (int val : arr) {
			System.out.print(val + ", ");
		}
	}
}