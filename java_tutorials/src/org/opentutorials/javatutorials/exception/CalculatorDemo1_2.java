package org.opentutorials.javatutorials.exception;

class Calculator__{
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void divide(){
        try {
            System.out.print("계산결과는 ");
            System.out.print(this.left/this.right);
            System.out.print(" 입니다.");
        } catch(Exception e){//제대로 된 뒷수습
            System.out.println("\n\ne.getMessage()\n"+e.getMessage());
            System.out.println("\n\ne.toString()\n"+e.toString());//좀 더 자세한 정보.
            System.out.println("\n\ne.printStackTrace()");//오류난 곳을 찾는다. (오류내용과 함께)
            e.printStackTrace();
        }
       System.out.println("Divide End");//캐치가 끝나면 여기가 실행된다. 
    }
} 
public class CalculatorDemo1_2 {
    public static void main(String[] args) {
        Calculator__ c1 = new Calculator__();
        c1.setOprands(10, 0);
        c1.divide();
    }
}
