package com.test.first.mission;

public class MethodMission2 {
	public static void main(String[] args) {
//	printStar(6);
//	printStar(3);
//	
//	printStarSqure(4);
//	printStarTriangle(5);
		printStarTriangleReverse(10);
		//필기문제 : CMD 명령어들 주관식
		//1. 폴더 생성 명령어 mkdir
		//2. 폴더 삭제 명령어 rmdir
		//3. IP주소 확인 ipconfig
		//4. 현재 시간 출력  time
		//운영체제가 하는일 두가지 메모리관리 프로세스관리
		//설명을 보고 운영체제 4가지 중에  이름 고르기(데스크탑용만) Windows, Unix, Linux, Mac
		//계층형 망형 관계형 설명보고 적어야해
		//계층형 : 데이터를 상하 종속관계로 계층화하여 관리
		//망형 : 데이터의 구조를 네트워크상의 망상 형태로 논리적으로 표현한 데이터 모델
		//관계형 : 데이터르 저장하는 테이블의 일부를 다른 테이블과 상하관계로 표시 하며 상관관계 정리
		//DBMS 관계형 , 계층형, 망형 설명을 보고 무엇인지 적으면 된다.
		//C R U D (Create, Read, Update, Delete) 기본 
		//Insert, Select 설명 필요
		//네트워크 기초 활용하기 ////// OSI 7계층 적기
		//프로토콜에대한 설명 UDP, IPX, TCP/IP
	}
	
	public static void printStarTriangleReverse(int star) {
	for(int i = star-1 ; i >= 0 ; i--) {
		printChar(' ',i);
		printStar(star-i);
		}
	}
	
	
	
	public static void printChar(char ch, int cnt) {
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print(ch);
		}
	}
	
//	public static void printStarTriangleReverse(int star) {
//		for(int i = 1 ; i <= star ; i++) {
//			for(int z = star ; z > i ; z--) {
//				System.out.print(" ");
//			}
//			printStar(i);
//		}
//	}
	
	public static void printStarTriangle(int star) {
		for(int i = 1 ; i <= star ; i ++) {
				printStar(i);
				System.out.println();
		}
	}
	
	public static void printStarSqure(int star) {
		for(int i = 0 ; i < star ; i++) {
			printStar(star);	
		}
		System.out.println();
	}
	
	public static void printStar(int star) {
		for(int i = 0 ; i < star ; i++) {
			System.out.printf("*");
		}
		System.out.println();
	}
}
