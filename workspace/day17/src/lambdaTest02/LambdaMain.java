package lambdaTest02;

import java.util.Scanner;

public class LambdaMain {

	public static void main(String[] args) {
		// 인터페이스명 : CombInter(함수형 인터페이스)
		// 두 문자열을 입력받아 연결하는 메소드를 만든다 (명령문은 1줄)
		// 메인 메소드에서 익명 클래스로 객체화
		// 메인 메소드에서 람다식으로 객체화
		
		Scanner sc = new Scanner(System.in);
		
		CombInter comb1 = new CombInter() {
			
			@Override
			public String combString(String st1, String st2) {
				return st1 + st2;
			}
		};
		
		System.out.println("문자 입력");
		String a = sc.next();
		String b = sc.next();
		sc.nextLine();
		
		CombInter comb2 = (st1, st2) -> st1 + st2;
		
		System.out.println(comb1.combString(a, b));
		System.out.println(comb2.combString(a, b));
	}

}
