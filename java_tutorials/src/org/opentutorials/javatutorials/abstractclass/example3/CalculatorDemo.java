package org.opentutorials.javatutorials.abstractclass.example3;
//추상메소드는 상속을 강제하기 위해서 사용한다. (하위클래스의 책임으로 한다)

abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){//공통적인 부분은 그대로 구현.
        this.left = left;
        this.right = right;
    } 
    public abstract void sum();  //하위 클래스에서 정의할 것이다. 
    public abstract void avg();	//하위 클래스에서 정의할 것이다. 
    public void run(){//공통적인 부분은 그대로 구현하고, 공통적이지 않은 부분은 하위에서 정의하도록 추상클래스로 만든다. 
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+(this.left+this.right));//추상클래스를 하위에서 구현.
    }
    public void avg(){
        System.out.println("+ avg :"+(this.left+this.right)/2);//추상클래스를 하위에서 구성.
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+(this.left+this.right));//추상클래스를 하위에서 구성.
    }
    public void avg(){
        System.out.println("- avg :"+(this.left+this.right)/2);//추상클래스를 하위에서 구현.
    }
} 
public class CalculatorDemo {
    public static void main(String[] args) { 
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);//부모클래스에서 구현
        c1.run();//자식 클래스에서 구현(sum, avg가 호출될 것이다. )
         
        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);//부모클래스에서 구현
        c2.run();//자식 클래스에서 구현(sum, avg가 호출될 것이다. )
    }
   
}


/*
 여기서 공통적인 부분이 발생하는데 (sum, avg뒤의 수식부분)
 abstract class Calculator{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    } 
    int_sum() {
    return this.left+this.right;//이렇게 _sum함수를 따로 구현하고, 
    }
    public abstract void sum();  
    public abstract void avg();	
    public void run(){
        avg();
    }
}
class CalculatorDecoPlus extends Calculator {
    public void sum(){
        System.out.println("+ sum :"+_sum());//이렇게 중복부분을 제거할 수 있다. 
    }
    public void avg(){
        System.out.println("+ avg :"+_sum()/2);
    }
} 
class CalculatorDecoMinus extends Calculator {
    public void sum(){
        System.out.println("- sum :"+_sum());
    }
    public void avg(){
        System.out.println("- avg :"+_sum()/2);
    }
} 
 */
