package org.opentutorials.javatutorials.method;

public class MethodDemo5 {
	   public static void numbering(int init, int limit) {//매개변수가 두개로 바뀌었다.
		   //매개변수를 여러개로하면 여러개의 값을 바꿀 수 있다. 
	        int i = init;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(1, 5);
	        //인자의 순서대로 입력하고 사이에 콤마를 넣는다. 
	    }

}
