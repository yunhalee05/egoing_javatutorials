package org.opentutorials.javatutorials.method;

public class ReturnDemo3 {
	public static String getMember1() {
        return "최진혁";
    }
 
    public static String getMember2() {
        return "최유빈";
    }
 
    public static String getMember3() {
        return "한이람";
    }
 
    public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
        //여러개의 입력값을 리턴하고 싶다면, 배열의 특성을 이용한다. 
    }
}
