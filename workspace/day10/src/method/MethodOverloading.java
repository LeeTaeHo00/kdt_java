package method;
// 6번 : 메소드 오버로딩1
public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(1.0, 2.0);
		m.add(1, 2);

	}
	
//	// 메소드 오버로딩 전
//	void add(int num1, int num2) {
//		System.out.println(num1 + num2);
//	}
//
//	void addDouble(double num1, double num2) {
//		System.out.println(num1 + num2);
//	}
	// 메소드 오버로딩 후
	void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	void add(double num1, double num2) {
		System.out.println(num1 + num2);
	}
}
