package org.opentutorials.javatutorials.accessmodifier;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}
public class AccessDemo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());//private이기 때문에 외부의 클래스는 사용할 수 없다. 
        System.out.println(a.x());//public인 x를 불러서 private인 z를 호출 할 수는 있다. (x는 z와 같은 클래스 안에 있어서 사용할 수 있다. )
    }
}