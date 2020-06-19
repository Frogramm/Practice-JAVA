package com.test.first.level3;
//사용자 정의 클래스
//객체화 시킨다 = 메모리에 올린다  instance
public class Tv {
	String name;
	boolean power;
	int channel;
	
	void changePower() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
