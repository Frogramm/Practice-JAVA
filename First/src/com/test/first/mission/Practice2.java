package com.test.first.mission;
import java.util.Random;
public class Practice2 {
	public static void main(String[] args) {
		//랜덤값 뽑기
//		double r = Math.random();
//		System.out.println(r); // 0~0.9999...까지 랜덤 값 호출 (1은 절대 안나옴)
		//공식 : int 명 = (int)(랜덤값*(최대범위-최소범위+1) + 최소값);
		// 80~91사이의 랜덤한값 호출 
		//EX): int rr = (int)(r*(91-80+1) + 80);
		// 0 ~ 15 까지의 랜덤값 출력
		double r = Math.random();
		int rval = (int)(r*16);
		System.out.println(rval);
		// 랜덤한 정수값 필요시, 범위 + 1 을 곱하면 된다. EX) 0~11 이면, 12를 곱하면된다.
		
		// 0 ~ 15 까지의 랜덤값 출력
		int rval2 = (int)(Math.random() * 16);
		System.out.println(rval2);
		
		//1~15 까지의 랜덤값 출력
		int rval3 = (int)(Math.random() * 15 + 1);
		System.out.println(rval3);
		
		//30~50 사이의 랜덤값 출력
		int rval4 = (int)(Math.random()* 21 + 30);
		System.out.println(rval4);
		
		//46~77 사이의 랜덤값 출력
		int rval5 = (int)(Math.random() * 32 + 46);
		System.out.println(rval5);

	}
}
