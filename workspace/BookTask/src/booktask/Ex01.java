package booktask;

public class Ex01 {
	public static void main(String[] args) {
		// 1. 반복문을 사용해 *를 출력하는 코드 작성(역삼각형)
		for (int i = 7; i >= 0; i--) 
		{
			for (int j = 0; j < 7 - i; j++) 
			{
				System.out.print(" ");
			}

			for (int j = 0; j < (2 * i); j++) 
			{
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
