package com.test.first.level2;

public class NamedLoop {
	public static void main(String[] args) {
		
		Parant: //NamedLoop ( For문 이름 설정)
		for(int i = 0 ; i < 5 ; i++) {
			for(int z = 0 ; z < 20; z++) {
				if(z == 15) {
					break Parant; // break문 뒤에 For문 이름을 넣으면 거기까지 파괴.
				}
				System.out.printf("%d - %d\n", i, z);
			}
		}
		
	}
}
