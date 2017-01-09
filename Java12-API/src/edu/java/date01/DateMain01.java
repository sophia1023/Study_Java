package edu.java.date01;

import java.util.Date;

public class DateMain01 {

	public static void main(String[] args) {
		//시스템 내 시간 정보
		Date date  = new Date();
		System.out.println(date);

		//1970년 1워 1일 0시 0분을 기준으로 삼아서
		//milli-second(1/1000초) 마다 1씩 증가 시킨 값
		Date date2 = new Date(0L);
		System.out.println(date2);
		Date date3 = new Date(1000);
		System.out.println(date3);
	}

}
