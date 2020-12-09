package org.opentutorials.javatutorials.generic;

class StudentInfo{
    public int grade;
    StudentInfo(int grade){ this.grade = grade; }
}
class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person{
    public Object info;//어떠한 타입의 인스턴스도 올 수 있다. 
    Person(Object info){ this.info = info; }
}
public class GenericDemo1_3 {
    public static void main(String[] args) {
        Person p1 = new Person("부장");
        EmployeeInfo ei = (EmployeeInfo)p1.info;//일반적 데이터 타입을 구체적으로 형변환 해줘야 한다.그러나 다행히 런타임 떄 에러가 발생한다. (입력 타입이 맞지 않는다) 
        System.out.println(ei.rank);
    }
}
//object로 전환해버려서 어떠한 타입의 데이터도 들어올 수 있게 되었는데 사실 그러면 안된다. (책임을 사용자에게 진 것이다)
//엄격한 입장을 취하는 자바는 제네릭을 사용해서 이러한 컴파일 오류를 잡아낸다. (타입의 안정성, 사용자 편의성 둘 다 잡기)
