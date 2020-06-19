package com.test.first.level3;

public class TvTest { //대문자로 시작하는 것은 참조변수
	public static void main(String[] args) {
		Tv tv1 = new Tv(); //() << 기본생성자.
		//객체는 속성과 메소드로 이루어져있다(멤버필드, 전역변수, 메소드)
		//new 는 객체화할때 쓰는 Tv tv1은 Tv객체 주소값만 저장할수있다.
//		String str = new String();
//		str = "안녕하세요";
		System.out.println("name : " + tv1.name);
		System.out.println("power : " + tv1.power);
		System.out.println("channel : " + tv1.channel);
		System.out.println("-----------------------");
		tv1.name = "삼성TV";
		System.out.println("name : " + tv1.name);
		tv1.changePower();
		System.out.println("power : " + tv1.power);
		tv1.channelDown();
		System.out.println("channel : " + tv1.channel);
		tv1.channelUp();
		System.out.println("channel : " + tv1.channel);
	}
}