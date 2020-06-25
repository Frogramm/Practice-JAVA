package com.test.first.level2;

public class Method1 { //C언어에서는 함수라고 불림.
	public static void  main(String[] args) { //void = 리턴타입. (String[] args) = 매개변수 / 파라미터
		//↑메소드 선언부 {} 중괄호 안부분은 메소드 구현부 void가있으면 비회신 , 없으면 회신 (일반변수값, 주소값) 둘이 호출형이 다르다.
		//메소드 안에 메소드정의 X 메소드 호출은O 
		
		Method1.sum(10,15); //이름옆에 소괄호가 있으면, 메소드와 연관 되어 있음. <<옆에는 메소드 호출
		//앞에 Method.을 붙이는 이유는 다른 메소드에서 호출할 경우, 클래스 명을 붙여줘야한다.
		Method1.minus(20,5);
	}
	public static void sum(int n1, int n2) { // 메소드 정의 , 메소드 사용은 메소드 호출
		System.out.println(n1 + n2); //메소드 호출, static = 메모리에 알아서 올라가고, 안붙이면 수동으로 올려줘야된다.
		//static 이 없으면, 객체화 시켜서 호출 해야지만 사용 가능하다.
		//주입해서 결과값만 출력
		//return 이 자동으로 들어간다 return = 종료
	}
	public static void minus(int a , int b) {
		System.out.println(a - b);
	}
}
