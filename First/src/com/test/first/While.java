package com.test.first;
//for 문은 몇번 반복할지 알때 사용, 조건인동안 돌았으면 좋겠다. 라고하면 While
public class While {
	public static void main(String[] args) {
		for(int i = 0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println("-----------------------------");
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}

}