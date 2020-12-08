package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title);
        //title이 지역변수이기 때문에 main에서 실행할 수 없다. 
    }
 

}
