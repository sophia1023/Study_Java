package edu.java.inner05;

public class OuterClass {

	private int value;

	public OuterClass(int value) {
		this.value = value;
	}

	public void test() {
		int x = 123;

		class LocalClass {

			private int value2;// 지역 클래스의 멤버 변수

			// 지역 변수를 선언하는 위치에서 정의하는 클래스
			// -> 지역 클래스(local inner class)

			// 지역 클래스 생성자
			public LocalClass(int value2) {
				this.value2 = value2;
			}

			// 지역 클래스 메소드
			public void display() {
				// 외부 클래스의 멤버 변수를 참조 가능
				System.out.println("value = " + value);

				// 메소드의 지역 변수 사용 가능
				System.out.println("x = " + x);

				// 지역 클래스의 멤버 변수를 참조 가능
				System.out.println("value2 = " + value2);
			} // end display()

		}
	}

}
