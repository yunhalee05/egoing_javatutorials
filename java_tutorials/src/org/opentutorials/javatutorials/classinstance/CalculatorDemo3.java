package org.opentutorials.javatutorials.classinstance;

class Calculator3{
	  
    public static void sum(int left, int right){//static을 붙이면 클래스 소속의 메소드가 된다.(그 인자 값으로 left right입력 받는다) 
        System.out.println(left+right);
    }
     
    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}
 
public class CalculatorDemo3 {
     
    public static void main(String[] args) {
        Calculator3.sum(10, 20);//인자전달을 바로 (인스턴스 없이)-클래스에 직접 접근해서 값을 입력
        Calculator3.avg(10, 20);//일회용처럼 인자를 사용하는 것이다. 
         
        Calculator3.sum(20, 40);
        Calculator3.avg(20, 40);
    }
    //인스턴스를 사용하는 경우에는 다른 인스턴스와 구분되게 다른 상태를 가지고 있는 상태여야하기 때문에. (계속해서 값을 사용하는 경우)
   
}