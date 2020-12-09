package org.opentutorials.javatutorials.generic;

class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>(); //info 가 string.
        Person<StringBuilder> p2 = new Person<StringBuilder>();//info가 stringbuilder
    }
 
}