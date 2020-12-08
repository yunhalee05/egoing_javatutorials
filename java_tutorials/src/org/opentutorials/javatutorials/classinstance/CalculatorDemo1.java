package org.opentutorials.javatutorials.classinstance;//클래스 변수

class Calculator {
    static double PI = 3.14;//객체마다 다른 값을 갖지 않고 같은 값을 갖는다. 
    //인스턴스 모두 같은 값을 공유하는 클래스 변수--static변수 (클래스에 소속이 되는 변수)
    int left, right;
    //인스턴스마다 다른 값을 가지게 되는 인스턴스 변수
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator();
        System.out.println(c1.PI);//인스턴스를 이용해서 PI에 접근
 
        Calculator c2 = new Calculator();
        System.out.println(c2.PI);
 
        System.out.println(Calculator.PI);//클래스를 이용해서 PI에 접근
 
    }
 
}