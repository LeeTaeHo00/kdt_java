package booktask;

public class Ex07 
{
	// 1 ~ 100 까지의 숫자중 10개를 중복없이 선택하여 출력하는 메소드
	
	public static void main(String[] args) {
		
		int []cards = new int[100];
		String numsResult = "";
		
		// 배열에 1~ 100 까지의 수를 넣어줌
		for(int i = 1; i <= 100; i++) 
		{
			cards[i - 1] = i;
		}
		
		// 여기서부터 Random 문을 사용하여 0 ~ 99 사이의 숫자를 뽑아서 해당 배열에 있는
		// 수를 result에 연결해줄거임, 단 해당 수가 0 이라면 다시 돌려야함
		
		for(int i = 0; i < 10; i++) 
		{
			int randNum = (int)(Math.random() * 100);
			if(cards[randNum] == 0) 
			{
				i--;
			}
			
			else 
			{
				numsResult += cards[randNum] + ", ";
				cards[randNum] = 0;
			}
		}
		
		System.out.println(numsResult);
	}
	
}
