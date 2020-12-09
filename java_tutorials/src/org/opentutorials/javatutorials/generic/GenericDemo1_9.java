package org.opentutorials.javatutorials.generic;
//interface 로 info 사용
interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{//얘는 상속이 아닌 부모가 누군가 하는 의미이다. (<->super도 있다.부모제한. )
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo1_9 {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        Person<String> p2 = new Person<String>("부장");
    }
