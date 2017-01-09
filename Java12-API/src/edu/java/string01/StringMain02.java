package edu.java.string01;

public class StringMain02 {

	public static void main(String[] args) {
		//String literal 과 생성자 호출의 차이
		//생성자는 호출 할 때마다 새로운 인스턴스가 생성됨.
		// 참조변수 (str1, str2)은 다른 주소값이 저장		
		String str1 = new String("abc");
		String str2 = new String("abc");
		if (str1 == str2) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
		
		System.out.println("----------------------------");
		//문자열 리터럴을 사용해서 초기화 하는 경우
		//이미 리터럴이 만들어져 있는 경우는
		//인스턴스를 새로 생성하지 않고, 기존의 인스턴스를 재활용
		// 참조변수 (str3, str4)은 같은 주소값이 저장
		String str3 = "abc";
		String str4 = "abc";
		if (str3 == str4) {
			System.out.println("같은 참조");
		} else {
			System.out.println("다른 참조");
		}
	}

}
