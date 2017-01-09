package edu.java.collection04;

public class Score {

	private int korean;
	private int english;
	
	public Score(){}
	public Score(int korean, int english){
		this.korean = korean;
		this.english = english;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {

		return "국어 점수 : " + korean + "\n 영어 점수 : " + english;
	}
	
	
	
	
}
