package com.test.first.level3;

import java.util.ArrayList;

//어레이 리스트 문법
public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		//int 형만 받고싶으면 ArrayList뒤에  <Integer>를넣으면 된다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.remove(list.size()-1); //list 마지막 삭제
		
		int value = list.get(1); //1번 주소값 복사
		System.out.println(value);
		
		//인덱스가 필요할때
		for(int i = 0 ; i < list.size(); i++) {
			int val = (int)list.get(i);
			System.out.print(val + ", ");
		}
		//인덱스가 필요하지 않을때
		for(int val : list) {
			System.out.print((int)val + ", ");
		}
		
	}
}
