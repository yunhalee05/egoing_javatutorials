package org.opentutorials.javatutorials.method;

public class ReturnDemo4 {
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }
 
    public static void main(String[] args) {
        String[] members = getMembers();
        //하나의 메소드가 여러명을 출력하고 싶다면 배열을 이용한다. 
    }

}
