package org.opentutorials.javatutorials.constant2;
//과일과 기업을 비교할 수 없게하자!(정수대신 다른 방법으로 사용해야한다)
class Fruit{
    public static final Fruit APPLE  = new Fruit();//변수 apple에 fruit 데이터 타입(변수에 자기 자신을 인스턴스화)
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new COMPANY(Company);
}
 //switch는 제한된 데이터 타입만 사용할 수 있어서 새로 정의된 데이터타입으로 사용 불가. 
public class ConstatntDemo2_4 {
     
    public static void main(String[] args) {
        if(Fruit.APPLE == Company.APPLE){//과일과 기업을 비교하는데 사실 같을수 없다!(인터페이스는 같다고 나온다 =1로 되어있으니까)
            System.out.println("과일 애플과 회사 애플이 같다.");
        }
    }
}
