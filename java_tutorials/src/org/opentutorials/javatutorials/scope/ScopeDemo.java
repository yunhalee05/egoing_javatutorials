package org.opentutorials.javatutorials.scope;


public class ScopeDemo {
 
    static void a() {
        int i = 0;//지연변수(local variable)
    }//영역밖에는 영향을 주지 않는다. (반복문에 영향주지 않음)--유효범위
 
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }
 
}