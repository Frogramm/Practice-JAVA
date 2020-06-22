package com.test.first.level3;
//this. << 내가가지고있는 맴버필드, 멤버메소드 호출
//super. << 부모가 가지고있는 맴버필드, 맴버메소드 호출
public class CarTest {
	public static void main(String[] args) {
		Car car = new Car(); //객체를 만들때는 생성자를 사용하여야 된다.
		Car car1 = new Car("그렌져", "검정색", 3000);
		Car car2 = new Car("그렌져");
		System.out.println("=========================");
		car.introduceMyCar();
		car1.introduceMyCar();
		car2.introduceMyCar();
	}
}
