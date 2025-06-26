package twoForTest;

public class Gugudan02 {

	public static void main(String[] args) {
		// 1) 바깥 for문 (초기값 i = 0; 조건식 <= 9; 증감식 i++) 선언
		// 1-1) 출력["%d 단\n", i] printf
		// 1-2) 안쪽 for문 (초기값 j = 2; 조건식 <= 9; 증감식 j++) 선언
		// 1-2-1) 출력[ i + " x " + j + " = " + i * j) println
		// 1-2-2) 조건문 : 만약 i == 0이라면 단만 출력
		// 1-2-3) else : 만약 i != 0 이라면 
		// 1-3) 안쪽 for문 종료 후 println으로 줄 넘김
		
		for(int j = 2; j <= 9; j++) 
		{
			System.out.printf("%d단\t\t", j);
		}
		System.out.println();
		for(int i = 1; i <= 9; i++) 
		{			
			for(int j = 2; j <= 9; j++) 
			{
				System.out.printf("%d x %d = %2d\t", j , i, i* j);
			}
			System.out.println();
		}

	}

}
