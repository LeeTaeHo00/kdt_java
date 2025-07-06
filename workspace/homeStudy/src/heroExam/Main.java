package heroExam;

public class Main {	
	public static void main(String[] args) {
		Hero[] heroes = new Hero[5];
		
		for(int i = 0; i < heroes.length; i++) 
		{
			if(i % 2 == 0) 
			{
				heroes[i] = new IronMan("토니");
			}
			
			else 
			{
				heroes[i] = new Hulk("배너");
			}
		}
	}
}
