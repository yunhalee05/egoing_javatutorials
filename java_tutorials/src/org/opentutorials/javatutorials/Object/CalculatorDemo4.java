package org.opentutorials.javatutorials.Object;


class Calculator{//지금부터 calculator라는 객체의 설계도를 만들겠다는 의미 (calculator c1=new...)
    //인스턴스의 설계도
	int left, right;//변수 선언 
      
    public void setOprands(int left, int right){//변수의 값 넣는 메소드 
        this.left = left;//this.left는 우리가 생성한 인스턴스를 가르키는 것. (c1, c2)변수를 가르킨다. 
        this.right = right;
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {//left, right에 따라서 sum, avg계산 객체
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();//new를 붙이는 것이 calculator객체를 만드는 것이다. 
        //calculator라는 변수를 새로 만들어서 c1이라는 변수에 담았는데 얘는 calculator라는 객체를 담는 데이터 형식이다. 
        c1.setOprands(10, 20);
        //c1에는 우리가 설정한 객체가 담겨있는데, 여기서 setOprands를 사용했다. (연산의 대상이 될 값들을 연산의 인자로 지정)
        c1.sum();       
        c1.avg();       
        
        Calculator c2 = new Calculator();          //인스턴스 
        c2.setOprands(20, 40);
        c2.sum();       
        c2.avg();
    }
  
}
