package com.test.first.level3;

public class MonitorTest {
	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		Monitor.brand = "삼성";
		m1.inch = 30;
		m1.printInfo();
		//클래스명.으로 시작하면  static 이다.
		m2.brand = "LG";
		m2.inch = 35;
		m2.printInfo();
		m1.printInfo();
	}
}
