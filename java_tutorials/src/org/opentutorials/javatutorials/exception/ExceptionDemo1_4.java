package org.opentutorials.javatutorials.exception;

class A___{
    private int[] arr = new int[3];
    A___(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {//예외처리에서만 사용된다. 
            System.out.println("finally");//안에 있는 내용이 예외든 아니든 언제나 finally 실행된다. 
        }
    }
}
 
public class ExceptionDemo1_4 {
    public static void main(String[] args) {
        A___ a = new A___();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}//finally는 데이터 베이스DB에 접속해서 정보 가져 올 때, 가져올수 있는 정보의 한계가 있다면, try안에 데이터 베이스 관련 정보가 들어간다. 
//데이터베이스가 너무 많을 경우에 정상적인 데이터도 접속이 안 될 수 있으므로, finally를 이용해서 끊어준다. (예외 발생과 상관없이 반드시 일어나야 한다면 finally안에 구현)