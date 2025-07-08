package mapTest;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest01 {
		public static void main(String[] args) {
			ArrayList<Integer> al = new ArrayList<>();
			al.add(1);
			al.add(2);
			al.add(3);
			System.out.println(al.get(al.indexOf(2)));
			
//			HashMap map = new HashMap();
//			System.out.println(map);
//			map.put(map, map);
//			System.out.println(map);
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			System.out.println(map.toString());
			map.put("a", 1);
			map.put("b", 2);
			map.put("c", 3);
			System.out.println(map);
			System.out.println(map.get("b")); // 인덱스를 몰라도 key값으로 해당 value를 추력할 수 있다.
			map.put("a", 10);
			System.out.println(map);
			map.put("d", 4);
			System.out.println(map);
			
			// push(key, value) 추가
			// get(key) 해당 key value 반환
			// size() map 길이
			// keySet()
			// values()
			
			System.out.println(map.keySet()); // 반환타입 Set 인터페이스
			System.out.println(map.values()); // 반환타입 Collection 인터페이스
		}

}
