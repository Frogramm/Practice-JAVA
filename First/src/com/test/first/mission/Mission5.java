package com.test.first.mission;
import java.util.Scanner;
/*
 * 정수를 입력해 주세요 (0~100)
 * 90점 이상이면 A
 * 80점 이상이면 B
 * 70점 이상이면 C
 * 나머지는 D입니다.
 * 일의자리수가 7점 이상이면 +
 * 일의자리수가  3점 이하이면 -
 * 나머지 X
 * EX)95점이면 A 97점이면 A+출력
 */
public class Mission5 {
	public static void main(String[] args) {
		System.out.println("점수를 입력해 주세요. (0~100)");
		String gua = "";
		String m = "";
		Scanner scan = new Scanner(System.in);
		int ave = scan.nextInt();
		scan.close();
		int n1 = ave % 10;
		if (ave > 100 || ave < 0) {
			System.out.println("다시 입력해주세요.");
			return;
		} else if (ave >= 90) {
			gua = "A";
		} else if (ave >= 80) {
			gua = "B";
		} else if (ave >= 70) {
			gua = "C";
		} else {
			System.out.println("D입니다.");
			return;
		}
		if (ave == 100) {
			System.out.println("A+입니다.");
			return;
		} else if (n1 >= 7) {
			m = "+";
		} else if (n1 <= 3) {
			m = "-";
		} else {
			System.out.printf("%s입니다.", gua);
			return;
		}
		System.out.printf("%s%s입니다.",gua, m);
	}
}