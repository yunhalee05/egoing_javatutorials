package org.opentutorials.javatutorials.method;

public class ReturnDemo {
	public static int one() {
        return 1;//제일먼저 실행되는 1이 되돌아온다. 
        //return 2;
        //return 3;//뒤의 리턴들은 실행되지 않는 코드로 컴파일 오류가 나다. 
    }
 
    public static void main(String[] args) {
        System.out.println(one());//메소드호출하는데 리턴이 3개다. 
    }
}
