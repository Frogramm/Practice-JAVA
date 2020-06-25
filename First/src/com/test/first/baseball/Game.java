package com.test.first.baseball;


public class Game {
	//Game 메인 메서드
	public static void main(String[] args) {
		int gameCnt = 3;
		Baseball ball = new Baseball(gameCnt);
//		int val = ball.get(0); //0번째 인덱스값 리턴
		MyBall myBall = new MyBall(gameCnt);
		do {
		myBall.setNumbers();
		}while(Checker.check(gameCnt, ball, myBall));
		System.out.println("게임 종료");
			}
}
