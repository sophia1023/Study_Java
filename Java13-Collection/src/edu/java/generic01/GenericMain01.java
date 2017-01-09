package edu.java.generic01;

public class GenericMain01 {

	public static void main(String[] args) {
		Apple apple = new Apple("아오리");
		apple.displayAppleType();
		
		AppleBox aBox = new AppleBox(apple);
		aBox.pullOut().displayAppleType();
		
		System.out.println();
		
		Orange orange = new Orange(12);
		orange.displayOrangeSugar();
		
		OrangeBox oBox = new OrangeBox(orange);
		oBox.pullOut().displayOrangeSugar();
		
		System.out.println("-----------------------------");
		//generic 클래스 BOX의 인스턴스를 생성
		Box<Apple> box1 = new Box<Apple>(apple);
		box1.pullOut().displayAppleType();
		
		Box<Orange> box2 = new Box<Orange>(orange);
		box2.pullOut().displayOrangeSugar();
		
		Box<Integer> box3 = new Box<Integer>(123);
		box3.pullOut().intValue();
		//java 7버전부터 생성자 호출 시 타입 생략하고 <>만 써도 가능

	} // end main()

} // end class GenericMain01





