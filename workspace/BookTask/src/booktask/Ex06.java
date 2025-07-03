package booktask;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 6. 2차원 배열을 활용한 로또만들기 (다른방식)
		
		// 필요한 변수 선언, 
		// 사용자가 입력한 값을 받아줄 정수형 배열
		// 컴퓨터가 로또를 준비해줄 2중 배열
		int[] userChoice = new int[7];
		int[][] lottoResult = new int[3][7];
		
		// 사용자가 수를 선택한다.
		// 자동도 선택할 수 있다.
		
		System.out.print("번호를 자동으로 출력할까요?( 예, 아니오 )");
		String answer = sc.next();
		sc.nextLine();
		
		if(answer.equals("예"))
		{
			lottoMaker(userChoice);
		}
		
		else if(answer.equals("아니오")) 
		{
			for(int i = 0; i < userChoice.length; i++) 
			{
				System.out.println("1 ~ 45중 중복없이 숫자를 입력해주세요");
				System.out.print(i + 1 + " 번째 숫자 : ");
				userChoice[i] = sc.nextInt();
				sc.nextLine();
			}
		}
		
		else 
		{
			System.out.println("잘못입력하여 자동선택합니다");
			lottoMaker(userChoice);
		}
		
		
		// 컴퓨터가 수를 입력해주며 결과를 출력
		for(int i = 0; i < lottoResult.length; i++) 
		{
			lottoMaker(lottoResult[i]);
			System.out.println("컴퓨터 : " + Arrays.toString(lottoResult[i]));
			System.out.println("사용자 : " + Arrays.toString(userChoice));
			System.out.println(printResult(userChoice, lottoResult[i]));
		}
		
		sc.close();
	}
	
	// 로또 숫자 7자리를 만들어주는 메소드
	// 매개변수로 숫자 7개를 담아줄 배열을 받는다.
	// 실행문
	// 처음에 45까지의 숫자를 담아줄 배열을 선언한다.
	// 해당 배열에 1 ~ 45 까지의 수를 반복문을 이용하여 대입한다.
	// 그 후 7자리 숫자를 구하기 위해 7번 반복하는 반복문을 선언한다.
	// 반복문 내에서는 0 ~ 44 까지의 숫자를 램덤으로 받아 
	// 해당 숫자에 대응하는 배열 인덱스 값이 0이 아니라면 매개변수 배열에 추가한 후 해당 값을 0으로 바꿔준다.
	// 0이라면 i--를 해준후 넘어간다.
	static void lottoMaker(int[] lotto) 
	{
		int[] nums = new int[45];
		for(int i = 0; i < nums.length; i++) 
		{
			nums[i] = i + 1;
		}
		
		// 7자리 뽑기
		for(int i = 0; i < lotto.length; i++) 
		{
			int randNum = (int)(Math.random() * 45);
			if(nums[randNum] == 0) 
			{
				i--;
			}
			
			else 
			{
				lotto[i] = nums[randNum];
				nums[randNum] = 0;
			}
		}
	}
	
	// 유저가 선택한 숫자들과 로또 숫자를 비교
	// 1개 틀리면 2등, 0개 틀리면, 1등, 나머지는 꽝
	// 매개변수 배열 2개(플레이어, 컴퓨터)의 로또 배열
	static String printResult(int[] player, int[] computer) 
	{
		int count = 0;
		for(int i = 0; i < player.length; i++) 
		{
			if(player[i] != computer[i]) count++;
		}
		
		switch(count) 
		{
		case 0 :
			return "1등 입니다";
		case 1:
			return "2등 입니다";
		default:
			return "당첨되지 않았습니다";
			
		}
	}
}
