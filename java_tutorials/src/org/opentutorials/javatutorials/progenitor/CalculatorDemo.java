package org.opentutorials.javatutorials.progenitor;

class Calculator{//extends Object(오브젝트 안에 tostring이 정의되어 있기 때문에 이에 속한 calculator도 사용가능 한 것이다. )
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
    
    /*
      public String toString(){//오버라이딩으로 toString()을 바꿀 수도 있다. 
     
        return "left : " + this.left + ", right : "+ this.right;
    }
    */

}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        System.out.println(c1);
        System.out.println(c1.toString());

    }
  
}
