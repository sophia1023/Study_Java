package edu.java.collection05;

import java.util.HashSet;
import java.util.Set;

public class CollectionMain05 {

	public static void main(String[] args) {
		//Collection<E>
		//└ set<E>
		//		└ HashSet<E>, TreeSet<E>
		
		//	Set<E>
		// 1. 데이터의 저장 순서가 중요하지 않음 -> 인덱스가 없음.
		// 2. 중복된 데이터의 저장을 허용하지 않음.
		// 예) {1,2,3} = {3,2,1}
		// 예) {1,1,1,2,2,2,3,3,3} = {1,2,3}
		

		// HashSet<E>: 검색을 빠르게 하기 위한 Hash 알고리듬이 적용된 Set
		// TreeSet<E>: 정렬을 빠르게 하기 위한 Tree 알고리듬이 적용된 Set

		//HashSet<Integer> 객체 생성
		//HashSet<Integer> set = new HashSet<>();
		Set<Integer> set = new HashSet<>();
		
		//set에 데이터 저장 : add(element)
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);

	}

}
