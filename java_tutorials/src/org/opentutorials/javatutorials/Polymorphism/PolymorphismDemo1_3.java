package org.opentutorials.javatutorials.Polymorphism;

class C{
    public String x(){return "C.x";}
}
class D extends C{
    public String x(){return "D.x";}//x를 오버라이딩 중이다. 
    public String y(){return "y";}
}
public class PolymorphismDemo1_3 {
    public static void main(String[] args) {
        C obj = new D();
        System.out.println(obj.x());//오브젝트 안에 있는 x를 쓰겠다는 의미
    }//클래스 c의 행세를 하고 있지만 정의는 d안의 x를 사용하고 있다. (오브젝트는 행세를 하기 때문에 y는 안된다)
    //하지만 오버라이딩한 같은 이름의 메소드는 오버라이딩 된 것을 부른다. (인스턴스화 된 것을 부른다)
}