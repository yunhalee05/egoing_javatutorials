package org.opentutorials.javatutorials.scope;

public class ScopeDemo6 {
    static int i = 5;//전역변수인 i
 
    static void a() {
        int i = 10;//로컬 변수인 i
        b();
    }
 
    static void b() {
        System.out.println(i);//전역변수 i를 사용한다. (전역변수에 i가 없다면 오류 발생할 것이다. )
    }
    //정적인 유효범위(static, lexical scope)(전역변수를 사용하는 경우)
    //만약 a안의 i를 사용하게 된다면 (b에서)동적인 유효범위가 된다. (dynamic scope)
 
    public static void main(String[] args) {
        a();//출력하면 화면에 5가 출력된다. 
    }
 
}
