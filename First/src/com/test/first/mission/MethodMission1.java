package com.test.first.mission;

public class MethodMission1 { // 같은 메소드 명을 사용 하는 것을 오버로딩 이라고한다. 무조건 만들수 있는것은 아니고, 파라미터가 달라져야한다.
	public static void main(String[] args) {
		MethodMission1.guguDan(5);
		MethodMission1.guguDan(4);
		MethodMission1.guguDan(4, 7);
		MethodMission1.guguDan(2, 3);

	}

	public static void guguDan(int sDan, int eDan) {
		for (int i=sDan ; i<= eDan; i++) {
			guguDan(i);
		}
	}

	public static void guguDan(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", a, i, a * i);
		}
		System.out.println();
	}

}