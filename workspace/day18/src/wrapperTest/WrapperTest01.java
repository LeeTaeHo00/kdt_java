package wrapperTest;
// 5번 
public class WrapperTest01 {
	// boxing : 기본자교형 -> wrapper 클래스
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		
//		Integer number = new Integer(num1); 예전 방법
		
		Integer number = Integer.valueOf(num1);
		
		System.out.println(number);
		System.out.println(number.toString());
		
		// unboxing : wrapper 클래스 -> 기본 자료형
		int unNum1 = number.intValue();
		System.out.println(unNum1);
		
		double num2 = 1.1;
		Double dNum = num2; // boxing
		System.out.println(dNum);
		System.out.println(num2);
		
		// AutoUnBoxing
		double unNum2 = dNum;
		System.out.println(unNum2);
	}
	
}
