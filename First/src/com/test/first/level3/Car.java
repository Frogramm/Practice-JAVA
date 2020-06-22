package com.test.first.level3;
//오브젝트(Object)는 최상위 부모, 상속 지정을 안해주면 자동으로 오브젝트란 클래스에 상속됨.
public class Car {
//접근제한 크기 public>protected>default>private
//public => 접근 제한 없음
//protected => 동일한 패키지 내에 존재하거나 파생 클래스에서만 접근가능
//default => 아무런 접근 제한자를 명시하지 않으면 default값이되며, 동일한 패키지 내에서 접근가능
//private => 자기 자신의 클래스 내에서만 접근이 가능
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

	public Car(String name, String color, int cc) { //스트링값 두개와 int값 한개를 받는 생성자
	super(); //생성자는 객체 생성시 한번만 사용 가능
	//지금 역할은 기본 오브젝트의 생성자를 생성
	//2차 가공이 필요하다고하면 비void 형이 필요.
	//콘솔창에 띄우고 끝나면 void 형 사용.
	this.name = name;
	this.color = color;
	this.cc = cc;
	}
	public Car(String name) {
		this(name, "검정색", 3000);
	}
}
