package org.opentutorials.javatutorials.exception;

class Calculator_{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){//예외가 발생하면 아래 내용을 실행 (예외처리)exception이라는 클래스 안에 변수 e
            System.out.println("오류가 발생했습니다 : "+e.getMessage());//e의 getMessage함수가 오류원인을 출력한다. 
        }
    }
} 
public class CalculatorDemo1_1 {
    public static void main(String[] args) {
        Calculator_ c1 = new Calculator_();
        c1.setOprands(10, 0);
        c1.divide();
         
        Calculator_ c2 = new Calculator_();
        c2.setOprands(10, 5);
        c2.divide();
    }
}