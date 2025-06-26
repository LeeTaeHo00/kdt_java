package review;

public class Oper { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		int num1 = -4;
		System.out.println(num1 >> 1); // 1 0001000
		System.out.println(num1 >>> 1);
		System.out.println(Integer.toBinaryString(-4));
		System.out.println(Integer.toBinaryString(-4 >>> 1));

	}

}
