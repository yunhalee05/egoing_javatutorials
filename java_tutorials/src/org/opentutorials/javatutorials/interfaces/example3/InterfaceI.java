package org.opentutorials.javatutorials.interfaces.example3;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class A implements I1, I2{//복수개의 인터페이스를 구현할 수 있다. 
    public void x(){}//단 모든 인터페이스의 내용을 구현해야 한다. 
    public void z(){}   
}
