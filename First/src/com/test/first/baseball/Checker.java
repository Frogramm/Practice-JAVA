package com.test.first.baseball;

public class Checker {
	//S : 0 / B : 0 / O : 0
	//성공하면 false, 성공전이면 true
	
	public static boolean check(int gameCnt, Baseball b, MyBall mb) {
		int countS = 0, countB = 0, countO = 0;
		for (int q = 0; q < gameCnt; q++) {
			for (int e = 0; e < gameCnt; e++) {
				if (mb.get(q) == b.get(e)) {
					if (q == e) {
						countS++;
					} else {
						countB++;
					}
				}
			}
		}
			countO = (gameCnt-countS-countB);
			System.out.printf("S : %d / B : %d / O : %d\n", countS, countB, countO);
			return countS != gameCnt;
	}
}
