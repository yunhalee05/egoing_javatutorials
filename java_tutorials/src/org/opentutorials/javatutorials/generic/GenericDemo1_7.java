package org.opentutorials.javatutorials.generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info;
        this.id = id;
    }
    public <U> void printInfo(U info){//메소드 안의 제네릭 타입
        System.out.println(info);
    }
}
public class GenericDemo1_7 {
    public static void main(String[] args) {
        EmployeeInfo e = new EmployeeInfo(1);
        Integer i = new Integer(10);
        Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(e, i);
        p1.<EmployeeInfo>printInfo(e);//명시적으로 표시
        p1.printInfo(e);//생략이 가능하다. 
    }
}
