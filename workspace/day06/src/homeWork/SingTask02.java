package homeWork;

import java.util.Scanner;

public class SingTask02 { 

	public static void main(String[] args) {
		// 로직 구성
		// 1) 입력 메소드 선언, 임포트
		// 2) 변수 1개 선언 후 초기화(사용한돈), 곡당 금액은 200원, 음료 금액은 100으로 정한다.
		// 3) 출력[사용할 금액을 입력해 주세요]
		// 4) 사용한 돈 변수에 입력 메서드 사용
		// 5) 출력[%d 곡을 부를 수 있으며 잔돈은 %원입니다] 사용한돈 / 200, 사용한돈 % 200
		// 6) 출력[음료를 마시고 싶으면 %d 곡을 부를 수 있으며 잔돈은 %d 원입니다] (사용한돈 - 100) / 200, (사용한돈 - 100) % 200
		// final) sc.close()
		
		Scanner sc = new Scanner(System.in);
		int pay = 0;
		System.out.println("사용할 금액을 입력해주세요");
		pay = sc.nextInt();
		sc.nextLine();
		
		System.out.printf("%d 곡을 부를 수 있으며 잔돈은 %원입니다", pay / 200, pay % 200);
		System.out.printf("음료를 마시고 싶으면 %d 곡을 부를 수 있으며 잔돈은 %d 원입니다", (pay - 100) / 200, (pay - 100) % 200);
		
		sc.close();
	}

}
