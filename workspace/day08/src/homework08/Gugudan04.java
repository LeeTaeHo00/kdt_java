package homework08;

public class Gugudan04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int j = 1;
		int k = 1;
		
		while(i <= 9) 
		{
			System.out.printf("%d 단\t\t", i);
			i++;
		}
		System.out.println();
		i = 1;
		
		while(i <= 9) 
		{
			while(j <= 9) 
			{
				System.out.printf("%d x %d = %2d \t", i, j, i * j);
				j++;
			}
			i++;
			j = 1;
			System.out.println();
		}
	}

}
