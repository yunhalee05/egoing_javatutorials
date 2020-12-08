package org.opentutorials.javatutorials.overriding.example1;

class Calculator {
    int left, right;
 
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
    
    /*
     여기서 자식클래스를 리턴하고 싶어서 부모클래스의 avg정의를 바꾸면
      public int avg() {
        return ((this.left + this.right) / 2);
    }
    이 되는데 이는 자식클래스의 메소드와 중복되는 부분이므로 자식을 super로 하여 부모를 상속하도록 하자. 
     */
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {//overriding했다. (부모가 이미 가진 sum을 재 정의)
        System.out.println("실행 결과는 " +(this.left + this.right)+"입니다.");
    }
     
    /*
      
     public int avg() {
        return (this.left + this.right)/2;//단 여기서는 오버라이딩 오류가 발생하는데, 하위 클래스의 리턴 타입이 부모의 리턴 타입과 호환되지 않기 때문이다. 
        //부모는 리턴이 void이고 자식은 int 형식이라서 오버라이딩이 안되는 것이다. 
    }
    
    
     public int avg() {
        return super.avg();//부모와 중복되는 부분은 super로 받자. (부모클래스.소속 메소드())형식으로
        부가적인 내용은 super 다음에 설정해준다. 
    }
    */
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();//자식클래스의 sum이 실행된다. (재정의 한 메소드가 출력된다는 의미다)->오버라이딩
        c1.avg();
        c1.substract();
    }
    
    //오버라이딩을 하기 위해서는 매개변수, 리턴, 이름 자식과 부모클래스가 모두 같아야 메소드를 오버라이딩 할 수 있다. 
    //형식이 일치해야만 오버라이딩 가능하다. 
}