package edu.java.string04;

public class StringMain04 {

	public static void main(String[] args) {
		// String 클래스의 메소드
		// (API: Application Programming Interface)
		
		// length(): 문자열의 길이를 리턴
		String str1 = "abc";
		String str2 = "안녕";
		System.out.println(str1.length());
		System.out.println(str2.length());
		
		System.out.println();
		// equals(): 문자열의 내용을 비교
		// Object 클래스의 equals() 메소드를 override함.
		System.out.println(str1.equals(str2));
		
		System.out.println();
		// equalsIgnoreCase(): 대소문자 구별 없이 비교
		String str3 = "Hello";
		String str4 = "hello";
		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));

		System.out.println();
		// charAt(int): 문자열 중에서 해당 인덱스의 문자 하나를 리턴
		System.out.println(str3.charAt(1));
		
		System.out.println();
		// indexOf(): 해당 문자 또는 문자열이 처음으로 등장하는 인덱스
		// lastIndexOf(): 문자 또는 문자열이 가장 마지막으로 등장하는 인덱스
		String str5 = "Hello, world!";
		System.out.println(str5.indexOf('l'));
		System.out.println(str5.indexOf("world"));
		System.out.println(str5.lastIndexOf('l'));
		
		System.out.println();
		// startsWith(String): 문자열로 시작하는지 아닌지 
		String str6 = "www.google.com";
		System.out.println(str6.startsWith("http://"));
		
		System.out.println();
		// contains(String): 문자열을 포함하고 있는지 아닌지
		System.out.println(str6.contains("google"));
		
		System.out.println();
		// split()
		String str7 = "2017/01/05";
		String[] result = str7.split("/");
		for (String x : result) {
			System.out.println(x);
		}
		
		String str8 = "04:53:55";
		result = str8.split(":");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		String str9 = "2017-01-05 16:55:15";
		result = str9.split("-|:| ");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println();
		// compareTo()
		// compareToIgnoreCase()
		String str10 = "bbc";
		String str11 = "abc";
		System.out.println(str10.compareTo(str11));
		System.out.println(str10.compareToIgnoreCase(str11));
		
		System.out.println();
		// toUpperCase()
		// toLowerCase()
		String str12 = "Hello, Java!";
		System.out.println(str12.toUpperCase());
		System.out.println(str12.toLowerCase());
		
		System.out.println();
		// substring(begin, end):
		//   begin 인덱스는 포함, end 인덱스는 포함되지 않음
		System.out.println(str12.substring(1, 6));
		
		System.out.println();
		// concat(): 문자열을 이어주는 메소드
		System.out.println(str12.concat("World!"));
		
	} // end main()

} // end class StringMain04