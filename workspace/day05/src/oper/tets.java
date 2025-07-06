package oper;

public class tets {
	public static void main(String[] args) {
		int []monsterName = new int[100];
		int [][]monsterNam2 = new int[10][10];
		
		for(int i = 0; i < monsterNam2.length; i++) 
		{
			for(int j = 0; j < monsterNam2[i].length; j++) 
			{
				monsterNam2[i][j] = i + 1;
				System.out.print(monsterNam2[i][j]);
			}
			System.out.println();
		}
		
		//System.out.println(monsterName);
		for(int i = 0; i< monsterName.length; i++) 
		{
			monsterName[i] = i + 1;
			//System.out.println(monsterName[i]);
		}
	}
}
