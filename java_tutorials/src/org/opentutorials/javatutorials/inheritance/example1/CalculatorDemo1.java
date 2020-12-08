package org.opentutorials.javatutorials.inheritance.example1;

class Calculator {
    int left, right;
 
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
 
class SubstractionableCalculator extends Calculator {//새로운 클래스 생성(extends ~)를 상속한다.
    public void substract() {//상속받은 클래스가 상위 클래스를 확장하는 의미다. 
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo1 {
 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);//setOprands는 Calculator class에서 가져온다. 
        c1.sum();
        c1.avg();
        c1.substract();//애는 상속받은 자식 클래스에서 실행한다. (부모에 없어서)
    }
 
}