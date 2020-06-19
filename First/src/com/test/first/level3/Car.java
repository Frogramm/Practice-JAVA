package com.test.first.level3;

public class Car {
	String name;
	String color;
	int cc;
	//생성자 특징
	//생성자 이름은 클래스명과 일치한다(자바한정)
	//리턴 타입이 없다.
	public Car() {
		this("소나타", "흰색", 2500);
//		this.name = "소나타";
//		this.color = "흰색";
//		this.cc = 2000;
	} // 기본 생성자
	
//	public Car(String name, String color, int cc) {
//		this.name = name;// this : 나의 객체 주소값
//		this.color = color;
//		this.cc = cc;
//	}
	
	public void introduceMyCar() {
		System.out.printf("%s 의 컬러는 %s 이고, %dcc이다.\n", name, color, cc);
	}

public Car(String name, String color, int cc) {
	super();
	this.name = name;
	this.color = color;
	this.cc = cc;
	}
}
