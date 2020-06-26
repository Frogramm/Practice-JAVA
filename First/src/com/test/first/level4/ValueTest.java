package com.test.first.level4;
//다형성 특징 상속관계에서 적용 
//1. 부모타입은 자식 객체 주소값을 저장할 수 있다.(가리킬 수 있다.)
//2. 자식 타입은 부모 객체 주소값을 저장할 수 없다.(가리킬 수 없다.)
//3. 타입은 메소드 호출 할 수 있나 없나 결정!!!
//   (자기가 알고 있는 메소드만 호출 할 수 있다.) 형변환 하면 사용 가능하다.
//   호출 했을 때는 객체 기준으로 실행이 된다.
public class ValueTest {
	public static void main(String[] args) {
		String str = new String("A");
		String str2 = new String("A");
		
		System.out.println("1: " + (str== str2));
		System.out.println("2: " + str.equals(str2));
		//String 는 오버라이딩 해서 사용하기 때문에 오브젝트를 사용하지 않음
		Value val1 = new Value(1);
		Value val2 = new Value(1);
		
		System.out.println("3: " + (val1 == val2));
		System.out.println("4: " + val1.equals(val2));
		
		
	}
}
