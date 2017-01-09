package edu.java.collection02;

import java.util.ArrayList;
//
class Student {
	private int stuNo;
	private String name;
	
	public Student(int stuNo, String name) {
		this.stuNo = stuNo;
		this.name = name;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		String str = "번호: " + stuNo + "\n"
				+ "이름: " + name + "\n";
		return str;
	}
	
} // end Student

public class ListMain02 {

	public static void main(String[] args) {
		// Student 타입을 저장할 수 있는 ArrayList 인스턴스 생성
		ArrayList<Student> list = new ArrayList<>();
		
		// 원소 추가: add()
		Student stu1 = new Student(1, "오쌤");
		list.add(stu1);
		list.add(new Student(2, "길동이"));
		
		// 원소 참조(읽기): get()
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------------------");
		for (Student s : list) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		// 원소 변경: set()
		Student stu2 = new Student(1, "둘리");
		list.set(0, stu2);
		for(Student s : list){
			System.out.println(s);
		}
		
		System.out.println("----------------------------------");
		//원소 삭제 : remove()
		list.remove(1);
		for(Student s : list){
			System.out.println(s);
		}
	} // end main()

} // end class ListMain02
