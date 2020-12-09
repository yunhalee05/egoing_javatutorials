package org.opentutorials.javatutorials.accessmodifier;

class Calculator{
    private int left, right;//private인 전역변수 (같은 클래스 안에서만 접근 가능하다)즉, 값을 외부에서 마음대로 변경 불가.
    //사용자가 마음대로 내부 메소드를 변경할 수 없다는 얘기다. 
     
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    private int _sum(){
        return this.left+this.right;//공개적으로 사용하지 않아도 되거나 보안상 같은 클래스 애들만 올 수 있게 제어한다. 
    }
    public void sumDecoPlus(){
        System.out.println("++++"+_sum()+"++++");
    }
    public void sumDecoMinus(){
        System.out.println("----"+_sum()+"----");
    }
}
  
public class CalculatorDemo {
    public static void main(String[] args) {        
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sumDecoPlus();//퍼블릭인 sumDecoPlus가 private이지만 같은 클래스의 sum을 부른다. 
        c1.sumDecoMinus();
    }
}
