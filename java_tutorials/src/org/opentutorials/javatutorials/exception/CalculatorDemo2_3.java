package org.opentutorials.javatutorials.exception;

class _DivideException extends Exception {//checked exception
    _DivideException(){
        super();
    }
    _DivideException(String message){
        super(message);
    }
}
class ____Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){ 
        if(this.right == 0){
            try {//checked이기 때문에 받드시 예외처리를 해줘야 한다. 
                throw new _DivideException("0으로 나누는 것은 허용되지 않습니다.");
            } catch (_DivideException e) {
                e.printStackTrace();
            }
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo2_3 {
    public static void main(String[] args) {
        ____Calculator c1 = new ____Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}

/*
 
 혹은 아래에서 받을 수도 있다(예외처리)
   public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 0);
        try {
            c1.divide();
        } catch (DivideException e) {
            e.printStackTrace();
        }
 */

