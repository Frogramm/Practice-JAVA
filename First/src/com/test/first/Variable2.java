package com.test.first;

public class Variable2 {
	public static void main (String[] args) {
		int num=10;
		int num2,num3 = 20;
		int num4=10, num5=20;
		/*변수명 작명시 주의사항
		 *1. 소문자시작! (가능한 카멜 기법 사용) ex)helloWorld
		 *2. 특수기호는 _(언더바),$(달러)만 사용 가능, 특수기호로 시작해도 무방함 
		 *3. 숫자로 시작하면 안됌. ex) int 12a
		 *4. 예악어 사용 금지 ex) int 등등
		 *5. 변수명 띄워쓰기 금지  - 책 기준 25page
		 *6. 변수명은 대소문자 구분 ex) Aa aA aa AA 다 다른 변수이다.
		 */
		
		final int NUM = 10;
		 //7. 상수명은 무조건 대문자, 구분은 언더바로 한다(실질적인 값에는 영향 X) 한번  입력된 값은 변경 불가
		System.out.println(NUM);
	}
}
