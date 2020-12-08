package org.opentutorials.javatutorials.inheritance.example2;

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
 
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {//자식클래스에서 생성자가 값 받도록 지정. 
        this.left = left;//상위 클래스의 set 없이 바로 자식에서 값 지정하고 사용할 수 있도록 생성자를 사용한 것이다. 
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();//c1setOperand가 사라졌다. 
        c1.avg();
        c1.substract();
    }
}