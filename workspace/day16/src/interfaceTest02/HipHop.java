package interfaceTest02;

public class HipHop implements Music{
	@Override
	public void mode() {
		System.out.println("힙합 모드");	
	}
	
	void onlyHipHop() 
	{
		System.out.println("오직 힙합만 실행");
	}
}
