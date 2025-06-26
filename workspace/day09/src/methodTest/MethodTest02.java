package methodTest;
// 10번 : 메소드 호출방법
public class MethodTest02 {

	public static void main(String[] args) {
		// 메소드 호출시 2가지
		// 1) 메소드 정의하는 부분에서 static 키워드를 붙힌다 -> 아직 쓰지 말 것
		//    main메소드가 메모리에 할당될 때 해당 메소드도 같이 메모리 할당시키는 방법
		
		// 2) 메인 메못드에 해당 메소드가 이쓴 클래스를 알려준다.
		//    클래스명 객체명 = new 클래스명();
		
		
		MethodTest02 mt = new MethodTest02();
		
//		System.out.println(mt);
		
		
		// 매개변수x, 리턴값x 메소드 호출 => 객체명.메소드명();
		mt.sayHello();
		
		// 매개변수o, 리턴값x, 메소드 호출 => 객체명.메소드명(인수);
		mt.saySomething("끼야양야야양ㅅ홋우우우");
		mt.saySomething("투명드래곤이 소리쳤따ㅏㅏ");
		mt.saySomething("투명드래곤은 짱쏐따");
		
		// 매개변수x, 리턴값x, 메소드 호출 => 출력하거나 값에 저장한다.
		//								or 리턴타입 변수명 = 객체명.메소드명();
		System.out.println(mt.sayInvisibleDrgaon());
		
		// 매개변수o, 리턴값 o 메소드 호출 => syso(객체명.메소드명(인수));
									//	리턴타입 변수명 = 객체명.메소드명(인수);
		System.out.println(mt.dragonFightWithSomething("짱강한 괴물"));
		System.out.println(mt.dragonFightWithSomething("짱강한 인간"));
		System.out.println(mt.dragonFightWithSomething("짱강한 개불"));
		
	}
	
	// 매개변수x, 리턴값x
	// 안녕하세요를 출력하는 기능
	void sayHello() 
	{
		System.out.println("안녕하세요");
	}
	
	// 매개변수1, 리턴값x
	// 매개변수값을 출력하는 기능
	void saySomething(String talk) 
	{
		System.out.println(talk + " 라고 말했따");
	}
	
	// 매개변수 x, 리턴값 o
	// 1) 총합 구할 변수
	// 2) for문 초기식 int i = 1; i <= 10; i++
	// 3) 	총합 구할 변수 += i;
	// 4) 출력
	String sayInvisibleDrgaon() 
	{
		int totalSaying = 0;
		String Saying = "";
		
		for(int i = 1; i < 11; i++) 
		{
			totalSaying += i;
		}
		
		for(int i = 0; i < totalSaying; i++) 
		{
			Saying += "투명드래곤이 울부지져따 ";
		}
		
		return Saying;
	}
	
	// 매개변수 o, 리턴값 o
	// 정수1개를 넘겨받아 1부터 넘겨받은 정수까지의 합을 반환하는 메소드
	
	String dragonFightWithSomething(String monster) 
	{
		String fightResult = "";
		
		fightResult = "투명드래곤은 " + monster + "이랑 싸워서 이겼따";
		
		return fightResult;
	}
	
	
}
