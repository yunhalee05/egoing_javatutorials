package org.opentutorials.javatutorials.abstractclass.example1;

abstract class A{//안에 추상 메소드 하나라도 있으면 그 멤버를 담은 클래스도 추상이 된다. 
    public abstract int b();//여기서 b는 실체는 없고 (안에) 추상적인 형식만 가지고 있다. 
    //본체가 있는 메소드는 abstract 키워드를 가질 수 없다.
    //public abstract int c(){System.out.println("Hello")}(안에 내용이 있기 때문에 추상 메소드 아닌데 추상이라고 써서 오류 생긴다. )
    //추상 클래스 내에는 추상 메소드가 아닌 메소드가 존재 할 수 있다. 
    public void d(){
        System.out.println("world");//
    }
}

class B extends A{
    public int b(){return 1;}//추상 클래스를 사용하기 위해서는 반드시 오버로딩해서 구체적 내용을 입력해줘야지 사용할 수 있다. 
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A(); A가 추상클래스라서 오류(추상클래스는 꼭 상속해서 사용해야 한다!)

        B obj = new B();
        System.out.println(obj.b());
    }
}