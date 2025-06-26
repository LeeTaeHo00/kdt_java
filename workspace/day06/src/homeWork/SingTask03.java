package homeWork;

import java.util.Scanner;

public class SingTask03 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로직 구성
		// 1) 입력 메소드 선언, 임포트
		// 2) 변수 2개 선언 후 초기화(사용한돈, 부른 곡수), 
		// 3) 상수 1개 선언 곡당 금액은 200원
		// 3) 출력[사용할 금액을 입력해 주세요]
		// 4) 사용한 돈 변수에 입력 메서드 사용
		// 5) 부른 곡수에 (사용한돈 / 곡당 금액) 값을 대입
		// 6) 조건문 (부른 곡수 > 5) 실행
		// 6-1) 조건문이 참일 경우
		// 6-1-1) 출력[%d 곡 만큼 추가 곡을 획득하여 %d 곡을 부를 수 있습니다,.] 부른 곡수 / 5, 부른 곡수 + (부른 곡수 / 5)
		// 6-2) 조건문이 거짓일 경우
		// 6-2-1) 출력[%d 곡을 부를 수 있습니다,.] 부른 곡수
		// final) sc.close()
		
		Scanner sc = new Scanner(System.in);
		int pay = 0, singCount = 0;
		final int COST = 200;
		
		System.out.println("사용할 금액을 입력해주세요");
		pay = sc.nextInt();
		sc.nextLine();
		
		singCount = pay / COST;
		if(singCount >= 5) 
		{
			System.out.printf("%d 곡 만큼 추가 곡을 획득하여 %d 곡을 부를 수 있습니다", singCount / 5, singCount + (singCount / 5));
		}
		
		else 
		{
			System.out.printf("%d 곡을 부를 수 있습니다", singCount);
		}
		
		sc.close();
	}

}
