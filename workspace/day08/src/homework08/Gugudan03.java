package homework08;

public class Gugudan03 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 1; j <= 3; j++) 
			{
				System.out.printf("%d단\t\t", (j + (i * 3)));
			}
			
			System.out.println();
			
			for(int j = 1; j <= 9; j++) 
			{			
				for(int k = 1; k <= 3; k++) 
				{
					System.out.printf("%d x %d = %2d\t", k + (i * 3), j, (k + (i * 3))* j);
				}
				System.out.println();
			}	
			System.out.println();
		}
	}

}
