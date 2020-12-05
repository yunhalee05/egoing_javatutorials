package org.opentutorials.javatutorials.method;

public class MethodDemo4 {//메소드 = 재활용 
	  public static void numbering(int limit) {
		  //limit이라는 변수를 받는다.(int는 매개변수=parameter)
		  //int limit  =5;와 같은 의미가 된다.(메인에서 입력값 넣었기 때문에)
		  
	        int i = 0;
	        while (i < limit) {
	            System.out.println(i);
	            i++;
	        }
	    }
	 
	    public static void main(String[] args) {
	        numbering(5);//5 입력값 입력(입력값에 따라 출력값이 달라진다)
	        //(5는 인자 = argument)
	    }
	    
	    /*
	     public static void numbering() {
    	int limit = 5;
    	int i = 0;
    	while (i < limit) {
        System.out.println(i);
        i++;
    	}
	     */
}
