package edu.java.collection03;

import java.util.LinkedList;
import java.util.List;

public class CollectionMain03 {
	// Collection<E>: 자료(데이터) 저장하기 위한 generic
	// |__ List<E>, Set<E>

	// List<E>:
	// 1. 자료들이 저장되는 순서가 중요 -> 인덱스 사용
	// 2. 중복된 값들의 저장을 허용 - 단점
	// 3. 저장된 데이터를 삭제하는 데도 많은 시간이 소요된다. - 단점
	// 4. 데이터를 참조(검색)할 때 매우 빠름 - 장점

	// LinekedList<E>:
	// 1. 내부적으로 Linked List 자료 구조를 사용
	// 2. 저장 용량을 늘리는 과정이 매우 간단 - 장점
	// 3. 저장된 데이터를 삭제하는 과정도 매우 간단 - 장점
	// 4. 데이터를 참조(검색)하는 시간이 매우 느림 - 단점
	
	// ArrayList<E>, LinkedList<E>에서 사용되는 메소드들:
//  add(element), get(index), set(index, element), remove(index)

	public static void main(String[] args) {
		// String 저장할 수 있는 LinkedList 객체 생성
		List<String> list = new LinkedList<>();// 다항성
		//LinkedList<String> list = new LinkedList<>();
		

		// LinkedList에 데이터 추가: add()
		list.add("이헌이");
		list.add("안지영");
		list.add("떡볶이");
		list.add("매운거");
		
		// LinkedList에서 데이터 검색: get()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		// LinkedList에서 데이터 변경: set()
		list.set(2, "짜증남");
		System.out.println("--- 변경 후 ---");
		for (String name : list) {
			System.out.println(name);
		}

		
	}

}
