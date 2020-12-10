package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class SetDemo {
 
    public static void main(String[] args) {//각집합의 각각의 값이 중복되어서는 안된다. (set의 특징)
        HashSet<Integer> A = new HashSet<Integer>();
        A.add(1);
        A.add(2);
        A.add(3);
         
        HashSet<Integer> B = new HashSet<Integer>();
        B.add(3);
        B.add(4);
        B.add(5);
         
        HashSet<Integer> C = new HashSet<Integer>();
        C.add(1);
        C.add(2);
         //부분집합 인가에 대한 답
        System.out.println(A.containsAll(B)); // false
        System.out.println(A.containsAll(C)); // true
         
        //A.addAll(B);//전부 다 나온다. 12345(중복은 안된다) 합집합
        //A.retainAll(B);//a와 b에 둘다 있는 값인 3이 나온다. 교집합
        //A.removeAll(B);a에 있으면서 b에는 없는 값인 12만 나온다. 차집합
         
        Iterator hi = A.iterator();//이터레이터 API는 (인터페이스 )-3개의 메소드를 가진다. (hashnext,next) 
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
    }
 
}
