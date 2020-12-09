package org.opentutorials.javatutorials.interfaces.example1;

class CalculatorDummy{//가짜 계산기 (가짜 클래스)-모조클래스 
    public void setOprands(int first, int second, int third){}//실제적 값{}안이 비어있다. 
    public int sum(){
        return 60;//계산이 아닌 그냥 값을 리턴 
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {//계산기 사용 로직 
    public static void main(String[] args){
        CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
    }
}//일정기간이 끝나서 알아서 로직을 완성해줄것이라고 믿고 로직을 완성한 것이다. 