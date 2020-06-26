package com.test.first.baseball;

import java.util.Scanner;

public class MyBall {
	private int mArr[];
	private Scanner scan;

	private void init(int g) {
		mArr = new int[g];
	}

	public MyBall(int g) {
		init(g);
	}

	public void setNumbers() {
		int min = 1;
		int max = 9;
		scan = new Scanner(System.in);
		for (int i = 0; i < mArr.length; i++) {
			System.out.printf("숫자%d : ", i + 1);
			String val = scan.nextLine();
			//예외처리  try / catch문
			try { //mArr[i]값 paseInt화 시켜서  
				//에러가 터지지 않았다면, String val int화 시켜서 mArr[i]에 값 대입
				mArr[i] = Integer.parseInt(val); //문자형을 정수형으로 바꿔주는 메소드
			}catch(Exception e) { //에러가 터졌다면,mArr[i] 값을 0으로 변환
					i--;
					System.out.println("숫자만 입력하세요.");
					continue;
			}
			
			if (min > mArr[i] || mArr[i] > max) {
				i--;
				System.out.println("범위 밖의 숫자를 입력하셨습니다. 재입력 바랍니다.");
				continue;
			} else {
				for (int z = 0; z < i; z++) {
					if (mArr[z] == mArr[i]) { // 중복되면 재출력
						i--;
						System.out.println("중복된 값을 입력하였습니다. 재입력 바랍니다.");
						break;
					}
				}
			}
		}
	}
	public int get(int a){
		return mArr[a];
	}
}
