package edu.java.collection07;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// List<E>, Set<E>: 한가지 타입의 데이터를 저장할 수 있는 Collection

// Map<K, V>: Key-Value 쌍으로 저장하는 데이터 구조
//  1. Key는 중복되지 않는 값만 저장 가능
//  2. Value는 중복된 값도 저장 가능
//  3. 검색, 수정, 삭제할 때 Key값을 사용해서 함.

// Map<K, V>
// |__ HashMap<K, V>, TreeMap<K, V>
// HashMap<K, V>: 검색을 빠르게 하기 위한 Hash 알고리듬이 적용된 Map
// TreeMap<K, V>: 정렬을 빠르게 하기 위한 Tree 알고리듬이 적용된 Map

public class CollectionMain07 {

	public static void main(String[] args) {
		// HashMap<Integer, String> 객체 생성
		HashMap<Integer, String> map = new HashMap<>();
//		Map<Integer, String> map = new HashMap<>(); // 다형성
		
		// Map<K, V>에 데이터 저장: put(key, value)
		map.put(10, "장용선");
		map.put(11, "김동학");
		map.put(20, "김선기");
		map.put(21, "목진혁");
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>의 데이터 한 개 검색: get(key)
		// 해당 key값의 value를 리턴
		System.out.println(map.get(10));
		System.out.println(map.get(21));
		
		System.out.println();
		// Map<K, V>에서 데이터를 수정: put(key, value)
		map.put(21, "오쌤");
		System.out.println(map.get(21));
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 데이터 삭제: remove(key)
		map.remove(21);
		System.out.println(map);
		
		System.out.println();
		// Map<K, V>에서 Key들로만 이루어진 Set을 생성: keySet()
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for (Integer key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}

	} // end main()

} // end class CollecionMain07
