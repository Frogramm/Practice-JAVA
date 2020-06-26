package com.test.first.level4;

public class Bird extends Animal { //버드를 애니멀에 상속 시킴. 버드에서 애니멀 메소드 사용가능하나, 애니멀에서 버드 메소드 사용 불가
	//오버라이딩 : 메소드 명이 같을때 해당 class에 있는 메소드 호출
	//오버라이딩 주의사항 : @Override < 를 써주게되면, 오버라이딩 하는데 실수를 검사 해줘서 실수할 일이 없어짐
	protected Bird(String name) {
		//protected 같은패키지 + 상속관계에서 사용
		super(name, "조류"); //부모가 가지고있는 생성자를 호출하도록 바꿔줌.
	}
	void flying() {
		System.out.println("훨~~~훨~~~~");
	}
	@Override
	void crying() {
		System.out.println("쨲쨲쨲쨲쨲쨲쨲");
	}
}
