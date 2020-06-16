package com.test.first;

public class PrintF {
	public static void main(String[] args) {
		int age=26000;
		String name = "권하균";
		float vision = 0.5f;
		char bloodType = 'A';
		System.out.println("저의 이름은" + name + "입니다. 저의 나이는" + age +"입니다. 저의 시력은 "
		+ vision + "입니다. 저의 혈액형은" + bloodType + "입니다.");
		
		System.out.printf("나의이름은 %s 입니다. 나의나이는 %d입니다. 나의 시력은 %.2f입니다. 나의 혈액형은 %c 입니다."
				,name, age, vision, bloodType); //%s = 스트링타입 %d = 정수  %f = 실수 %c = 캐릭터형 f에는 .+숫자를넣어 자리수 설정가능 , d에는 05 / 5 써서 자리수 설정 가능
		char v1 = 'A';
		System.out.printf("\n%c : %d\n", v1, (int)v1);
		
	}

}
