package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo2 extends OverloadingDemo{//상속 받는다. 
    void A (String arg1, String arg2){System.out.println("sub class : void A (String arg1, String arg2)");}
    void A (){System.out.println("sub class : void A ()");}
    public static void main(String[] args) {
        OverloadingDemo2 od = new OverloadingDemo2();
        od.A();//인자가 없는 메소드는 부모에서도 존재한다(오버라이딩이 되는것(로딩x))
        od.A(1);//자식클래스에 없으므로, 부모에서 가져올 것이다. 
        od.A("coding everybody");//자식클래스에서 실행
        od.A("coding everybody", "coding everybody");//자식클래스에서 실행
         
    }
}
