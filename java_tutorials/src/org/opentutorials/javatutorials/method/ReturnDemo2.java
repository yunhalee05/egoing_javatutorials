package org.opentutorials.javatutorials.method;

public class ReturnDemo2 {
	public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";//if를 사용해서 입력값에 따라서 여러개의 값을 리턴가능하게 할 수 있다. 
    }
 
    public static void main(String[] args) {
        System.out.println(num(1));
    }
}
