package constructorThis01;
// 3-1번 : 생성자 this
public class A {
	
	int num;
	int num2;
	
	void method(int num)
	{
		int num2;
		System.out.println("객체 자기자신의 참조값 : " + this);
		System.out.println("매개변수 num : " + num);
		System.out.println("필드 num : " + this.num);
	}
}
