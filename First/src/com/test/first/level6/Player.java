package com.test.first.level6;
//추상 : abstract
//abstract클래스의 특징 
//1. 객체화 불가능
//2. 부모역할만 하겠다.(자식들의 주소값만 가르키겠다.)
public abstract class Player {
	
	public abstract void play(); //객체화를 못함.
	public void stop() {
		System.out.println("재생을 멈췄다.");
	}
}
class CDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("CD를 재생합니다.");
	}
}
class DVDPlayer extends Player{

	@Override
	public void play() {
		System.out.println("DVD를 재생합니다.");
	}
	
}
