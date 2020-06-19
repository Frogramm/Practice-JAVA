package com.test.first.level3;

public class TvTest2 {
	public static void main(String[] args) {
	Tv tv1 = new Tv();
	Tv tv2 = new Tv();
	//레퍼런스 변수는 주소값밖에 저장하지 못한다.
	//메소드에서 두개의 다른값이 나오면 동시에 전달을 못하기 때문에, 클래스안에 상속 시켜서 주소값만 전달
	tv1.channelUp();
	tv2.channelUp();
	System.out.println(tv1.channel);
	System.out.println(tv2.channel);
	}
	
}
