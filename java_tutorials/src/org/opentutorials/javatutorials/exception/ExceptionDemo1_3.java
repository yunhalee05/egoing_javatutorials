package org.opentutorials.javatutorials.exception;

class A__{
    private int[] arr = new int[3];
    A__(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){//다중캐치를 이용해보자. 
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){//index없을 경우 호출 
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){//0으로 나누거나 계산이 안되는 값일 경우 호출
            System.out.println("ArithmeticException");
        } catch(Exception e){//그 외 예외처리
            System.out.println("Exception");//단 그 외 예외처리를 맨 위로 올라가면 모든 예외 처리 다 해버리기 때문에 다른 예외처리가 작동할 수 없을 것이다. (절대 실행될 수 없는 코드가 된다)
        }//좀더 자세히 보고 싶으면  e.printStackTrace();이용하면 된다. 
    }
}
 
public class ExceptionDemo1_3 {
    public static void main(String[] args) {
        A__ a = new A__();
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
    }
}