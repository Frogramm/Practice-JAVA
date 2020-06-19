package com.test.first.level3;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		Car car1 = new Car("아반떼", "흰색", 1000);
		System.out.println("=========================");
		car.introduceMyCar();
		car1.introduceMyCar();
	}
}
