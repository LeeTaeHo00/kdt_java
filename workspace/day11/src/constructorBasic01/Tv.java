package constructorBasic01;

public class Tv {
	// 필드
	// 채널, 볼륨, 전원, 색상, 브랜드
	boolean power; // false 기본값
	int ch;
	int vol;
	String color;
	String brand;
	
	// 생성자
	
	
	
	// 메소드
	
	// 전원을 끄고 킬수 이쓴 메소드
	void powerOnOff() 
	{
		power = !power;
		System.out.println("전원사앹 : " + (power ? "켜짐" : "꺼짐"));
//		if(!power) {System.out.println("전원 켜져있따");}
//		else {System.out.println("전원 꺼져있따");}
	}
	
	// 매개변수가 6개 있는 생성자
	// 생성자 : alt + shift + s
	public Tv() {} // 기본 생성자
	
	// 생성자 오버로딩(매개변수가 다른 생성자)
	public Tv(int ch, int vol, String color, String brand) {

		this.ch = ch;
		this.vol = vol;
		this.color = color;
		this.brand = brand;
	}
	


	// 볼륨을 내리는 메소드
	// decreaseVoluem;
	// if(power가 false라면) sysout (전원을 켜주세요)
	// if(volume이 1보다 크고 파워가 켜져있따면)
	// 		볼륨 -1
	void decreaseVolume() 
	{
		if(!power) System.out.println("전원을 켜주세요");
		else 
		{
			if(vol > 0) vol -= 1;
			else if(vol == 0) System.out.println("볼륨이 최소치 입니다.");
		}
		
		System.out.println("형재 볼륨은 " + vol + "입니다");
	}
	

	// 볼륨을 올리수 있는 메소드
	// increaseVolume
	// ifelse
	// power => true 볼륨 +1
	// 		vol <= 99
	//			볼륨 +1
	//			100 초과 불가
	// power => false "전원을 켜주세요
	// 1. 전원 상태확인
	// 2. 현재 볼륨이 99이ㄹ하라면 볼륨을 1증가
	// 3. 100일경우 볼륨이 최대치 입니다
	// 4. 꺼져있으면 전원을 먼저 켜주세요
	void increaseVolum() 
	{
		if(!power) System.out.println("전원을 켜주세요");
		else 
		{
			if(vol < 99) vol += 1;
			else if(vol == 100) System.out.println("볼륨이 최대치 입니다.");
		}
		
		System.out.println("형재 볼륨은 " + vol + "입니다");
	}
	
	
	// 채녈을 올리는 메소드
	// increaseCh
	// if~else if 문 사용
	// 조건문 !power
	// 만약 컴퓨터 전원이 꺼져 있다면 전원을 켜주라는 메시지 출력
	// else 조건문 (파워가 켜져있따면)
	// ch ++
	void increaseCh() 
	{
		if(!power) System.out.println("전원을 켜주세요");
		else 
		{
			if(ch < 99) ch += 1;
			else if(ch == 100) System.out.println("채녈이 최대치 입니다.");
		}
		System.out.println("형재 채널은 " + ch + "입니다");
	}
	
	// 채널을 내리는 메소드
	// decreaseCh
	// if~else if 문 사용
	// 조건문 !power
	// 만약 컴퓨터 전원이 꺼져 있다면 전원을 켜주라는 메시지 출력
	// else 조건문 (파워가 켜져있따면)
	// ch --
	void decreaseCh() 
	{
		if(!power) System.out.println("전원을 켜주세요");
		else 
		{
			if(ch > 0) ch -= 1;
			else if(ch == 0) System.out.println("채녈이 최소치 입니다.");
		}
		System.out.println("형재 채널은 " + ch + "입니다");
	}
	
	
	
	
}
