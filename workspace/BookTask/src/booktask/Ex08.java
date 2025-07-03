package booktask;

public class Ex08 {
	public static void main(String[] args) 
	{
		int[][] mabajine = new int[5][5];
		
		// 배열의 행과 열
		int i = 0;
		int j = 2;
		
		int count = 0; // 25번 수를 넣으면 while문을 멈춰주고자함
		
		while(true) 
		{
			// 만약 현재 배열에 값이 없다면 값을 대입
			// 그후 i 와 j의 값 변경
			if(mabajine[i][j] == 0)
			{
				// 
				mabajine[i][j] = ++count;
				
				i = (i - 1 < 0) ? mabajine.length - 1 : i - 1;
				j = (j + 1 > mabajine[0].length - 1) ? 0 : j + 1;
			}
			
			// 이미 값이 있을 경우
			else 
			{
				// 전 구간으로 돌림
				i = (i + 1 > mabajine.length - 1) ? 0 : i + 1;
				j = (j - 1 < 0) ? mabajine[0].length - 1 : j - 1;
				
				// 거기서 1행 밑으로 내려줌
				i = (i + 1 > mabajine.length - 1) ? 0 : i + 1;
				//System.out.print(i + " " + j + " = " + mabajine[i][j] + " -> ");
				//System.out.println(i + " " + j + " = " + mabajine[i][j] );
			}
			if(count == 25) break;
		}
		
		// 그 후 결과를 출력
		for(int test = 0; test < 5; test++) 
		{
			for(int test2 = 0; test2 < 5; test2++) 
			{
				System.out.print("["+ mabajine[test][test2] + "] ");
			}
			System.out.println();
		}
	}
}
