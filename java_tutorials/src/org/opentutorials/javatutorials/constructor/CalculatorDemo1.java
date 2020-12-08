package org.opentutorials.javatutorials.constructor;

class Calculator {//반드시 left, right설정해야하는데, 이 객체생성과정에서 값을 셋팅해보자. =생성자
    int left, right;
 
    public Calculator(int left, int right) {//클래스와 같은 이름의 메소드(생성자-기본값 생성)
        this.left = left;//이전 예제의 setoprands의 기능을 하고 있는 것이다. 
        this.right = right;
    }//객체가 가장 먼저 실행되어 (메소드 중에서 )해야할일 = 초기화 하도록 지정해주는 기능을 한다. 
 //우리가 따로 생성자를 지정해주지 않으면 알아서 생성자를 생성한다. 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        Calculator c1 = new Calculator(10, 20);//기본적으로 값 지정하도록 되어있다. (인스턴스시에)
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40);//생성자임을 드러낸다. (클래스를 구체화 하는 인스턴스)
        c2.sum();
        c2.avg();
    }
 
}
