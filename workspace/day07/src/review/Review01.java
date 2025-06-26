package review;

import java.util.Scanner;

public class Review01 
{
	public static void main(String[] args) 
	{
		// 사용자로부터 입력받은 숫자가 1부터 10까지의 숫자인 경우에만 해당 숫자의 제곱을 출력하고
		// 그 외 숫자를 입력시에는 잘못입력했습니다 출력하기
		
		//로직구성
		//1) 입력 클래스 임포트 및 선언
		//2) 정수형 변수 선언 및 초기화( inputNum = 0)
		//3) 출력["숫자를 입력해주세요"]
		//4) inputNum 에 정수형 입력메서드 사용 sc.nextInt();
		//5) 조건문[inputNum >= 1 && inputNum <= 10]
			//5-1) 조건문이 참인 경우
				//5-1-1) 출력["%d를 제곱한 값은 %d 입니다",inputNum, inputNum * inputNum]
			//5-2) 조건문이 거짓인 경우
				//5-2-1) 출력["잘못입력하셨습니다."]
		//final) 입력 클래스 종료;
		
		Scanner sc = new Scanner(System.in);
		int inputNum = 0;
		System.out.println("숫자를 입력해 주세요(1~10)");
		inputNum = sc.nextInt();
		
		if(inputNum >= 1 && inputNum <= 10) 
		{
			System.out.printf("%d를 제곱한 값은 %d 입니다.\n", inputNum, inputNum * inputNum);
		}
		
		else 
		{
			System.out.println("잘못된 숫자를 입력하셨습니다.\n");
		}
		
		sc.nextLine();
		
		
		// 문자열 끼리의 비교는 관계연사자(==)를 사용하지 않고
		// .equals() 메소드를 사용해서 비교한다 !!!
		System.out.println("문자열 입력 2개");
		// 문자열의 자료형의 비교로는 관계 연산자는 사용할 수 없다.
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		if(s1.equals(s2)) System.out.println("문자열이 같습니다.");
		else System.out.println("다릅니다.");
		
		sc.close();
	}
}
