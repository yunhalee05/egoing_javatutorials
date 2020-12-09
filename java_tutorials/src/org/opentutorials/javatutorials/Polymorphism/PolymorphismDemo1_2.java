package org.opentutorials.javatutorials.Polymorphism;

class A{
    public String x(){return "x";}
}
class B extends A{
    public String y(){return "y";}
}
public class PolymorphismDemo1_2 {
    public static void main(String[] args) {
        A obj = new B();
        obj.x();
        //obj.y();//오류가 생기는 이유는 실질적으로 b를 담지만 a의 행세를 하기 때문에 x만 가능하다. (y정의되어 있지 않다)
    }
}
//어떤클래스를 인스턴스화 할때 그 객체를 담는 데이터 타입은 그 클래스의 부모 클래스가 될 수도 있다. 
//부모 클래스 인 것 처럼 작동한다. 