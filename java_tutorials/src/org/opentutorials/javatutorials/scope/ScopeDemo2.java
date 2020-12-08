package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i;//선언
     
    static void a() {
        i = 0;//선언하지 않고 할당만 한다. (전역변수 i를 사용한다)
    }
 
    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {//선언하지 않고 할당만 한다. (전역변수 사용)
            a();//a라는 메소드에서 i를 다시 0으로 초기화한다. (++하고 다시 0으로 초기화 한다. )
            System.out.println(i);
        }
    }
 //실행하면 무한 반복이 발생된다.(i의 값은 static으로 class바로 밑에 선언되었다(전역변수-class바로 밑에 선언)
    
}//만약 a메소드 안의 i를 int i 로 변경하면(선언을 해주면) a안의 i는 로컬 변수가 된다. 
//전역변수를 사용하는 메인에서는 i++가 그대로 이루어져 01234가 나온다. 
//반복문 안의 i를 int로 선언해줘도 마찬가지(사용 범위-유효범위가 달라지기 때문)01234가 출력된다. 