package org.opentutorials.javatutorials.progenitor;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {//equals를 재정의 함으로서 오버라이딩할 수 있다, object타입의 obj에 student넣는데 부모는 자식에 할당될 수 있다. (다형성)
        Student _obj = (Student)obj;//object타입은 name에 접근할 수 없다 (부모처럼 행세하니까=다형성)->다시 student타입으로 전환하자. 
        //데이터 타입 바꿀 때는 ()를 이용하자!(자식이 부모행세를 할 순 있지만, 부모가 자식인 척은 할 수 없다. (억지로 형변환을 이용해 바꿔야한다!)
        return name == _obj.name;//this.name==s.name;같은 의미다. 
    }//사실equals를 구현하려면 hashcode()도 함께 구현해야한다. 
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
 
    }
 
}