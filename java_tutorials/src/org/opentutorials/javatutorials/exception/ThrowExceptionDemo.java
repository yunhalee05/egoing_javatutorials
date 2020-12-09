package org.opentutorials.javatutorials.exception;
//여기서 예외 처리 못하고 다음 사용자한테 넘기는 경우
class B{
    void run(){//여기서 만약 예외가 발생한다면, b가 처리안하고 c 에게 던질 수 도있다. 
    }
}
class C{
    void run(){
        B b = new B();//c는 그 예외를 또 main에게 넘길 수 있다. 
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {//어플리케이션 예외처리하지않고 넘기겠다는 것. 
         C c = new C();
         c.run();
    }   //b->c->main순이다. (메인으로 가는 방향이 사용자)(최종적 사용자는 일반 사용자)-End user
}
