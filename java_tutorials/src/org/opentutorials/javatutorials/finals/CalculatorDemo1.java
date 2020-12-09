package org.opentutorials.javatutorials.finals;

class Calculator {
    static final double PI = 3.14;//공통적(static), 바뀌지 않는(final)
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
        //Calculator.PI = 6;//바꾸려고 하면 오류발생
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
        System.out.println(c1.PI);
        //Calculator.PI = 10;
 
 
    }
 
}
//final인 메소드나 클래스는 다른데서 사용하거나, 오버라이딩 할 수 없다. (아래는 그 예제다)
/*
class A{
final void b(){}
}
class B extends A{
void b(){}//오류
}

final class C{
    final void b(){}
}
class D extends C{}//오류
*/
