package edu.java.wrapper01;

// Wrapper 클래스: 자바의 기본 데이터 타입을 감싸는 클래스
// 기본 자료형: boolean, byte, short, int, long, char, float, double
// wrapper 클래스:
//   Boolean, Byte, Short, Integer, Long, Character, Float, Double
// wrpper 클래스를 사용하는 이유:
// 1. 클래스의 메소드(기능), 상수(public static final)를 사용하기 위해서
// 2. 매개변수로 Object를 갖는 메소드의 매개변수로 사용하기 위해서
// 3. 컬렉션 프레임워크에서 사용하기 위해서

public class WrapperMain01 {

	public static void main(String[] args) {
		// Wrapper 클래스의 상수
		System.out.println("byte 타입의 최소값: " + Byte.MIN_VALUE);
		System.out.println("byte 타입의 최대값: " + Byte.MAX_VALUE);

	} // end main()

} // end class WrapperMain01

