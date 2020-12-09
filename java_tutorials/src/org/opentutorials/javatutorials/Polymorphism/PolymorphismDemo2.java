package org.opentutorials.javatutorials.Polymorphism;

interface I{}
class G implements I{}//어떤 클래스가 인터페이스를 구현하고 있다면, 클래스가 i를 구현하고 있기 떄문이다. 
public class PolymorphismDemo2 {
    public static void main(String[] args) {
        I obj = new G();
    }
}