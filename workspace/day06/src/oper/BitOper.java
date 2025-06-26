package oper;

public class BitOper { // 클래스 시작

	public static void main(String[] args) { // 메인메소드 시작
//		System.out.println(10 & 11); // & 연산자 사용
//		System.out.println(10 | 11); // | 연산자 사용
//		System.out.println(10 ^ 11); // ^ 연산자 사용
//		System.out.println(~10); // ~ 연산자 사용

		System.out.println("십진수 : " + 10 + "=> 이진수 : " + Integer.toBinaryString(10));
		System.out.println("십진수 : " + 12 + "=> 이진수 : " + Integer.toBinaryString(12));
		
		// & 두 비트가 모두 1이면 1
		System.out.println("10 & 11의 십진수 : "  + (10 & 11)) ;
		System.out.println("10 & 11의 이진수 : "  + Integer.toBinaryString(10 & 11)) ;
		
		// | 두 비트가 하나라도 1이면 1
		System.out.println("10 & 11의 십진수 : "  + (10 | 11)) ;
		System.out.println("10 & 11의 이진수 : "  + Integer.toBinaryString(10 | 11)) ;
		
		// ^ 두 비트가 서로 다르면 1
		System.out.println("10 & 11의 십진수 : "  + (10 ^ 11)) ;
		System.out.println("10 & 11의 이진수 : "  + Integer.toBinaryString(10 ^ 11)) ;
		
		// ~ 0을 1로, 1을 0으로
		System.out.println("~10의 십진수"  + ~10) ;
		System.out.println("~10의 이진수 : "  + Integer.toBinaryString(~10)) ;
		
		System.out.println("~5의 십진수"  + ~5) ;
		System.out.println("~5의 이진수 : "  + Integer.toBinaryString(~5)) ;
	} // 메인 메소드 끝

} // 클래스 끝
