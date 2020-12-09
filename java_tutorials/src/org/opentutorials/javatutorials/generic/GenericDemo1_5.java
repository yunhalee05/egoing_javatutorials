package org.opentutorials.javatutorials.generic;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{//두개의 제네릭 사용
    public T info;
    public S id;
    Person(T info, S id){//복수의 제네릭은 중간에 컴마, 이름 다르게
        this.info = info; 
        this.id = id;
    }
}
public class GenericDemo1_5 {
    public static void main(String[] args) {
        Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(new EmployeeInfo(1), 1);
    }
    //기본데이터 타입을 객체인것 처럼 작용하도록 wrapper class를 사용한다. (객체로 포장하는클래스)
}
