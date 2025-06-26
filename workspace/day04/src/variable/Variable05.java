package variable;
// 변수를 사용하는 이유
public class Variable05 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		
		// 1) 반복되는 값을 쉽게 관리하기 위해서
		// 같은 값을 여러곳에서 사용하거나 변경해할 때 변수에 저장하면 코드 수정이 간편해진다.
		// 변수값을 변경하면 해당 변수를 참조하는 모든 코드에 변경사항이 자동으로 적용된다.
		
		int price = 100, quantity = 5; // int 형 변수 price와 quantity를 선언과 동시에 초기화
		// 출력
		System.out.println("가격 : " + price); 		// int형 변수 를 가격이라는 문자열에 연결하여 출력후 줄넘김
		System.out.println("수량 : " + quantity);	// int형 변수 를 수령이라는 문자열에 연결하여 출력후 줄넘김
		
		System.out.println("총 가격 : " + price * quantity + "\n"); // price * quantity를 곱한 값을 총 가격을 연결하여 출력한후 두번 줄넘김
		
		
		price = 200; // price 라는 int형 변수를 200으로 변경
		
		System.out.println("가격 : " + price); // int형 변수 를 가격이라는 문자열에 연결하여 출력후 줄넘김
		System.out.println("수량 : " + quantity); // int형 변수 를 수령이라는 문자열에 연결하여 출력후 줄넘김
		
		System.out.println("총 가격 : " + price * quantity); // price * quantity를 곱한 값을 총 가격을 연결하여 출력한후 두번 줄넘김
		
		// 값에 의미를 부여하기 위해서(값에 이름을 붙혀준다)
		// 변수에 이름을 붙이면 코드의 의미를 명확히 전달할 수 있따.
		// 문자열이나 숫자를 직접 사용하는 것보다 변수명을 통해 코드의 목적을 쉽게 이해 할 수 있따.
		
		int userAge = 20; // userAge라는 20이라는 정수를 대입
		final double PI = 3.141592; // PI라는 실수형 상수값에 원주율 대입
		boolean isStudent = true; // isStudent라는 boolean 값에 true대입
		
		System.out.println("사용자 나이 : " + userAge); // userAge에 넣어진 값을 사용자 나이에 연결하여 출력
		System.out.println("원주율 값 : " + PI); // PI에 넣어진 값을 원주율 값에 연결하여 출력
		System.out.println("학생 인가요? : " + isStudent); // isStudent에 넣어진 값을 학생 인가요?에 연결하여 출력
		
		// 문자열 + 변수명(값) => 연결되어 출력된다.
		
		//3) 프로그램의 가독성, 유지보수성, 재사용을 높이기 위해서 사용한다.
		// 코드에서 직접값을 사용하는 매직넘버를 피하고 변수를 사용하면 수정과 유지보수가 용이하다.
		
		int number; // RAM에서 상자를 만들고 그 상자의 이름을 number로 지정
		number = 10;	// number 라는 상자에 10이라는 정수형 값을 저장, 이 number 상자는 RAM에서 특정 주소값을 가진다.
		System.out.println(number); // number라는 변수를 출력후 줄넘김
		// 컴퓨터는 number의 주소값을 ㅂ보고 RAM에서 데이터를 읽어온다.
		// 주소값에 있는 데이터를 출력한다.
		
		//
	} // main메소드 끝
} // 클래스 끝
