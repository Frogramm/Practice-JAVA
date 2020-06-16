package com.test.first.mission;
import java.util.Scanner;
public class Mission3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("성별을 입력해주세요");
		String sung = scan.next();
		if(sung.equals("남")) {
			System.out.println("키를 입력해주세요");
			int ki = scan.nextInt();
			if(ki > 160) {
				System.out.println("평균 초과 입니다.");
			}
			else if(ki == 160) {
				System.out.println("평균 입니다.");
			}
			else if(ki < 160)
			{
				System.out.println("평균 미만 입니다.");
			}
			else{
				System.out.println("다시 실행해주세요.");
			}
		}
		else if(sung.equals("여")){
			System.out.println("키를 입력해주세요");
			int ki = scan.nextInt();
		if(ki > 150) {
			System.out.println("평균 초과 입니다.");
		}
		else if(ki == 150) {
			System.out.println("평균 입니다.");
		}
		else if(ki < 150){
			System.out.println("평균 미만 입니다.");
		}
		else {
			System.out.println("다시 실행해주세요.");
		}
		}
		else {
			System.out.println("다시 실행해주세요.");
			}
		scan.close();
		}
	
	} 

