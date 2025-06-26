package typeCasting;

// 12번 : 강제 형변환
public class TypeCasting02 { // 클래스 시작
	public static void main(String[] args) { // main 메소드 시작
		// 형변환 연산자(자료형)을 사용하여 강제 형변환을 한다.
		// 큰 범위를 가진 자료형에서 작은 범위로 변환 시 데이터 손실이 발생할 수 있다.
		
		// 컴파일러 명시적인 강제 변환이 없으면 오류를 발생시킨다.
		
		// 1) 실수 -> 정수
		double num1 =3.141592; // num1 이라는 실수형 변수를 선언과 동시에 초기화
		int result1 = (int)num1; // result1 이라는 정수형 변수에 num1을 int로 형변환하여 대입
		System.out.println(num1); // num1값 출력
		System.out.println(result1); // 형변환된 num1 값을 대입한 result1 출력
		System.out.println("실수형 num1의 값 : " + num1 + ",\n 정수형으로 변환된 값 : " + result1); // 실수형 num1값과 정수형으로 변환된 num1값 출력
		
		// 2) 큰 범위의 정수 -> 작은 범위의 정수
		long num2 = 1000L; // 8byte // num2라는 정수형 변수를 선언과 동시에 초기화
		int result2 = (int)num2; // 4byte, int형 데이터타입 result2라는 변수에 num2라는 long형 데이터 타입 정수형 변수를 형변환하여 대입
		System.out.println("long 타입 num2의 값은" +  num2 + ", int타입으로 변환된 값 : " + result2); // long형 num2 값과 int형으로 형변환된 num2값 출력
		
		// 3) 범위 초과 (오버플로우)
		long num3 = 2147483648L; // num3 라는 정수형 변수를 선언과 동시에 초기화
		int result3 = (int)num3; // result3 라는 int형 변수에 long형 변수 num3를 강제 형변환하여 대입
		
		System.out.println("long 타입의 num3 값 : " + num3 + ", 왜곡된 값 : " + result3); // long 정수형 num3 값을 출력하고, int 정수형으로 형변환된 num3값을 출력
		// 음수가 나타나는 이유 (overflow의 원리)
		// int의 범위는 32bit 자료형, 
		// 값의 범위 : -2,147,483,648 ~ 2,147,483,647
		// 음수와 달리 7로 끝나는 이유는 0을 포함하고 있기 때문
		
		// long에서 int 로 변환 => 2147483648은 int의 범위를 초과하기 때문에 상위비트(초과된 비트)가 잘리게 됨
		// 잘린값은 2의 보수 형식으로 계산되며 음수값으로 변환됩니다.
		// 32비트 1000 0000 0000 0000 0000 0000 0000 0000
		
		// 값 왜곡은 작은 자료형으로 형변환시 발생할 수 있는 문제이고 강제 형변환은 값의 범위를 초과하지 않을 때만 
		// 사용해야 한다.
		// 필요한 경우 변환하기 전 범위를 확인해야한다.
		
	} // main 메소드 끝
} // 크래스 끝
