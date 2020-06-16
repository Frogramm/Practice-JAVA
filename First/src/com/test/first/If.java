package com.test.first;

public class If {
	public static void main(String[] args) {
		int n1 = 20;
		int n2 = 20;
		if(n1 > n2)
		{
			System.out.println("n1이 n2보다 크다!");
		}
		else if(n1==n2) {
			System.out.println("n1이랑 n2랑 같다!");
		}
		else
		{
			System.out.println("n2이 n1보다 크다!");
		}
		System.out.println("끝"); //else 가 그룹안에 들어있다면, 결과값은 무조건 출력된다.
	}

}
