package org.opentutorials.javatutorials.scope;

class C2 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(v);//여기서 v를 따로 지정해주면 20이 호출된다. 
    }
}
 
public class ScopeDemo8 {
 
    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }
 
}