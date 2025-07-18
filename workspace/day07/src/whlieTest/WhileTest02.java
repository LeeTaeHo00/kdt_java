package whlieTest;
// 9번 : while문으로 합계구하기
public class WhileTest02 { // 클래스 시작

	public static void main(String[] args) { // 메인 메소드 시작
		// 1부터 100까지의 합 구하기(for)
		// 1. 총합 구할 변수 선언
		// 2. for	초기식 int i = 1
		//			조건식 i <= 100
		//			증감식 i++
		// 3. 	중괄호 영역
		//			총합구할변수 += i;
		// 4. 	줄괄호 영역 밖에서 출력
		
		int result1 = 0;
		for(int i = 0; i < 100; i++)  // 0부터 시작하여 100이 되기전까지 1씩 증가하며 반복
		{ // 반복문 시작
			result1 += i + 1; // 최종 결과 현재 i값을 더해주기
		} // 반복문 끝
		
		System.out.println(result1); // 최종결과 출력
		
		// 1부터 100까지의 합을 구하기(while)
		// 1. 변수 선언(비교 대상 변수, 총합 구할 변수)
		// 2. while(조건식) 비교대상변수 <= 100
		// 3. 중괄호영역 : 총합구할변수 += 비교대상변수
		// 				비교대상 변수 1증가
		// 4. 출력
		
		int result2 = 0, cnt = 0;
		while(cnt < 100) 
		{
			result2 += cnt + 1;
			
			cnt++;
		}
		System.out.println(result2); // 최종결과 출력
		
		// 짝수의 합, 홀수의 합 (while 사용)
		// 1. 변수 선언(짝수합, 홀수합, 비교 값)
		// 2. while(조건식) 비겨대상변수 <= 100
		// 3. 중괄호 영역
		// 			조건식(비교대상변수 % 2 ==0) (if~else)
		//			참이라면 짝수합에 현재 비교대상변수값을 더한다.
		//			거짓이라면 홀수합에 현재 비교대상 변수값을 더한다.
		//			조건식에서 벗어난 후 비교대상 변수++
		// 4. 최종 출력
		
		int num1 = 0, num2 = 0, cnt2 = 0; // 사용할 변수 3개 선언( 짝수합, 홀수합, 비교값)
		while(cnt2 <= 100) // 비교값이 100 이하일 경우 반복
		{
			if(cnt2 % 2 == 0) // cnt 값이 짝수인지 확인하는 조건식
			{
				num1 += cnt2; // 짝수들을 더해줌
			}
			else  // 조건식이 거짓일 경우 실행
			{
				num2 += cnt2; // 홀수들을 더해줌
			}
			
			cnt2++; // 증감식
		}
		
		System.out.println("짝수합 : " + num1 + "\t홉수합 : " + num2); // 최종출력
		
	} // 메인메소드 끝

} // 클래스 끝
