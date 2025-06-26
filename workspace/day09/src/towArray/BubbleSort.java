package towArray;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] number = {5,2,9,1,6};
		
		System.out.println("초개 배열 : " + Arrays.toString(number));
		
		for(int i = 0; i <number.length; i++) 
		{
			boolean swap = false;
			for(int  j = 0;  j< number.length - 1 - i; j++) 
			{
				if(number[j] > number[j+1]) 
				{
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
					swap = true;
				}
			}
			if(swap == false)
				break;
			
			System.out.println(Arrays.toString(number));
		}
		
		System.out.println("정렬 완료 : " + Arrays.toString(number));

	}

}
