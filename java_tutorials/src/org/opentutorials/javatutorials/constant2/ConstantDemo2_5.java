package org.opentutorials.javatutorials.constant2;
//열거형:서로 연관된 상수들의 집합(바뀌지않는 값들=final)
//1. 코드 간결, 2. 인스턴스, 상속을 방지한다. 3.열거임을 분명히 표할 수 있다. 

enum Fruit{
    APPLE, PEACH, BANANA; //= public static final Fruit APPEL = new Fruit();
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo2_5 {
     
    public static void main(String[] args) {
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE://각각의 레이블로 보낸 것이 fruit인 것을 알아서 따로 안써줘도 된다. 
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
}