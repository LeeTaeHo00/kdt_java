package casting01;
// 4번 : casting 부모 클래스
public class Tv {
	// 필드
	boolean power;
	int ch;
	int vol;
	
	// 메소드
	void powerOnOff() 
	{
		power = !power;
		System.out.println("TV전원을 켜거나 끕니다");
	}
	
	void chUp() 
	{
		System.out.println("채널을 옵립니다.");
	}
	
	void chDown() 
	{
		System.out.println("채널을 내립니다.");
	}
}
