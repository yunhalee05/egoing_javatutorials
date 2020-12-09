package org.opentutorials.javatutorials.generic;
//Extend
abstract class Info{
    public abstract int getLevel();
}
class EmployeeInfo extends Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{//T는 info 이거나 아니면 자식만 들어올 수 있다. 
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo1_8 {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        Person<String> p2 = new Person<String>("부장");//string은 info 의 자식이 아니라서 컴파일 에러가 발생한다. 
    }
}
