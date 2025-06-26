package method;

public class StackMethod {

	public static void main(String[] args) {
		
		// 1. main 메소드 실행 -> 스택에 main 스택 프레임이 생성
		// 참조 변수 s가 main 스택 프레임에 저장됨
		// 지역변수 result가 main 스택 프로ㅔ임에 저장됨
		
		// 2. add 메소드 호출 -> 스택에 ad 스택프레임 생성
		// 매개 변수 num1 num2 변수가 add 스택 프레임에 저장됨
		// 매개 변수 값 num1 + num2  값을 가진 상태
		
		// 3. add 메소드 종료 -> add 스택프레임 삭제
		// num1, num2 가 메모리에서 제거됨
		
		// 4. mian 스택프레임의 result변수에 num1 + num2 저장됨
		
		// 5. main 메소드 종료 -> main 스택프레임 삭제
		
		StackMethod s = new StackMethod();
		int result = s.add(19, 2145);
		System.out.println(result);
	}
	
	// 두 정수의 합을 더하는 메소드
	int add(int num1, int num2) 
	{
		System.out.println("num1의 값 : " + num1 + "num2의 값 : " + num2);
		return num1 + num2;
	}
}
