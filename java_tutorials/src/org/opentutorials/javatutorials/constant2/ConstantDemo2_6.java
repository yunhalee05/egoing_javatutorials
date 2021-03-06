package org.opentutorials.javatutorials.constant2;

enum Fruit{
    APPLE, PEACH, BANANA;
    Fruit(){
        System.out.println("Call Constructor "+this);//enum의 생성자가 private만 허용하기 떄문에 컴파일오류
    }
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}
 
public class ConstantDemo2_6 {
     
    public static void main(String[] args) {
     
        /*
        if(Fruit.APPLE == Company.APPLE){
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
        */
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
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
