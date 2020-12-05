package org.opentutorials.javatutorials.array;

public class ForEachDemo {

	public static void main(String[] args) {
		 String[] members = { "최진혁", "최유빈", "한이람" };
	        for (String e : members) {
	            System.out.println(e + "이 상담을 받았습니다");
	        }
	        
	        //for문에서 더 간편하게 String e에 각각의 멤버 요소를 담아서 실행한다.
	       //반복문과 배열은 뗄 수 없는 관계다.
	        
	        
	        
	        /*String[] members = { "최진혁", "최유빈", "한이람" };
	        System.out.println(members[3]);     
	        1
	        2
	        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	            at ot_array.ExceptionDemo.main(ExceptionDemo.java:7)
	         */
	        
	        
	        
	        /*String[] members = new String[3];
	        members[0] = "최진혁";
	        members[1] = "최유빈";
	        members[2] = "한이람";
	        members[3] = "이고잉";
	        
	        
	        //할당받지 않은 자리에 값 넣으려고하면 오류발생한다.
	        */
	}

}
