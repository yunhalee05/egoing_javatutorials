package org.opentutorials.javatutorials.method;

public class MethodDemo3 {
	public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
 
    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
    }//코딩의 길이가 짧아지고 유지보수가 쉬워진다.
}
