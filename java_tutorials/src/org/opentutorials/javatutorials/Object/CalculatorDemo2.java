package org.opentutorials.javatutorials.Object;

public class CalculatorDemo2 {
	 
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {//중복제거-리팩토링
        sum(10, 20);
        sum(20, 40);
    }
}
 
