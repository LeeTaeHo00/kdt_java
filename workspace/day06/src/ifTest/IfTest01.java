package ifTest;
// 9번 : 조건문(if)
public class IfTest01 { // 클래스 시작

	public static void main(String[] args) { // 메인메소드 시작
		
		System.out.println("출력 시작" ); // 출력
		
		int number = 10; // 정수형 변수 선언
		
		if(number == 10) // 조건문 선언, 조건식이 참인지 거짓인지 확인
		{ //조건문 시작
//			System.out.println("if문의 조건식이 true 입니다."); // 출력
//			System.out.printf("숫자는 %d 입니다.\n",number);
			
			// 조건식에서 number에 저장된 값이 10과 같다면
			// number 10을 더한 값을 저장 후 출력
			
			number += 10; // number = number + 10;, 정수형 변수에 10을 더한 값을 대입
			System.out.println(number); // 출력
			
		} // 조건문 끝
		
		System.out.println("출력 끝"); // 출력
	} // 메인 메소드 끝

} // 클래스 끝
