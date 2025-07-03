package booktask;

public class Ex03 {
	public static void main(String[] args) 
	{
		// 3. 두 개의 주사위가 같은 값이 나올 떄까지 while문을 사용해 반복하고, 반복 횟수와 주사위 눈의 번호를 출력하기

		int count = 1;
		int dice1 = 0;
		int dice2 = 0;
		while (true) 
		{
			dice1 = (int) ((Math.random() * 6) + 1);
			dice2 = (int) ((Math.random() * 6) + 1);
			
			if (dice1 == dice2) break;
			else count++;
		}
		
		System.out.printf("반복 횟수 : %d\n", count);
		System.out.printf("주사위 [%d] [%d]", dice1, dice2);
	}
}
