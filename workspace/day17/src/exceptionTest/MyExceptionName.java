package exceptionTest;

import java.util.Scanner;

public class MyExceptionName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number= 0;
		System.out.println("냐냐냐냔냐냐야ㅓㅇ랴");
		number = sc.nextInt();
		sc.nextLine();
		
		if(number <= 0) 
		{
//			System.out.println("뇨뇨뇨뇨뇨뇨뇨뇬뇬");
			try {
				throw new MyException();
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("입력한 숫자는 " + number + " 니니니욘용뇽ㄹㄴ요료");
		}
		System.out.println("프로그램 뇨뇨뇬뇨뇨뇨뇨ㅛ");
	}
}
