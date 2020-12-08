package org.opentutorials.javatutorials.overloading.example1;

public class OverloadingDemo {//오버로딩 리턴타입은 같아야 한다!
	//매개변수 타입(이름 아니다)은 달라도 되지만 리턴타입, 이름은 같아야 오버로딩!
    void A (){System.out.println("void A()");}
    void A (int arg1){System.out.println("void A (int arg1)");}
    void A (String arg1){System.out.println("void A (String arg1)");}
    //int A (){System.out.println("void A()");}//에러 발생
    //같은이름의 메소드가 있는데 매개변수가 없는 두개의 메소드 A가 정의 되는데 하나는 리턴이 있고, 하나는 없을 것이다. (void, int)
    //이름과 매개변수가 같지만 리턴 타입이 다르다면 오류가 발생한다. (어떤 메소드를 호출해야 하는지 모르기 때문에 오류가 난다)
    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.A();//매개변수 없는 메소드 호출
        od.A(1);//int 매개변수 메소드 호출
        od.A("coding everybody");//string 매개변수 메소드 호출
    }
}
