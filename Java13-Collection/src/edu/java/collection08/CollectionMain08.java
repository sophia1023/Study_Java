package edu.java.collection08;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

// Map<K, V>
// |__ HashMap<K, V>, TreeMap<K, V>

public class CollectionMain08 {

	public static void main(String[] args) {
		// TreeMap<String, String> 객체 생성
		TreeMap<String, String> map = new TreeMap<>();
		
		// Map<K, V>에 데이터 저장: put(key, value)
		map.put("root", "root1234");
		map.put("guest", "guest");
		map.put("root2", "root1234");
		System.out.println("size: " + map.size());
		System.out.println(map);
		
		System.out.println();
		// 특정 키의 데이터 검색: get(key)
		System.out.println(map.get("root"));
		
		System.out.println();
		// 특정 키의 데이터 수정: put(key, value)
		map.put("root2", "root!@#$");
		System.out.println(map);
		
		System.out.println();
		// 특정 키의 데이터 삭제: remove(key)
		map.remove("root2");
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 키값들로 이루어진 Set<E> 생성
		Set<String> keys = map.keySet();
//		map.descendingKeySet();
		// TreeMap<K, V>에서
		// keySet(): 오름차순 키들의 집합
		// descendingKeySet(): 내림차순 키들의 집합
		for (String k : keys) {
			System.out.println(k + "=" + map.get(k));
		}
		
		System.out.println();
		// Map의 키들로 이루어진 집합(Set)에서 Iterator 객체 생성
		Iterator<String> itr = keys.iterator();
		while (itr.hasNext()) {
			String key = itr.next();
			System.out.println(key + "=" + map.get(key));
		}

	} // end main()

} // end class CollectionMain08