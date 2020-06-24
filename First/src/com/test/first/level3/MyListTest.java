package com.test.first.level3;

import java.util.Arrays;

//자바 파일명과 일치하는 클래스가 있어야한다.
//public 을 붙일수있는 class는 파일명과 똑같은 class만 붙일 수 있다.
public class MyListTest {
	public static void main(String[]args) {
		MyList list = new MyList();
		list.add(10); //앞에 =이 없으므로 void 메소드일 가능성이 높다
		list.add(15);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		int lan = list.size(); //2
		int val = list.get(1); //15
		System.out.println(val);
		val = list.get(0); //10
		System.out.println(lan);
		System.out.println(val);
		list.add(1,100); //10 15 20 => 10, 100, 15, 20
		int delval = list.remove(); //마지막값 지우고, 지우는값을 리턴
		System.out.println(delval);
		int delVal = list.remove(3); // ()괄호안의 숫자는 n번자 인덱스
		System.out.println(delVal);
		MyArrays.print(list); //[10,1200,15] 프린트 되도록
		String str = MyArrays.toString(list);
		System.out.println();
		System.out.println(str);
		//문자열을 리턴하도록 Arrays.toString메소드 사용금지
	}
}

class MyArrays{
	
	public static String toString(MyList list){
		String str ="";
		for(int i = 0 ; i < list.size(); i++) {
			if(i > 0) { str += ", "; }
			str += list.get(i);
		}
		//return "[" + str + "]";
		return String.format("[%s]", str);
		}
	
	static void print(MyList list) {
		System.out.printf("[");
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.print(i == list.size()-1 ? list.get(i) + "]" : list.get(i) + ", ");
			
//			if(i == list.size()-1) {
//				System.out.printf("%d]", list.get(i));
//			}
//			else {
//			System.out.printf("%d,", list.get(i));
//			}
		}
//		System.out.println(Arrays.toString(list.getArr()));
	}
}

class MyList{
	
	private int[] arr; //인덱스 생성 안됌. 선언만됌
	
	MyList() {
		init();
	}
	
	int[] getArr(){
		return arr;
	}
	
	private void init() {
		arr = new int[0];
	}
	void add(int a, int b) {
		int[] temp = new int[arr.length+1];
		for(int i = 0 ; i < arr.length ; i++) {
			if(i < a){ //a보다 i가 작을때는 그냥 복사
				temp[i] = arr[i];
			}
			else { //그게아니라고하면 temp+1 인덱스 값에 arr[i]값 복사
				temp[i+1] = arr[i];
			}
		}
		temp[a] = b; //temp[a]자리에 b값 입력
		arr = temp;
		System.out.println(Arrays.toString(arr));
	}
	
	void add(int a) {
		int[] temp = new int [arr.length+1]; //배열 수가 0이니까 값이 들어갈 때가 없음 / 그래서 +1을 해줘야함
		for(int i = 0 ; i < arr.length ; i++) {
			temp[i] = arr[i]; //arr[i]값을 temp[i]에 복사
		}
		temp[arr.length] = a; //받은 값을 temp배열 마지막에 삽입
		arr = temp; //temp 주소값을 arr도 똑같이 가르키게 선언
		System.out.println(Arrays.toString(arr));
	}
	int size() {
		return arr.length;
	}
	int get(int a) {
		return arr[a];
	}
	int remove(){
		return remove(arr.length-1);
	}
//	void remove(int a) {
//		int[] temp = new int[arr.length-1];
//		for(int i = 0; i < temp.length ; i++) {
//			if(i < a) {
//				temp[i] = arr[i];
//			}
//			else {
//				temp[i] = arr[i+1];
//			}
//		}
//		arr = temp;
//		System.out.println(Arrays.toString(arr));
	int remove(int a) {
		int[] temp = new int[arr.length-1];
		for(int i = 0 ; i < temp.length ; i++) {
			if(i < a) {
				temp[i] = arr[i];
			}
			else {
				temp[i] = arr[i+1];
			}
		}
		int delVal = arr[a];
		arr = temp;
		return delVal;
	}

}
