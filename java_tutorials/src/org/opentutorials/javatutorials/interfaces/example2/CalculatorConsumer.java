package org.opentutorials.javatutorials.interfaces.example2;

class CalculatorDummy implements Calculatable{
    public void setOprands(int first, int second, int third){
    }
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
    public static void main(String[] args) {
        CalculatorDummy c = new CalculatorDummy();//더미(인터페이스 상속하고 있다)
        c.setOprands(10, 20, 30);
        System.out.println(c.sum()+c.avg());
    }
}//인터페이스와 다른 것을 정하려고하면 컴파일 오류가 발생한다. 

//실제로 Calculator가 완성되면 나중에 CalculatorConsuer 에서 더미만 Calculator로 바꿔주면 된다. 
//단 퍼블릭이 아닌 인터페이스는 사용할 수가 없다. 