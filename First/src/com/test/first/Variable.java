package com.test.first;

public class Variable {
	public static void main(String[] args) {
		//변수 : 값을 저장하기 위한 공간
		//예약어 : 변수명으로 사용 불가
		char v1='A'; //문자형 변수 실제로는 정수형이다.
		System.out.println(v1); 
		System.out.println("A"); 
		v1 = 'B';
		System.out.println(v1);
		byte v2=(byte)256; //오버플로우 강제형변환
		short v3=20;
		int v4=30; //(4byte) 주로사용
		long v5=50; //byte~long 정수형 변수 long (8byte)
		// 큰데서 작은곳 -> 자동 형변환 호환 가능
		// 작은데서 큰곳 -> 강제 형변환 호환 불가
		//값이  넘치면 오버플로우 / 값이 낮으면 언더 플로우
		//리터럴 literal 소스코드의 고정된 값을 대표하는 용어
		//변수, 정수 = 저장될수있는 공간  ///// 리터럴 = 저장되는 값
		System.out.println();
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		System.out.println(v5);
		float v6;  //4byte 속도빠름 / double에 비해 비정확함
		v6=(float)10.1;
		v6=10.1f;
		v6=10.1F; // 셋다 동일한 말. 소수점은 double로 기본 선언되어 형변환이 필요하다.
		double v7; //float~double 실수형 변수 , 8byte
		v7=10.1;
		v6=(float)v7;
		boolean v8; // true or false 변화가생기는 if문 등에 사용
		//나머지는 레퍼런스 변수
		v8=true;
		System.out.println(v8);
		v8=false;
		System.out.println(v8);
		String r1 = "안녕하세요"; //변수 타입이 대문자이다 : 레퍼런스 변수
		System.out.println(r1);
		Variable r2;
		//일반변수와 레퍼런스 변수 차이점 : 래퍼런스 변수는 대문자로 시작 / 
	}
}
