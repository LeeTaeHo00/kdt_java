package interfaceTest04;

public class ClassB extends ClassA implements Inter1{
	// ClassA와 Inter1 양쪽에 printText() 가 있따. 메소드가 존재하지만 오류가 발생하지 않는다.\
	// 구현하는 이ㅏㄴ터페이스보다 상속받는 클래스의 우선순위가 높기 때문이다.
}
