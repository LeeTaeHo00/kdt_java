package staticTest;
// 5번 : 가변길이 매개변수
public class VariableTest02 {
	public static void main(String[] args) {
		VariableTest02 vt = new VariableTest02();
		vt.printNumbers("가변길이매개변수", 1, 2);
	}
	
	void printNumbers(String name, int ...numbers) // 가변길이 매개변수
	{
		System.out.println(numbers);
		int total = 0;
		for(int num : numbers) 
		{
			System.out.println(num);
			total  += num;
		}
		
		for(int i = 0; i < numbers.length; i++) 
		{
			total += numbers[i];
		}
		
		System.out.println(total);
	}
}
