package org.opentutorials.javatutorials.interfaces.example3;
//인터페이스도 상속이 된다. 
interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class B implements I4{
    public void x(){}//상속받은 모든 내용들을 다 구현해내야 한다. 
    public void z(){}   
}