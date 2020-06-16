package com.test.first.mission;

public class Mission6_1 {
	public static void main(String[] args) {
		int num = 4;
		for (int i = 14; i < 23; i++) {
			int ap = (i - 13);
			int gop = num * ap;
			System.out.printf("%d * %d = %d\n", num, ap, gop);
		}
		System.out.println("");
		for (int i = 9; i < 18; i++) {
			System.out.printf("%d * %d = %d\n", num, (i - 8), num * (i - 8));
		}
	}
}
