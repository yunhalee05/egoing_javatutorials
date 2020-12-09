package org.opentutorials.javatutorials.reference;
//new로 생성하는 것은 참조 자료형이다. 
public class ReferenceDemo1 {
	 
    public static void runValue(){
        int a = 1;
        int b = a;
        b = 2;
        System.out.println("runValue, "+a); 
    }
 
    public static void main(String[] args) {
        runValue();
    }
 
}
