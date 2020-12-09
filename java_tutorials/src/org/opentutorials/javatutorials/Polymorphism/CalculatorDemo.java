package org.opentutorials.javatutorials.Polymorphism;

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int _sum() {
        return this.left + this.right;
    }
    public abstract void sum();  
    public abstract void avg();
    public void run(){
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
} 
public class CalculatorDemo {
	public static void execute(Calculator cal){//다형성을 이용했기 때문에 들어가는 값이 다른데이터 타입임에도 calculator를 매개변수로 받는 함수하나로 해결할 수 있다.(아니라면 중복이 될 것이다. ) 
        System.out.println("실행결과");
        cal.run();//excute의 매개변수 cal
    }
    public static void main(String[] args) { 
        Calculator c1 = new CalculatorDecoPlus();//상위 클래스 행세를 한다. 
        c1.setOprands(10, 20);//데이터 타입을 가지고 있다. 
        c1.run();
         
        Calculator c2 = new CalculatorDecoMinus();//상위 클래스 행세를 한다. 
        c2.setOprands(10, 20);
        c2.run();
        
        execute(c1);//인자로 c1, c2 
        execute(c2);
    }
   
}
