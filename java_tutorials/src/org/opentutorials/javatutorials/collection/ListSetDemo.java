package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class ListSetDemo {
 
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();//배열 리스트는 중복된 값도 그대로 잘 출력된다.
        //여기서 ArrayList나 set모두 collection이라는 인터페이스를 가지기 때문에 인터페이스를 바꿔도 된다. 
        //Collection<String>al = new ArrayList<Strin>();공통적 API가지기 때문에 가능하다!
        //Collection<String>al = new Hashset<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }
         
        HashSet<String> hs = new HashSet<String>();//해시셋타입
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");//three를 한번 더!
        hs.add("five");
        Iterator hi = hs.iterator();//그래도 중복된 값은 저장되지 않을 것이다. (set의 특징)
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}