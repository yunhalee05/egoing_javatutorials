package org.opentutorials.javatutorials.reference;

public class ReferenceParameterDemo {
    
    static void _value(int b){//기본형
        b = 2;
    }
     
    public static void runValue(){
        int a = 1;
        _value(a);
        System.out.println("runValue, "+a);//기본형 불러내기
    }
     
    static void _reference1(A b){
        b = new A(2);//참조형
    }
     
    public static void runReference1(){//참조형 불러내기
        A a = new A(1);
        _reference1(a);
        System.out.println("runReference1, "+a.id);     
    }
     
    static void _reference2(A b){//참조형
        b.id = 2;//참조형 값 변경
    }
 
    public static void runReference2(){
        A a = new A(1);
        _reference2(a);//변경한 값 불러내기
        System.out.println("runReference2, "+a.id);     
    }
     
    public static void main(String[] args) {
        runValue(); // runValue, 1
        runReference1(); // runReference1, 1
        runReference2(); // runReference2, 2
    }
 
}
