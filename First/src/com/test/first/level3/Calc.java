package com.test.first.level3;

public class Calc {
	//int 앞에 static를 붙이게되면 객체를 여러개 만들어도 의미가 없다.
	//static 이 안붙은 메소드, 변수는 instance변수, instance 메소드 라고한다.
	int n1, n2;	
	static int sum(int a, int b) { // 옆에 int = 지역번수
		return a + b;
	}
	//static를 적으면 클래스명.으로 접근하라.
	public int sum() {
		return n1+n2;
	}
}
