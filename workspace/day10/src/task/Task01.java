package task;
// 메소드문제
public class Task01 {
	// 1. 문자열 속의 단어를 공백 기준으로 세기
	// 메소드명 : countWord
	// 매개변수 : String str
	// ex) I love java => 3개
	// ex) 안녕하세요 저는 김영선입니다 java 공부 중입니다. => 6개
	
	// 2. 주민등록번호로 성별 판단하기
	// 메소드명 : getGender
	// 1, 3 => 남자
	// 2, 4 => 여자
	
	// 3. 학생 3명의 (수학, 국어, 영어)0점수를 받아 각 학생별 학점 구하기(정수로만)
	// 메소드명 : getGrade
	// 95 >= A+
	// 90 >= A
	// 85 >= B+
	// 80 >= B
	// 75 >= C+
	// 70 >= C
	// 69 < F else
	
	public static void main(String[] args) {
		Task01 t = new Task01();
		System.out.println("단어 개수 : " + t.countWord("안녕하세요 반가웓 실엄ㄴ래 dfdffd") + "개");
		
		System.out.println("성별은  : " + t.getGender("9909174"));
		
		t.getGrade(new int[][] {{10,30,40},{80,90,100},{100,100,100}});
	}
	
	// 문자열 속의 단어를 공백 기준으로 세는 기능
	int countWord(String targetStr) 
	{
		if(targetStr == null) return 0;
		
		int count = 0;
		for(int i = 0; i < targetStr.length(); i++) 
		{
			if(targetStr.charAt(i) == ' ')
				count++;
			if(i == targetStr.length() - 1)
				count++;
		}
		
		return count;
	}
	
	// 주민등록번호로 성별 판단하기 기능
	String getGender(String number) 
	{
		if(number == null) 
		{
			return "값을 입력해주세요";
		}
		
		char target = ' ';
		String result = "";
		
		for(int i = 0; i < number.length(); i++) 
		{
			if(number.charAt(i) == '-' && number.length() >= 7) 
			{
				target = number.charAt(i + 1);
				break;
			}
			
			else if(i == 6) 
			{
				target = number.charAt(i);
				break;
			}
		}
		
		
		if(target == '1' || target == '3') 
		{
			result = "남자 입니다.";
		}
		
		else if (target == '2' || target == '4') 
		{
			result = "여자 입니다.";
		}
		else 
		{
			result = "값이 잘못되었습니다.";
		}
		
		return result;
	}
	
	//학생 3명의 (수학, 국어, 영어)0점수를 받아 각 학생별 학점 구하기(정수로만)	
	void getGrade(int[][] scores) 
	{
		String[] grade = new String[3];
		int[] total = new int[3];
		int[] avg = new int[3];
		
		for(int i = 0; i < scores.length; i++)
		{
			for(int j = 0; j < scores[i].length; j++) 
			{
				total[i] += scores[i][j];
			}
		}
		
		for(int i = 0; i < total.length; i++) 
		{
			avg[i] = total[i] / scores[0].length;
		}
		
		for(int i = 0; i < avg.length; i++) 
		{
			if(avg[i] >= 95) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 A+ 입니다");
			}
			
			else if(avg[i] >= 90) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 A 입니다");
			}
			
			else if(avg[i] >= 85) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 B+ 입니다");
			}
			
			else if(avg[i] >= 80) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 B 입니다");
			}
			
			else if(avg[i] >= 75) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 C+ 입니다");
			}
			
			else if(avg[i] >= 70) 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 C 입니다");
			}
			
			else 
			{
				System.out.println("학생 " + (i + 1) + "의 학점은 F 입니다");
			}
		}
	}
	
	
}
