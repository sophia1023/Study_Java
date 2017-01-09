package edu.java.collection06;

import java.util.*;

//Collection<E>
// └ Set<E>
//		└ HashSet<E>, TreeSet<E>
//
public class CollectionMain06 {

	public static void main(String[] args) {
		//TreeSet<String> 객체 생성
		TreeSet<String> set = new TreeSet<>();
		//Set<String> set = new TreeSet<>(); //다형성
		
		
		//데이터 저장
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");

		// Iterator 객체를 사용한 데이터 출력
		Iterator<String>  itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		System.out.println();
		// 데이터 삭제: remove(element)
		set.remove("One");

		itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

		System.out.println();
		// TreeSet<E>인 경우
		// iterator(): 오름차순 Iterator 객체 생성
		// descendingIterator(): 내림차순 Iterator 객체 생성
		// -> HashSet<E>은 내림차순 Iterator 가 없음!
		Iterator<String> itr2 = set.descendingIterator();
		while(itr2.hasNext()){
			System.out.println(itr2.next());
		}
	}

}
