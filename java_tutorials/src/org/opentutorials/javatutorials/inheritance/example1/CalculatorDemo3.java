package org.opentutorials.javatutorials.inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator {//자식을 상속하는 자식 클래스 구현.
    public void division() {//calculator->MultiplicationableCalculator->DivisionableCalculator순으로 상속
        System.out.println(this.left / this.right);
    }
}
 
public class CalculatorDemo3 {
 
    public static void main(String[] args) {
 
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
    }
 
}
//코드의 중복 제거가 가능하고 부모가 만든 코드르 재활용이 가능하다. 
//유지보수 편의성, 가독성 증가. 
