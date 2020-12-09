package org.opentutorials.javatutorials.exception;

class _Calculator{
    int left, right;
    public void setOprands(int left, int right){
    	if(right == 0){//1. 여기서 right가 0일때 예외처리 해준다. 
            throw new IllegalArgumentException("두번째 인자의 값은 0이 될 수 없습니다.");
        }
        this.left = left;
        this.right = right;
    }
    public void divide(){//2. 혹은 divide실행시 이 지점에서 체크해준다. sum이나 다른 계산일 수도 있어서 divide에 많이 하기는 한다. 
    	if(this.right == 0){
            throw new ArithmeticException("0으로 나누는 것은 허용되지 않습니다.");
        }
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());
            System.out.println("\n\ne.printStackTrace()");
            e.printStackTrace();
        }
    }
} 
public class CalculatorDemo2_1 {
    public static void main(String[] args) {
        _Calculator c1 = new _Calculator();
        c1.setOprands(10, 0);//부적합한 인지 사용- 예외 처리 필요!
        try {//3. 여기서 예외처리 해주기(1번에서 던진 말이 getMessage와 같다.  )
        	c1.divide();
        } catch(ArithmeticException e) {
        	System.out.println(e.getMessage());
        }
        c1.divide();
    }
}
