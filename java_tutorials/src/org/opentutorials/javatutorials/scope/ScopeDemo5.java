package org.opentutorials.javatutorials.scope;

public class ScopeDemo5 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        //i는 for문안에서만 작동하기 때문에 나와서 사용하려고 하면 오류난다. 
    }
 
}