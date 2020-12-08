package org.opentutorials.javatutorials.overloading.example1;
//오버로딩이란 같은 이름의 메소드에 다른 매개변수를 넣어서 실행하는 메소드를 만드는 것이다. 
class Calculator{
    int left, right;
    int third = 0;
      
    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)");
        this.left = left;
        this.right = right;
    }
     
    public void setOprands(int left, int right, int third){//메소드 오버로딩
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }
    
    /*
     단 여기서 left, right부분의 선언부분이 중복이 되고 있는데 이 부분은 
         public void setOprands(int left, int right, int third){//메소드 오버로딩
        this.setOprands(left, right);(위의부분 알아서 호출한다->중복제거)
        System.out.println("setOprands(int left, int right, int third)");
        this.third = third;
    }
    이런식으로 중복을 제거할 수 있다. 
    
     */
     
    public void sum(){
        System.out.println(this.left+this.right+this.third);//세번째 값 입력안되면 기본값 사용
    }
      
    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}
  
public class CalculatorDemo {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
         
    }//같은 이름이므로 들어오는 매개변수에 따라 호출하는 메소드가 다를 것이다. (자바가 매개변수를 보고 호출)
    //이름 여러개 만들어야 하는 어려움이 줄어들 것이다. 
  
}