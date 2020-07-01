package com.test.first.level8;
//통신할때 에러 자주 발생함
//그때 사용하는 try catch문
//try catch 문에 finally 넣어도되고 안넣어도되는데 넣게되면 return값을 넣어도 finally값은 무조건 출력
public class TryCatchTest {
	public static void main(String[] args) {
		meth();
//		meth2();
		System.out.println("dddd");
		int a = div(10,0);
		System.out.println("a : " + a);
	}
	public static int div(int n1, int n2) {
		try {
			return n1/n2;
		} catch(Exception e) {
			return 0;
		}
	}
	public static void meth2() throws ClassNotFoundException{
		Class.forName("abc");
	}
	
	public static void meth() {
		int result = 0;
		try {
			result = 10 / 0;
			Class.forName("");
		}
		catch(ClassNotFoundException e){
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외가 발생하였습니다.");
		}finally {
			System.out.println("finally");
		}
		System.out.println("result : " + result);
		System.out.println("종료!");
	}
}
