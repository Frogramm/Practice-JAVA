package com.test.first.level5;

public class AnimalMission{
	
	public static void main(String[] args) {
	Dog dog = new Dog();
	Cat cat = new Cat();
	Sparrow spr = new Sparrow();
	
	doCry(dog);
	doCry(cat);
	doCry(spr);
	}
	
	public static void doCry(Animal ani) {
		ani.cry();
	}
}
