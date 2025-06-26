package Homework;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		Task01 t = new Task01();
		
		System.out.println("----------1번-------------");
		System.out.println("단어 개수 : " + t.countWord("안녕하세요 반가웓 실엄ㄴ래 dfdffd      ㄹㅇㅎㅇㅎㅁ") + "개");
		
		System.out.println("----------2번-------------");
		System.out.println("성별은  : " + t.getGender("9909171"));
		
		System.out.println("----------3번-------------");
		
		int studentCount = 3;
		int subjectCount = 3;
		
		int[][] scores = t.inputScores(studentCount,subjectCount,sc); // 3학생의 국어 영어 수학 점수를 각각 저장
		int[] avgAll = new int[subjectCount]; // 3학생의 평균값을 저장
		
		// 학생들 점수를 각각 입력
		
		// 해당 포문에서는 학생수(3명) 만큼 배열에 성적을 입력해주는 부분이다.
		// 만약 범위를 벗어난 값을 입력하면 i--를 해주고 continue를 해줘 다음 반복문으로 넘어가 다시 하게 해준다.
		for(int i = 0; i < scores.length; i++) 
		{
			// 한 점수가 모두 입력되었다면 해당 값을 평균값들을 저장하는 배열에 평균을 구해주는 메소드를 이용하여 넣어준다.
			avgAll[i] = t.getAvg(scores[i]);
		}
		
		// 마지막으로 모든 평균들을 검사하여 순서대로 결과를 출력한다.
		t.getGrade(avgAll);
		
		sc.close();
	}
	
	// 문자열 속의 단어를 공백 기준으로 세는 기능
	// 1) 반환타입 정수형
	// 2) 메소드명 countWord
	// 3) 매개변수 문자열 변수 1개(targetStr)
	// 4) 구현부
	//
	// 1)만약 문자열변수에 아무것도 없다면 0을 반환(아무 단어없음)
	// 2)몇개의 단어를 가지고 있는지 저장할 정수형 변수 count 선언,
	// 3)공백을 만나기 이전 문자열이 단어를 가지고 있는지 확인할 boolean 변수 checker 선언
	// 4)반복문(i = 0; i < targetStr의 길이; i++) 인덱스 번호를 사용하기 위해 foreach문이 아닌 for문 사용
	// 4-1)	반복문 안 실행문
	// 4-2)	조건문(checker 가 true(단어가 하나이상 있었음)이며 현재 위치의 문자가 공백이라면)
	// 4-3)		count ++을 해주고 checker는 다시 false로;
	// 4-4) 조건문이 거짓이라면
	// 4-5) 	checker가 false라면 checker를  true로 만들어준다.
	// 4-6) 만약 지금이 끝이라면 checker가 true일때만 count를 욜려준다.
	// 마지막으로 최종 count값을 반환
	//			
	int countWord(String targetStr) 
	{
		if(targetStr == null) return 0;
		
		int count = 0;
		boolean checker = false;
		for(int i = 0; i < targetStr.length(); i++) 
		{
			char c = targetStr.charAt(i);
			if(c != ' ' && checker == false)
			{
				count++;
				checker = true;
			}
			else if(c == ' ')
			{
				checker = false;
			}
		}
		
		return count;
	}
	
	// 주민등록번호로 성별 판단하기 기능
	// 1) 일단 사용자는 - 를포함한 글자나 숫자 7자리를 받아 준다.
	// 2) 만약 문자열이 비어있따면 오류메시지를 반환"
	// 3) 문자열이 있다면 for문을 이용하여 한글자씩 검사
	// 4) 만약 - 를 찾았고 길이가 7 이상이라면 다음 문자를 검사할 값에 담아줍니다.
	// 5) 만약 인덱스가 6이며 길이가 7이상이 아니라면 현재 문자를 검사할 겂에 담아줍니다.
	// 6) 검사할 값을 비교하여 남자인지 여자인지 잘못된 입력인지를 검사해 줍니다.
	// 7) 결과를 문자열로 반환해줍니다.
	
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
			if(number.charAt(i) == '-' && number.length() > 7) 
			{
				target = number.charAt(i + 1);
				break;
			}
			
			if(i == 6 && number.length() == 7) 
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
			result = "값이 잘못되었습니다. 값이 " + target + "입니다.";
		}
		
		return result;
	}
	
	// 점수들을 받아서 하나의 평균으로 반환해주는 기능
	// int(정수)형 반환타입
	// 메소드 이름 getAvg()
	// 매개변수 정수형 배열(for each로 결과값들을 가져와줄거임)
	// 실행문
	// 만약 scores에 배열이 없다면 0을 반환(아무점수없음)
	// 총합을 저장해줄 정수형 변수 result를 선언
	// for each문을 사용하여 result 에 매개변수로 받은 정수형 배열의 모든값을 더해준다.
	// 평균을 구해주기 위해 result와 정수형 배열의 길이를 나눠준다.
	
	int getAvg(int[] scores) 
	{
		if(scores == null) return 0;
		
		int result = 0;
		for(int score : scores)
		{
			result += score;
		}
		return result / scores.length;
	}
	
	//평균 점수별 학점 구하기
	// for문을 통해 avg의 길이만큼 반복한다.
	// 포문 안에서 avg[인덱스]내에 있는 값을 비교하여 결과를 출력한다.
	void getGrade(int[] avgs) 
	{
		for(int i = 0; i < avgs.length; i++) 
		{
			if(avgs[i] >= 95) System.out.println("학생 " + (i + 1) + "의 학점은 A+ 입니다");
			
			else if(avgs[i] >= 90) System.out.println("학생 " + (i + 1) + "의 학점은 A 입니다");
			
			else if(avgs[i] >= 85) System.out.println("학생 " + (i + 1) + "의 학점은 B+ 입니다");
			
			else if(avgs[i] >= 80) System.out.println("학생 " + (i + 1) + "의 학점은 B 입니다");
			
			else if(avgs[i] >= 75) System.out.println("학생 " + (i + 1) + "의 학점은 C+ 입니다");
			
			else if(avgs[i] >= 70) System.out.println("학생 " + (i + 1) + "의 학점은 C 입니다");
			
			else System.out.println("학생 " + (i + 1) + "의 학점은 F 입니다");
		}
	}
	
	// 점수 입력 받는 메소드
	// 리턴 타입 => void => 배열[][]
	// 메소드 명 => inputScore
	// 매개 변수 => 정수형 학생수, 정수형 과목수, 입력 클래스
	// 정수형 2차원 배열 배열명 = new int[학생수][과목수];
	// for(int i = 0; i < 배열.length; i++)
	// 		sysout("i 번째 학생의 점수를 입력하세요)
	//		안쪽 for(j = 0; j < 과목수.length; J++)
	//			if(j == 0) subject = "수학"
	//			else if(j == 1) subject = "영어"
	//			else if(j == 2) subject = "국어"
	//			출력메시지 subject + "점수 입력 : "
	//			배열[i][j] = sc.nextInt();
	// return 배열명
	
	int[][] inputScores(int studentCnt, int subjectCnt, Scanner sc)
	{
		int[][] scores = new int[studentCnt][subjectCnt];
		
		for(int i = 0; i < studentCnt; i++) 
		{
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요");
			String subject = "";
			for(int j = 0; j < subjectCnt; j++) 
			{
				if(j == 0) subject = "국어";
				else if(j == 1) subject = "영어";
				else if(j == 2) subject = "수학";
				
				System.out.println(subject + " 점수 입력 : ");
				scores[i][j] = sc.nextInt();
				
				if(scores[i][j] < 0 || scores[i][j] > 100) 
				{
					System.out.println("잘못된 값입니다");
					j--;
				}
			}
		}
		
		return scores;
	}	
}
