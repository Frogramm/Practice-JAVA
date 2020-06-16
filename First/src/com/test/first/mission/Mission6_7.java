package com.test.first.mission;

public class Mission6_7 {
	public static void main(String[] args) {
		int star = 5;
//		for (int i = 1; i <= star; i++) {
//			for (int z = star; z > 0; z--) {
//				System.out.print(i<z ? " " : "*"); // i<z이면 공백 출력 , i<z아니면 *출력
//			}
//			System.out.println();			
//		}
//		
		
		for (int q = 0; q < star ; q++) {
			//System.out.println("0");
			for (int e = 4 ; e>q ; e--) { // 좌측 공백
				System.out.print(" ");	
			}
			for (int w = 1; w<=(q+1) ; w++)  // 별 모양 출력
				System.out.print("*");
			System.out.println();
		}
	}
}
