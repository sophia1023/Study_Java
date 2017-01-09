package edu.java.string06;

public class StringMain06 {

	public static void main(String[] args) {
		String str = "abc";
		str += "def";
		System.out.println(str);
		
		System.out.println("----------------------------");
		String result = str.concat("ghi"); // "abcdef" + "ghi" => "abcdefghi"
		System.out.println(".concat() => " + result);
		System.out.println("str => " + str); // 두 주소 값이 다르다.
		
		System.out.println("-----------------------------");
		StringBuffer buff = new StringBuffer("ABC");
		StringBuffer result2 = buff.append("DEF");
		System.out.println("StringBuffer result2 => "+ result2);
		System.out.println("StringBuffer buff = >" + buff);
		
		System.out.println("-----------------------------");
		StringBuffer buff2 = new StringBuffer("AAA");
		buff2.append("BBB").append("CCC").append("CCC");
		System.out.println("StringBuffer buff2 => " + buff2);
	}

}
