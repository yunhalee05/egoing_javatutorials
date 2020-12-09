package org.opentutorials.javatutorials.Polymorphism;

class E{
    public String x(){return "E.x";}
}
class F extends E{
    public String x(){return "F.x";}
    public String y(){return "y";}
}
class F2 extends E{
    public String x(){return "F2.x";}
}
public class PolymorphismDemo1_4 {
    public static void main(String[] args) {
        E obj = new F();
        E obj2 = new F2();//E가 F,F2의 부모 클래스다. 
        System.out.println(obj.x());//원래 클래스 F의 F.x
        System.out.println(obj2.x());//원래 메소드의 F2.x
    }
}//부모 클래스 행세를 하고 있고 자식에서 추가한 것을 사용할 수는 없지만, 오버라이딩 한다면 자식의 메소드를 쓴다. 
//동일한 데이터 타입으로 존재하면서 각각의 클래스에 정의된 메소드를 호출 할 떄는 각자의 메소드로 호출한다는 의미. 