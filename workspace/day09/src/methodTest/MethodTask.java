package methodTest;

import java.util.Arrays;
import java.util.Scanner;

public class MethodTask {

	public static void main(String[] args) {
		
		MethodTask mt = new MethodTask();
		Scanner sc = new Scanner(System.in);
		
		// 1. ㅇ므수를 양수로, 양수를 음수로 바꿔주는 메소드
		// 메개변수o, 리턴값o
		// 메소드명 : changeSign
		System.out.println("ㅇ므수를 양수로, 양수를 음수로 바꿔주는 메소드");
		System.out.println(mt.changeSign(10));
		System.out.println(mt.changeSign(-10));
		System.out.println();

		// 2. 이름과 정수를 받아와서 정수만큼 이름을 출ㄹ력하는 메소드
		// 매개변수 리턴값 둘다 있음
		// 메소드명 : printName
		System.out.println("이름과 정수를 받아와서 정수만큼 이름을 출력하는 메소드");
		System.out.println(mt.printName(5, "투명드래곤"));
		System.out.println();

		// 3. 10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드
		// 메소드명 changenumber
		
		System.out.println("10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 메소드");
		System.out.println(mt.changeNumber(50));
		System.out.println(mt.changeNumber(9));
		System.out.println();

		// 4. 5개의 정수 중 평균을 반환하는 메소드
		// 매개변수 = 배열, 리턴값
		// 메소듬여 : getAvg
		
		System.out.println("5개의 정수 중 평균을 반환하는 메소드");
		int[] avgNum = {51,202,304,405,209};
		System.out.println(mt.getAvg(avgNum));
		System.out.println();

		// 5. 정수 배열 중 최대값과 최소값을 출력하는 메소드
		// 매개변수(배열) 리턴값
		// 메소드명 printMinMax
		
		
		System.out.println("정수 배열 중 최대값과 최소값을 출력하는 메소드");
		int[] minMaxNum = {90, 58, 2232, 38, 51352};
		System.out.println(mt.printMinMax(minMaxNum));
		System.out.println();

		// 6. 소문자는 대문자로 대문자는 소문자로 바꿔주는 메소드
		// 예시 ) Banana = bANANA
		// 메소드명 : changeCase
		// 매개변수와 반환값은 자유 => 단, 형변환 이용할 것
		System.out.println("소문자는 대문자로 대문자는 소문자로 바꿔주는 메소드");
		System.out.println(mt.changeCase("InvisibleDragon"));
		System.out.println();

		// 7. 아이디와 비밀번호를 입력받아 로글인하기
		// 매개변수 리턴값 = boolean
		// 메소드명 : login
		// main 메소드에서 id가 admin이고 비밀번호가 1234이면 관리자가 환영합니다 출력
		// 아니라면 다시 확인하세요
		
		
		System.out.println("아이디와 비밀번호를 입력받아 로글인하기");
		System.out.println("ID : ");
		String id = sc.next();
		sc.nextLine();
		
		System.out.println("PS : ");
		String ps = sc.nextLine();
		
		if(mt.login(id, ps)) 
		{
			System.out.println("관리자님 환영합니다");
		}
		else 
		{
			System.out.println("다시 확인하세요");
		}
		
		sc.close();
		

	}

	// 로직
	// 1) 수에 -1 을 곱해주는 기능
	// 2) int형 반환 타입
	// 3) 메소드명 : changeSign
	// 4) 매개변수1 (정수형)
	// 5) num * -1 을 ruturn값에 넣어줌
	
	int changeSign(int num) {
		return num * -1;
	}
	
	// 로직
	// 1) 문자열을 일정횟수 이상 반복한 문자열을 반환하는 기능
	// 2) 문자열 반환타입
	// 3) 메소드명 : printName
	// 4) 매개변수2 (정수형1, 물자열형 1)
	// 5) 최종 출력물을 받아줄 문자열 변수 1개 선언
	// 6) 반복문으로 문자열 변수에 name을 이어줌
	// 7) 최종 결과 변수를 반환

	String printName(int count, String name) {
		String totalName = "";
		for (int i = 0; i < count; i++) {
			totalName += name + " ";
		}

		System.out.println(totalName);

		return totalName;
	}
	
	// 로직
	// 10 이하의 숫자는 1로 10을 초과하는 숫자는 100으로 반환하는 기능
	// 1) 정수형 반환타입
	// 2) 메소드명 changeNumber
	// 3) num 이 10 보다 크다면 100을 그보다 작다면 1을 반환하는 값을 삼항연산자를 이용해 반환

	int changeNumber(int num) {
		return num > 10 ? 100 : 1;
	}

	// 로직
	// 1) 5개의 정수 중 평균을 반환하는 기능
	// 2) 실수형 반환타입
	// 3) 메소드명 getAvg
	// 4) 매개변수 정수형 배열
	// 5) 총합을 구해줄 정수형 변수 하나 생성
	// 6) for-each문을 이용하여 정수형 변수에 모든값을 더해줌
	// 7) 반환에 total / 배열의 길이를 double로 형변환 한 것을 반환
	double getAvg(int[] nums) {
		int total = 0;

		for (int curNum : nums) {
			total += curNum;
		}

		return total / (double) nums.length;
	}

	// 로직
	// 1) 정수 배열 중 최대값과 최소값을 출력하는 기능
	// 2) 문자열 반환타입
	// 3) 메소드명 printMinMax
	// 4) 매개변수 정수형 배열1
	// 5) nums 내에 있는 정수들을 Arrays.sort를 이용하여 오름차순으로 정렬
	// 6) 문자열 변수를 선언하여 "최소 " + nums[0] + " 최대 " + nums[nums.length - 1] 를 대입해줌;
	// 7) 문자열 변수를 반환
	String printMinMax(int[] nums) 
	{
		Arrays.sort(nums);
		
		return "최소 " + nums[0] + " 최대 " + nums[nums.length - 1];
	}
	
	// 로직
	// 1) 소문자는 대문자로 대문자는 소문자로 바꿔주는 기능
	// 2) 반환형은 String
	// 3) 메소드명은 changeCase
	// 4) 매개변수는 문자열 변수1
	// 5) 최종결과를 받아줄 문자열 변수 하나 선언
	// 6) for문 문자열의 길이만큼 반복
	// 7) 최종결과 변수에 삼항연산자를 이용하여 .charAt으로 얻은 문자를 'a' 와 비교해서 같거나 
	//	크면 대문자로 작으면 소문자로 대입해줌
	// 8) 최종결과 변수 반환

	String changeCase(String targetCase) 
	{
		String result = "";
		for(int i = 0; i < targetCase.length(); i++) 
		{
			result += (char)(targetCase.charAt(i) >= 'a' ? targetCase.charAt(i) - 32 : targetCase.charAt(i) + 32);
		}
		System.out.println("원본 : \n" + targetCase);
		return result;
	}
	
	//로직
	// 1) id와 ps를 입력받아 검사하는 기능
	// 2) 반환형은 boolean
	// 3) 메소드명은 login
	// 4) 매개변수는 id와 ps 문자열 변수 2개
	// 5) 결과를 위한 boolean 변수 하나 선언
	// 6) id와 ps가 모두 의도한바와 같다면 변수에 true 저장
	// 7) boolean 변수 반환
	
	boolean login(String id, String ps) 
	{
		boolean result = false;
		
		if(id.equals("admin") && ps.equals("1234")) 
		{
			result = true;
		}
		
		return result;
	}

}
