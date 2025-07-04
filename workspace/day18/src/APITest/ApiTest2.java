package APITest;

import apiTest02.Calc;

public class ApiTest2 {
	public static void main(String[] args) {
		Calc cal = new Calc();
		try {
			cal.divide(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 마세ㅛ우");
			e.printStackTrace();
		}
	}
}
