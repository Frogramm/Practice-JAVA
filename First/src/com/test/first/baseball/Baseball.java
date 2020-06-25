package com.test.first.baseball;

public class Baseball {
	private int[] rArr;

	public Baseball(int g) { // 생성자는 이름이 같고, void나 return을 넣지 않는다.
		rArr = new int[g];
		setRandom();
	}

	private void setRandom() {
		for (int i = 0; i < rArr.length; i++) { // 랜덤값 호출
			rArr[i] = (int) (Math.random() * 9 + 1); // 1~9값 rArr[i]에 입력
			for (int z = 0; z < i; z++) {
				if (rArr[z] == rArr[i]) { // 중복되면 재출력
					i--;
					break;
				}
			}
		}
	}
	public int get(int a){
		return rArr[a];
	}
}