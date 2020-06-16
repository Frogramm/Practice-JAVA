package com.test.first.mission;
public class Mission6_3 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int g = 1; g < 10; g++) {
				System.out.printf("%d * %d = %d\n", i, g, (i * g));
			}
			System.out.println("--------------------");
		}
	}
}
