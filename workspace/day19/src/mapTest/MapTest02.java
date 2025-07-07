package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest02 {
	public static void main(String[] args) {
		HashMap<String, Integer> coffee = new HashMap<String, Integer>();
		
		// 추가 put
		coffee.put("아메리카노", 300);
		coffee.put("카페라테", 2300);
		coffee.put("카푸치노", 2400);
		coffee.put("파르페", 5400);
		
		System.out.println(coffee);
		
		// 조회
		System.out.println(coffee.get("아메리카노"));
		
		// 삭제
		System.out.println(coffee.remove("파르페")); // 해당 value값 반환되고 삭제
		System.out.println(coffee);
		
		// containsKey : 값 포함 여부 확인
		System.out.println(coffee.containsKey("새우깡"));
		System.out.println(coffee.containsValue(300));
		
		// Iterator
		// keySet -> key만 가져오기
		System.out.println(coffee.keySet());
		Iterator<String> iter = coffee.keySet().iterator();
		System.out.println(iter);
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		while(iter.hasNext()) 
		{
			System.out.println(iter.next());
		}
		
		System.out.println(coffee.values());
		Iterator<Integer> iter2 = coffee.values().iterator();
		while(iter2.hasNext()) 
		{
			System.out.println(iter2.next());
		}
		
		// Entry key, value 한쌍씩 가져오기
		System.out.println(coffee.entrySet());
		
		Set<Entry<String,Integer>> items = coffee.entrySet();
		System.out.println(items);
		
		for(Entry<String,Integer> entry : items) 
		{
			System.out.println(entry);
		}
		
		
		
	}
}
