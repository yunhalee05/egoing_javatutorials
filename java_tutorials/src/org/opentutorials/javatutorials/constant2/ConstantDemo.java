package org.opentutorials.javatutorials.constant2;

/*
 1.
public class ConstantDemo {
    public static void main(String[] args) {
        임의로 지정해 놓았다. 하지만 이방법은 일일이 주석 설명을 해야한다. 
         * 1. 사과
         * 2. 복숭아
         * 3. 바나나
         
        int type = 1;//사과
        switch(type){//if대신
            case 1:
                System.out.println(57);
                break;
            case 2:
                System.out.println(34);
                break;
            case 3:
                System.out.println(93);
                break;
        }
    }
 
}
*/



 2. 
 public class ConstantDemo {
    private final static int APPLE = 1;//변수의 값이 한번 지정되면 바뀌지 않는다는 의미 final
    private final static int PEACH = 2;//주석이 없어도 알아볼 수 있다. 
    private final static int BANANA = 3;
    public static void main(String[] args) {
        int type = APPLE;
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

