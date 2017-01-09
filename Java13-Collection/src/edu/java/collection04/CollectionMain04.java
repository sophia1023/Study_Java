package edu.java.collection04;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionMain04 {
	
	static Scanner sc = new Scanner(System.in);
	static LinkedList<Student> stuList = new LinkedList<>();
	
	public static void main(String[] args) {
	
		for(int i = 0; i <3; i++){
		
			System.out.print("학생 이름 > ");
			String name = sc.nextLine();
			System.out.print(name + "의 국어 점수 > ");
			int kor = sc.nextInt();
			System.out.print(name + "의 영어 점수 > ");
			int eng= sc.nextInt();
			sc.nextLine();
		
			Score score = new Score(kor, eng);
			Student stu = new Student(name, score);
			stuList.add(stu);
			System.out.println("\n");
		}
		
		System.out.println("--------------------------------------");
		for(int i = 0 ; i <stuList.size(); i++){
			System.out.println("학생 NO." + (i+1));
			System.out.println(stuList.get(i));
			System.out.println("\n");
		}
		
		System.out.println("--------------------------------------");
		System.out.print("검색할 학생 인덱스 > ");
		int index = sc.nextInt();
		sc.nextLine();
		System.out.println(stuList.get(index));
		
		System.out.println("--------------------------------------");
		System.out.print("변경할 학생 인덱스 > ");
		index = sc.nextInt();
		sc.nextLine();
		System.out.print("변경 할 국어 점수 >");
		int kor = sc.nextInt();
		System.out.print("변경 할 영어 점수 >");
		int eng = sc.nextInt();
		sc.nextLine();
		Score score = new Score(kor,eng);
		stuList.get(index).setScore(score);		
		
		System.out.println("--------------------------------------");
		System.out.print("삭제할 학생 인덱스 > ");
		index = sc.nextInt();
		sc.nextLine();
		stuList.remove(index);
		
		System.out.println("--------------------------------------");
		for(int i = 0 ; i <stuList.size(); i++){
			System.out.println(stuList.get(i));
			System.out.println("\n");
		}
		
		sc.close();
	}
	
}
