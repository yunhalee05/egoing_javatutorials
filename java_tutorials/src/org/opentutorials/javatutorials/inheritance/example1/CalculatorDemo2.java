package org.opentutorials.javatutorials.inheritance.example1;

class MultiplicationableCalculator extends Calculator {//Calculator의 자식 하나 더 추가. 
    public void multiplication() {
        System.out.println(this.left * this.right);//부모의 인스턴스 사용
    }
}
 
public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);//초기값 설정. 
        c1.sum();
        c1.avg();
        c1.multiplication();//200출력
    }
 
}