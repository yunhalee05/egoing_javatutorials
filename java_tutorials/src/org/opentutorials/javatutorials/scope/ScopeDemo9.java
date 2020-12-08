package org.opentutorials.javatutorials.scope;

class C3 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(this.v);
    }//여기서 this.v란 전역변수를 뜻한다. (10이 출력될 것이다. )-this가 객체에 대한 전역의 의미
}//만약 여기서 범위 안에 같은 이름의 변수를 셋팅하고 하나는 지역, 하나는 전역을 사용하고 싶다면,
//지역변수는 그냥 int ~로 새로 선언해주고, 전역변수는 this.~를 통해서 나타내면 된다. (이름이 겹칠 때 사용한다)
 

//객체지향 프로그래밍 - 전역변수의 사용을 최소화!&전역변수 사용 범위를 최소화!--->상호호환 가능한 전역변수로 만들기
public class ScopeDemo9 {
 
    public static void main(String[] args) {
        C3 c1 = new C3();
        c1.m();
    }
 
}