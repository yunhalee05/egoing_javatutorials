package org.opentutorials.javatutorials.inheritance.example4;

public class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();//자기자신을 인스턴스화 한다. -가능하다. 
    }
    
    /*
     1)
     그러나 생성자에 매개변수가 있는 경우에는 오류가 난다. 
     public class ConstructorDemo {
    public ConstructorDemo(int param1) {}//매개변수가 있다. (기본생성자가 아니라는 것)
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();//class constructor는 매개변수가 없다. 
        생성자는 클래스이름과 동일한 매개변수가 없는 기본 생성자가 생성된다. (아무값도 없는 상태)자바가 자동으로 생성한다. 
        매개변수가 있는 생성자가 생성되면 기본생성자 대신에 매개변수가 있는 생성자를 기본으로 한다. 
        (null 값인 생성자를 만들지 않는다는것 - 매개변수 없어서 오류 발생!(인스턴스에서))
    }
    
    2)
    public class ConstructorDemo {
    public ConstructorDemo(){}//이런식으로 기본생성자를 명시해주면 오류를 없앨 수 있다. 
    public ConstructorDemo(int param1) {}
    public static void main(String[] args) {
        ConstructorDemo  c = new ConstructorDemo();//아무값도 없는 기본생성자를 실행할 수 있다. 
    }

    
    

     */
    
}