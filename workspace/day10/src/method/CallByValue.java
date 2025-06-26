package method;
// 8번 : CallByValue
public class CallByValue {

	public static void main(String[] args) {
		
		int num = 10;
		System.out.println("메인 num = " + num);
		modifyNum(num);
		System.out.println("메인 num = " + num);
	}
	
	static void modifyNum(int num) 
	{
		System.out.println("메인 num = " + num);
		num = 20;
		System.out.println("메인 num = " + num);
	}
	// 값 자체가 복사되므로 메소드 내부에서 변경한 값이 원본에 영향을 끼치지 않는다.
}
