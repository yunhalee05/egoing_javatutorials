package org.opentutorials.javatutorials.inheritance.example3;

class Calculator {
    int left, right;
    public Calculator() {}//기본 생성자를 (오류를 해결하기위해)생성해 주었다. (오류 해결)
     
    public Calculator(int left, int right){//초기생성자 지정(기본 생성자가 없다. )
        this.left = left;
        this.right = right;
    }
     
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
    public SubstractionableCalculator(int left, int right) {
    	//여기서 인스턴스화 하면, 생성자 호출하기 전에 부모클래스의 생성자를 자동으로 호출하도록 약속되어 있는데, 
    	//기본 생성자가 아닌 생성자를 명시해놨다. (부모가) 하위가 상속받을 때 기본생성자(부모에서)호출 할 수 없어서 생기는 오류다
    	//(implicit super constructor~)->부모 클래스에 기본 생성자를 생성하면 오류를 해결 할 수 있을 것이다. 
    	
        this.left = left;
        this.right = right;
    }
    /*
     
     //바로 이 super라는 것을 사용하는 것이다!
    public SubstractionableCalculator(int left, int right) {
        super(left, right);//이것은 부모 클래스를 의미한다. (this 가 자기자신을 가르키듯이)
        //입력값이 super 안의 left, right(부모안의 left, right)값으로 들어간다. 
        //값이 입력되기 때문에 기본생성자가 아닌 매개변수를 받는 생성자가 호출되어서 실행될 것이다. 
         (기본 생성자가 없어도 되고,중복의 문제도 해결한다!)
         단! 초기화 코드(부가 )를 항상 super 아래에 위치 시킬 것!(super 호출 다음에 )
         (상위 클래스 초기화가 끝난 후에야 하위 클래스 생성자 초기화가 가능할 것이다 라는 의미다)
    }
    */
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
    
    //암시적으로 부모 생성자에 calculator 생성자가 (기본이)명시되어 있지 않아서 생기는 오류
}
//그러나 부모에서 기본 생성자를 명시적으로 생성해주지 않고도 오류를 해결하고, 
//또 부모와 자식의 생성자가 같은 기본 값을 가르키는 중복의 문제를 해결할 방법이 있을 것이다.
//--->하위 클래스에서 생성자 호출할 때 상위 클래스의 것을 쓰도록 하면 된다. (super 사용)

