package com.test.first.level3;

public class Monitor {
	//객체마다 다른값이 저장 되어야 한다면, static 사용 금지.
	static String brand;
	int inch;
	
	void printInfo() {
		System.out.printf("brand : %s, inch : %d\n", this.brand, this.inch);	
	}
	
	void printInch() {
		System.out.println(brand);
		System.out.println(inch);
	}
	
	static void printBrand() {
		System.out.println(brand);
	}
}
