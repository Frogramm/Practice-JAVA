package com.test.first.level5;

public class Animal{
	public void cry() {
		Animal ani = new Dog();
		ani.cry();
		ani = new Cat();
		ani.cry();
		Cat cat = (Cat)ani;
	}
}
