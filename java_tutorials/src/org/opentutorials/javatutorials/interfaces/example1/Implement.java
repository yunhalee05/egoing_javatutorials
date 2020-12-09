package org.opentutorials.javatutorials.interfaces.example1;
//인터페이스는 어떤 객체가 있고 그 객체가 특정한 인터페이스를 사용한다면 그 객체는 반드시 인터페이스메소드를 사용해야 한다는 것이다. 
//강제성을 주는 것이다. (반드시 구현하라고)
interface I{//인터페이스 
    public void z();//인터페이스의 메소드
}
 
class A implements I{//클래스A는 인터페이스I를 구현한다. 
    public void z(){}//인터페이스 안의 메소드를 구현해야지 오류가 발생하지 않는다. (안하면 컴파일 오류)
}