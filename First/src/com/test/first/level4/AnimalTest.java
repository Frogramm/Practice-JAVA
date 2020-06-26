package com.test.first.level4;
//생성자를 기본으로 넣어줄때는 생성자가 없을때 해줌.
public class AnimalTest {
	public static void main(String[] args) {
//		Animal animal = new Animal();
		Bird bird = new Bird("참새");
		Bird bird1 = new Bird("타조");
//		animal.crying();
		bird.crying();
		bird.flying();
//		Sparrow sparrow = new Sparrow();
//		sparrow.crying();
		bird.whoAmI();
		bird1.whoAmI();
		Sparrow sparrow = new Sparrow();
		sparrow.whoAmI();
	}
}
