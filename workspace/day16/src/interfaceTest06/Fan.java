package interfaceTest06;
// 
public interface Fan {
	int MAX_STRENGTH = 3;
	int MIN_STRENGTH = 0;
	
	void on();
	void off();
	void turbo();
	
	// 구현하는 클래스
	// CeilingFan 클래스
	// 3개 메소드 천장선풍기를 켭니다, 천장선풍기를 끕니다, turbo는 비워두기
	// TableFan
	// 탁자 선풍기를 켭니다, 탁자 선풍기를 끕니다, 비워두기
	// TowerFan
	// 타워 선풍기를 켭니다, 타워 선풍기를 끕니다, 타워선풍기를 터보모드로 전환합니다.
}
