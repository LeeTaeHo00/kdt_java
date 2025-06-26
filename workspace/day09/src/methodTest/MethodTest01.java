package methodTest;
// 9번 : 메소드 정의
public class MethodTest01 {

	
	public static void main(String[] args) {
		
		MethodTest01 mt1 = new MethodTest01();
		// 메소드 호출
		mt1.add(10,20);
		System.out.println(mt1);
		System.out.println(mt1.add(10,20));
		
	}
	
	// 메소드 정의 순서
	// 1) 기능을 생각한다. (두 수를 더하는 기능)
	//		반환타입 메소드명 (자료형 매개변수) {}
	// 2) 반환 타입을 생각한다. 생각난지 않는다면 우선 void
	//		void 메소드명() {}
	// 3) 메소드명을 생각한다.
	//		void add() {}
	// 4) 매개 변수를 생각한다. 동신선언은 불가능
	//		void add(int num1, int num2) {}
	// 5) 실행할 문장을 생각한다.
	//		void add(int num1, int num2) 
	//		{
	//			int result = num1 + num2;
	//		}
	// 6) 리턴값을 생각한다.
	//		void add(int num1, int num2) 
	//		{
	//			int result = num1 + num2;
	//			return result;
	//		}
	// 7) 리턴 타입을 리턴값에 맞는 타입으로 변경한다.
	//		int add(int num1, int num2) 
	//		{
	//			int result = num1 + num2;
	//			return result;
	//		}
	//		
	
	int add(int num1, int num2) 
	{
		int result = num1 + num2;
		return result;
	}

//	static int add(int num1, int num2) 
//	{
//		int result = num1 + num2;
//		return result;
//	}
}
