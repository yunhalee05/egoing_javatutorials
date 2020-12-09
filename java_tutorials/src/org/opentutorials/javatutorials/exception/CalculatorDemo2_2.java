package org.opentutorials.javatutorials.exception;
//	복구가 가능한 예외는 checked로 간주한다. 
class DivideException extends RuntimeException {//unchecked exception을 상속받는다. 
    DivideException(){//생성자 
        super();
    }
    DivideException(String message){//부모 클래스의 생성자 (호출할때 메세지 출력)
        super(message);
    }
}
class __Calculator{
    int left, right;
    public void setOprands(int left, int right){        
        this.left = left;
        this.right = right;
    }
    public void divide(){
        if(this.right == 0){
            throw new DivideException("0으로 나누는 것은 허용되지 않습니다.");
        }
        System.out.print(this.left/this.right);
    }
}
public class CalculatorDemo2_2 {
    public static void main(String[] args) {
        __Calculator c1 = new __Calculator();
        c1.setOprands(10, 0);
        c1.divide();
    }
}