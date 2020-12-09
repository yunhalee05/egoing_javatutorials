package org.opentutorials.javatutorials.progenitor;
//clone은 protected object
class Student implements Cloneable{//cloneable 객체 지정(복제 가능한 인터페이스라는 것을 알려주는 것)
    String name;
    Student(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{//예외 checked 해야한다. 
        return super.clone();
    }
}
 
class ObjectDemo1 {
 
    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        try {//예외처리 사용자에게 위임
            Student s2 = (Student)s1.clone();//복제 가능한 객체라는 사실을 알려야 한다. //여기서 s1.clone의 리턴 값이object여서 형변환 해야한다. 
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
 
}
