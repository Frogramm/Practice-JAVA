package com.test.first.level2;

public class Method3 {
	public static void main(String[] args) {
		int result = sum(15,10); // 오른쪽 부터 실행하고, 실행한 복사값을 준다.
		System.out.println(result);
		int resultm = min(10,5);
		System.out.println(resultm);
		
	}
	
	public static int min(int n1, int n2) {
		return n1 - n2;
	}
	
	public static int sum(int n1, int n2) {
		return n1 + n2;
	} //파싱 자동으로 변환 시켜줌.
	//비보이드형은 리턴이라는 키워드가 있어야함.
	//메소드 타입 크게 4가지 종류가 있다.
	//void 앞에는 = 붙일수없다 
	//void형이 아니면 앞에 = 붙일수있다.
	//비보이드문 사용시 if문 사용할때 조건이 불일치 할 수 도 있으니, if문 밑에 return을 적어 줘야한다. 아니면 에러가 난다.

}
