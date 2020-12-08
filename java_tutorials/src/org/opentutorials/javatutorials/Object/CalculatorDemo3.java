package org.opentutorials.javatutorials.Object;

public class CalculatorDemo3 {
	 
    public static void avg(int left, int right) {//평균치 구하기 method
        System.out.println((left + right) / 2);
    }
 
    public static void sum(int left, int right) {//합 구하기 method
        System.out.println(left + right);
    }
 
    public static void main(String[] args) {
        int left, right;
 
        left = 10;
        right = 20;
 //중간에 sum메소드나 변수 left, right의 값을 누군가가 변경해버릴 수 있다. (문제를 가진 요소가 생기는 것)
        sum(left, right);
        avg(left, right);
 //연관된 로직들이 반복된다. 메소드로 한번에 묶을 수도 있지만, 하나하나 따로 부르고 싶으면 객체를 사용하는 것이다. 
        left = 20;
        right = 40;
 
        sum(left, right);
        avg(left, right);
    }
 
}
