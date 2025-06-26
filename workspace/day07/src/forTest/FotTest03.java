package forTest;

public class FotTest03 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// 1부터 10까지 출력하기
		for(int i = 1; i <= 10; i++) // 1부터 10보다 작을 때 실행문을 반복하며 1씩 증가하기
		{
			System.out.print(i + " ");
		}
		
		System.out.println(); // 줄넘김
		
		// 1부터 10까지 중 5까지만 출력하기
		for(int i = 0; i < 10; i++) // 1부터 10보다 작을 때 실행문을 반복하며 1씩 증가하기
		{
			System.out.print(i + 1 + " "); // i + 1 값 출력
			if(i == 4) { // 조건문 검사
				break; // 조건문이 true라면 반복문 종료
			}
			System.out.println("출력"); // 출력
		}
		
		System.out.println(); // 줄넘김
		// 1부터 10까지 중 5만 제외하고 출력하기
		for(int i = 0; i < 10; i++) // 1부터 10보다 작을 때 실행문을 반복하며 1씩 증가하기
		{
			if(i == 4) { // 조건문 검사
				continue; // 조건문이 true라면 아래 출력문 건너뛰고 다음 반복 실행
			}
			System.out.print(i + 1 + " "); // i + 1 값 출력
		}

	} // 메인 메소드 끝

} // 클래스 끝
