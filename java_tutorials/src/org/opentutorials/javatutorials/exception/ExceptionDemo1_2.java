package org.opentutorials.javatutorials.exception;

class A_{
    private int[] arr = new int[3];
    A_(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
    }
}
 
public class ExceptionDemo1_2 {
    public static void main(String[] args) {
        A_ a = new A_();
        a.z(1, 0);//0번째 인덱스의 값이 0이다 (오류 발생)
    }
}
