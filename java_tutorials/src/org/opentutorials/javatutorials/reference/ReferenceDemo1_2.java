package org.opentutorials.javatutorials.reference;

class A{
    public int id;
    A(int id){
        this.id = id;
    }
}
public class ReferenceDemo1_2 {
 
    public static void runValue(){
        int a = 1;
        int b = a;//기본 데이터 타입을 넣으면 안에서 복제가 된다. 
        b = 2;
        System.out.println("runValue, "+a); 
    }
     
    public static void runReference(){
        A a = new A(1);//참조형 데이터 
        A b = a;//A라는 데이터 타입 을 인스턴스 화한 것에 집어 넣는 것 !=대입
        b.id = 2;//참조형으로 담겼기 때문에 다르게 동작한다. //a, b가 값이 아닌 인스턴스의 주소를 가지고 있기 때문!(동일한)
        System.out.println("runReference, "+a.id);      
    }
 
    public static void main(String[] args) {
        runValue();
        runReference();
    }
 
}
