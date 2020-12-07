package org.opentutorials.javatutorials.Io;

import java.util.Scanner;

public class Scanner2Demo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//입력값에 공백이 있다면 입력값이 실행될 것이다. 
        while(sc.hasNextInt()) {//입력값이 있는 한 계속해서 실행
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();//문자를 입력하면 int가 아니기 때문에 while문 나오고 sc.close로 종료된다.
    }
 
}
