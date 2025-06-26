package methodTest;

import java.util.Scanner;

public class MethodTask02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodTask02 mt = new MethodTask02();
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		// 1. 정수1개를 받아서 짝수입니다, 홀수입니다. 반환하는 메소드
		// 메소드명 : checkNum
		System.out.println(mt.checkNum(5));
		System.out.println(mt.checkNum(10));
		System.out.println();
		
		
		// 2. 10칸짜리 정수배열을 받아 총합을 계산하여 반환하는 메소드
		// 메소드명 : getSum
		System.out.println(mt.getSum(nums));
		System.out.println();
		
		// 3. 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 메소드
		// 메소드명 : reverseStr
		System.out.println(mt.reverseStr("블록드래곤"));
		System.out.println(mt.reversStr2("블록드래곤"));
		System.out.println(mt.reversStr3("블록드래곤"));
		System.out.println(mt.reversStr4("블록드래곤"));
		System.out.println();
		
		// 4. 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 메소드
		// 메소드명 : contains
		// 배열 요소 중에 10이라는 값을 반드시 넣고 10을 배개변수로 전달
		// 메소드명 (배열명, 10) => true
		System.out.println(mt.contains(nums, 10));
		System.out.println();
		
		// 5. 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력
		// 3 x 19 = ....
		// 메소드명 : printGugudan;
		mt.printGugudan(3);
		System.out.println();
		
		// 6. 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름이라고 반환하는 메소드
		// 메소드명 : compareLength;
		System.out.println(mt.compareLength("냐옹","멍"));
		System.out.println();
		
		// 7. 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금
		// 메소드명 : loginTry;
		//mt.loginTry("admin", "1234", sc);
