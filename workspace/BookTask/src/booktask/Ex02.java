package booktask;

public class Ex02 {
	public static void main(String[] args) 
	{
		// 2. 1~100까지의 정수 중에서 짝수만을 더해 출력하는 코드를 for문을 사용해 작성
		int total = 0;
		for (int i = 1; i <= 100; i++) 
		{
			if (i % 2 == 0) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
