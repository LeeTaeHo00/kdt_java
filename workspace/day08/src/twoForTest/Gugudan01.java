package twoForTest;

public class Gugudan01 {

	public static void main(String[] args) {
		// 1) 바깥 for문 (초기값 i = 2; 조건식 <= 9; 증감식 ++) 선언
		// 1-1) 출력["%d 단\n", i] printf
		// 1-2) 안쪽 for문 (초기값 j = 1; 조건식 <= 9; 증감식 ++) 선언
		// 1-2-1) 출력[ i + " x " + j + " = " + i * j) println
		// 1-3) 안쪽 for문 종료 후 println으로 줄 넘김
		
		for(int i = 2; i <= 9; i++) 
		{
			System.out.printf("%d 단\n", i);
			for(int j = 1; j <= 9; j++) 
			{
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}

	}

}
