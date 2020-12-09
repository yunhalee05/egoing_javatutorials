package org.opentutorials.javatutorials.Polymorphism;

interface I2{
    public String A();//a를 강제 구현
}
interface I3{
    public String B();//b를 강제 구현
}
class H implements I2, I3{
    public String A(){//i를 구현. 
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        H obj = new H();//클래스와 데이터 타입 동일.
        I2 objI2 = new H();//H가 구현하고 있는 데이터 타입중 하나인 i2
        I3 objI3 = new H();//H가 구현하고 있는 데이터 타입중 하나인 i3
         
        obj.A();
        obj.B();
         
        objI2.A();//A만을 가진 것처럼 작동.(i2)
        //objI2.B();
         
        //objI3.A();
        objI3.B();//B만을 가진 것처럼 작동(i3)
    }
}//그 멤버들만을 가진 것처럼 작동한다. 
//그룹핑 되어있는 인터페이스를 데이터 타입을 특정하면서 특정 기능만 사용하도록 할 수 있다. 