//		System.out.println(mt.loginTry("admin", "1234"));
//		System.out.println(mt.loginTry("admin", "1235"));
//		System.out.println(mt.loginTry("admin", "1236"));
//		System.out.println(mt.loginTry("admin", "1237"));
		
		int tryCount = 0;
		String id, passwd, result;
		
		while(true) 
		{
			
			System.out.println("ID 입력 : ");
			id = sc.nextLine();
			System.out.println("ID 입력 : ");
			passwd = sc.nextLine();
			
			result = mt.loginTry(id, passwd);
			
			if(result.equals("성공"))
			{
				System.out.println("로그인 성공");
				break;
			}
			
			else 
			{
				tryCount = 0;
				if(tryCount >= 3) 
				{
					System.out.println("3회 이상 실패로 계정 잠금");
					break;
				}
				
				System.out.println("로그인 실패");
			}
		}
		
		
		sc.close();
		
	}
	
	// 정수1개를 받아서 짝수입니다, 홀수입니다. 반환하는 기능
	// 1) 반환 타입은 String
	// 2) 메소드명은 checkNum
	// 3) 매개변수는 정수형 변수 1개
	// 4) 삼항연산자를 사용하여 값을 바로 리턴
	
	String checkNum(int num) 
	{
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	// 10칸짜리 정수배열을 받아 총합을 계산하여 반환하는 기능
	// 1) 반환 타입은 Int
	// 2) 메소드명은 getSum
	// 3) 매개변수는 정수형 배열 1개
	// 4) 총합을 구해줄 변수 한개 선언
	// 5) for-each를사용하여 값을 모두 더해줌
	// 6) 총합변수 리턴
	
	int getSum(int[] nums) 
	{
		int total = 0;
		for(int num : nums) 
		{
			total += num;
		}
		return total;
	}
	
	// 문자열을 매개변수로 받아 거꾸로 뒤집어 반환하는 기능
	// 1) 반환 타입은 String
	// 2) 메소드명은 reverseStr
	// 3) 매개변수는 문자열 변수 1개
	// 4) 문자열 변수 1개 선언
	// 5) for문을 사용하여 문자열 변수에 거꾸로 값 대입
	// 6) 문자열 변수 리턴
	
	String reverseStr(String str) 
	{
		if(str == null) return null;
		
		String reverse = "";
		for(int i = str.length() - 1; i >= 0; i--) 
		{
			reverse += str.charAt(i);
		}
		return reverse;
	}
	
	// char[] 이용
	// 문자형 배열은 null을 반환하지 못한다.
	char[] reversStr2(String str) 
	{

		if(str == null) 
		{
			return null; // 이부분이 에러 남
		}
		
		int length = str.length();
		char[] reverse = new char[length];
		for(int i = 0; i < length; i++) 
		{
			reverse[i] = str.charAt(length - 1 - i);
		}
		
		return reverse;	
	}
	
	// char[] 이용 새로 만들어서 앞뒤 바꿔서 복사하는 방식
	String reversStr3(String str) 
	{
		if(str == null) return null;
		
		int length = str.length();
		char[] reverse = new char[length];
		String result = "";
		for(int i = 0; i < length; i++) 
		{
			reverse[i] = str.charAt(length - 1 - i);
		}
		
		for(char letter : reverse) 
		{
			result += letter;
		}
		return result;
	}
	
	// 메소드 이용
	// char[] 이용
	String reversStr4(String str) 
	{
		return new StringBuilder(str).reverse().toString();
	}
	
	// 정수형 배열과 찾을 값을 매개변수로 받아서 배열에 존재하면 true 반환하는 기능
	// 1) 반환 타입은 boolean
	// 2) 메소드명은 contains
	// 3) 매개변수는 정수형 배열1개, 정수형 변수 1개, 메소드 안에는 boolean 변수 하나 선언 false
	// 4) for문을 사용 정수형 배열수만큼 반복
	// 5) 만약 정수형배열[인덱스] 가 정수형 변수와 같다면 break를 한후 boolean 변수true로 변경
	// 6) boolean 변수 반환
	
	boolean contains(int[] nums, int targetNum) 
	{
		if(nums == null) return false;
		
		for(int curNum : nums) 
		{
			if(curNum == targetNum) 
			{
				return true;
			}
		}
		
		return false;
	}
	
	// 단수를 매개변수로 받아 해당 단의 구구단을(1 ~ 19)을 출력하는 기능
	// 1) 반환 타입은 void
	// 2) 메소드명은 printGugudan
	// 3) 매개변수는 단수를 받을 정수형 변수 1개
	// 4) 정수형 변수 + "단" 출력
	// 5) for문을 사용하여 1부터 시작하여 19보다 작거나 같을때까지 반복
	// 6) for문 내에서 println을 사용하여 정수형 변수 * i 값을 출력
	
	void printGugudan(int dan) 
	{
		System.out.println(dan + "단");
		for(int i = 1; i <= 19; i++) 
		{
			System.out.println(dan + " X " + i +  " = " + (i * dan));
		}
	}
	
	// 두개의 문자열을 입력받아서 두 문자열의 길이가 같으면 같음, 다르면 다름이라고 반환하는 메소드
	// 1) 반환 타입은 String
	// 2) 메소드명은 compareLength
	// 3) 매개변수는 문자열 변수2개
	// 4) 반환값을 삼항연산자를 사용하여 출력 문자열변수1.equals(문자열변수2) ? "같음" : "다름"
	
	String compareLength(String str1, String str2) 
	{
		return str1.length() == str2.length() ? "같음" : "다름";
	}
	
	// 아이디와 비밀번호를 매개변수로 받아 검증, 시도횟수 3회 넘기면 잠금하는 기능
	// 1) 반환타입은 boolean
	// 2) 메소드명은 loginTry
	// 3) 매개변수는 아이디와 비밀번호 2개 문자열
	// 4) 만약 아이디와 비밀번호 모두 같다면 true를 반환
	
	void loginTry(String id, String ps, Scanner sc) 
	{
		String id_here = "";
		String ps_here = "";
		int count = 0;
		
		while(true) 
		{
			if(count >= 3) 
			{
				System.out.println("잠금");
				break;
			}
			
			System.out.println("id : ");
			id_here = sc.nextLine();
			
			System.out.println("ps : ");
			ps_here = sc.nextLine();
			
			if(id_here.equals(id) && ps_here.equals(ps))
			{
				System.out.println("로그인 성공");
				break;
			}
			
			count ++;
		}
	}
	
	// 메소드 밖에서 클래스안에 변수 선언
	int tryCount = 0;
	
	String loginTry(String inputID, String inputPS) 
	{
		final String ID = "admin";
		final String PW = "1234";
		
		if(tryCount >= 3) return "잠금";
		
		if(ID.equals(inputID) && PW.equals(inputPS)) 
		{
			tryCount = 0;
			return "로그인 성공";
		}
		
		else 
		{
			tryCount++;
			if(tryCount >= 3) return "잠금";
			return "로그인 실패";
		}
	}
	
	String loginTry1(String inputId, String inputPw) 
	{
		final String ID = "admin";
		final String PW = "1234";
		
		if(inputId.equals(ID) && inputPw.equals(PW)) 
		{
			return "성공";
		}
		
		return "실패";
	}
}
