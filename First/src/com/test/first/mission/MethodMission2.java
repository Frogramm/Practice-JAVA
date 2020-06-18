package com.test.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
//	printStar(6);
//	printStar(3);
//	
//	printStarSqure(4);
//	printStarTriangle(5);
		printStarTriangleReverse(10);
	
	}
	
	public static void printStarTriangleReverse(int star) {
		for(int i = 1 ; i <= star ; i++) {
			for(int z = star ; z > i ; z--) {
				System.out.print(" ");
			}
			printStar(i);
		}
	}
	
	public static void printStarTriangle(int star) {
		for(int i = 1 ; i <= star ; i ++) {
				printStar(i);
				System.out.println();
		}
	}
	
	public static void printStarSqure(int star) {
		for(int i = 0 ; i < star ; i++) {
			printStar(star);	
		}
		System.out.println();
	}
	
	public static void printStar(int star) {
		for(int i = 0 ; i < star ; i++) {
			System.out.printf("*");
		}
		System.out.println();
	}
}
