package com.test.first.mission;

public class MethodMission3 {
	public static void main(String[] args) {
		int result = abs(10);
		System.out.println(result);
		
		result = abs(-10);
		System.out.println(result);
	}
	public static int abs(int a) {
		/*if(a < 0) {
			return -a;
		}
		return a;*/
		return (a<0) ? -a : a;
	}

}
