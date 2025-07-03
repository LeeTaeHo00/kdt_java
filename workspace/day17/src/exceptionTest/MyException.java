package exceptionTest;
// 사용자 정의 예외
public class MyException extends Exception{

	public MyException(String message) {
		super(message);
	}
	public MyException() {
		super("미아아아옹");
	}
}
