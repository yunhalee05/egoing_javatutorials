package org.opentutorials.javatutorials.exception;

class A{
    private int[] arr = new int[3];//정수 배열 
    A(){
        arr[0]=0;//arr의 값을 입력
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);//존재하지 않는 인덱스의 값을 호출하고 있다 (예외)
    }
}
