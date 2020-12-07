package org.opentutorials.javatutorials.Io;

import java.util.Scanner;//이미 실행된 파일에게 입력값 제공(라이브러리기능사용)//로드

public class ScannerDemo {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        //사용자로부터 입력값 받는다.(스캐너라는 객체를 new로 만들고 사용자가 입력한 값을 알아내겠다는 것이다. )
	        //sc라는 변수에 받는 것이다. 
	        int i = sc.nextInt();//객체 변수는 nextint라는 의미.(int만 입력해야한다)
	        System.out.println(i*1000);
	        sc.close();
	  }
}
