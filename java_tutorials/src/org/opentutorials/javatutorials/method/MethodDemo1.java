package org.opentutorials.javatutorials.method;

public class MethodDemo1 {
	 public static void numbering() {//이것이 넘버링 메소드
	        int i = 0;
	        while (i < 10) {
	            System.out.println(i);
	            i++;
	        }
	    }
		 
	    public static void main(String[] args) {//메인
	        numbering();//넘버링메소드가 실행된다.
	    }
}


