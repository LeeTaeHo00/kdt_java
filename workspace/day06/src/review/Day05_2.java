package review;

import java.util.Scanner;

public class Day05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2. 이름과 나이를 입력 받아 내년 나이를 출력하기 (nextInt() 사용금지)
//		클래스명 : Day05_2
//		[입출력 예시]
//		이름 : 홍길동
//		나이 : 20
//		홍길동님의 내년 나이는 21살 입니다.
//		만나이는 19살 입니다.
		
		//1) 입력 클래스 임포트 및 선언
		//2) 변수 선언 (이름, 나이)
		//3) 입력 메시지
		//4) 이름변수 = sc.nextLine()
		//5) 입력 메시지
		//6) 나이변수 = Integer.parseInt(sc.nextLine());
		//7) 출력
		
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		
		System.out.print("이름 입력 : ");
		name = sc.nextLine();
		System.out.print("\n나이 입력 : ");
		age = Integer.parseInt(sc.nextLine());
		
		System.out.println(name + "님의 내년 나이는 " + (age + 1) + "살 입니다.");
		System.out.println("만 나이는 " + (age - 2) + "살 입니다.");
	}

}
