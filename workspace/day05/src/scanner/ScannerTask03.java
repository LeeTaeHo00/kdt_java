package scanner;

import java.util.Scanner;

//11번 : 두 정수를 입력받아 합을 출력하기(next() 메소드 사용하기)
public class ScannerTask03 { // 클래스 시작
	public static void main(String[] args) { // 메인 메소드 시작
		
		// 로직구성
		// 1. 입력 받을 값 msg1 과 msg2를 선언과 동시에 초기화
		// 2. 입력 메소드 선언과 입력 클래스 임포트
		// 3. 출력(정수1 입력)
		// 4. msg1에 입력메소드 사용
		// 5. next를 사용했으므로 버퍼를 지우기 위해 nextLine 메소드 사용
		// 6. 출력(정수2 입력)
		// 7. msg2에 입력메소드 사용
		// 8. next를 사용했으므로 버퍼를 지우기 위해 nextLine 메소드 사용
		// 9. msg1과 msg2를 출력 메소드에서 형변환을 하며 두 수를 더한 값을 출력
		// 10. 스캐너 사용종료 메소드 사용
		
		String msg1 = "정수1", msg2 = "정수2"; // 입력 받을 값 msg1 과 msg2를 선언과 동시에 초기화
		Scanner sc = new Scanner(System.in); // 입력 메소드 선언과 입력 클래스 임포트
		
		System.out.println("정수1 입력"); // 출력(정수1 입력)
		msg1 = sc.next(); // msg1에 입력메소드 사용
		sc.nextLine(); // next를 사용했으므로 버퍼를 지우기 위해 nextLine 메소드 사용
		
		System.out.println("정수2 입력"); // 출력(정수 2 입력)
		msg2 = sc.next(); // msg2에 입력메소드 사용
		sc.nextLine(); // 버퍼지우기
		
		System.out.printf("%s + %s = %d 입니다", msg1, msg2, Integer.parseInt(msg1) + Integer.parseInt(msg2)); // 최종결과 출력
		
//		// 선생님 작업
//		// 두정수를 변수에 저장후 합을 출력하기
//		// 1) 정수형 변수 3개 선언
//		// 2) 결과 변수에 정수 1과 정수2를 더한 값을 대입
//		// 3) 출력
//		
//		int num1 = 10, num2 =20; // 정수형 변수 num1과 num2를 선언과 동시에 초기화 했따.
//		System.out.println("\n" + num1 + " + " + num2 + " = " + (num1 + num2)); // 연결이 아닌 연산을 하기위해 소괄호를 이용야여 연산에 우선순위를 주었다.
//		
//		// 두 정수를 입력받은 후 합을 출력하기
//		// 1. 입력 클래스 임포트 및 선언
//		// 2. 문자열 변수 2개, 정수형 형 변수 3개 (입력 변수2개, 결과 변수 1개)
//		String massage1 = "숫자 1 입력", massgae2 = "숫자 2 입력"; // 문자열 변수 2개 선언과 초기화
//		int n1, n2;			// 정수형 변수 2개 선언
//		// 3. 메시지 출력1
//		System.out.println(msg1);		
//		// 4. 입력 메소드 사용
////		n1 = Integer.parseInt(sc.next());
//		n1 = sc.nextInt();
//		// 5. 메시지 출력2
//		System.out.println(msg2);	
//		// 6. 입력 메소드 사용
////		n2 = Integer.parseInt(sc.next());
//		n2 = sc.nextInt();
//		// 7. 정수형 결과 변수1과 2에 값을 대입하고 두수를 더한값을 변수에 저장한다.
//		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		
		
		sc.close(); // End)스캐너 닫아주기
	} // 메인메소드 끝

} // 클래스 끝
