package org.opentutorials.javatutorials.collection;

import java.util.*;

public class MapDemo {
 
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();//hashmap은 키와 값 두가지 구성을 가지고 있다. 
        a.put("one", 1);//key값은 중복될 수 없지만 value는 중복될 수 있다. = map의 특성
        a.put("two", 2);//put메소드는 컬렉션에는 없고 맵에서만 사용할 수 있는 interface
        a.put("three", 3);
        a.put("four", 4);
        System.out.println(a.get("one"));//key를 호출하면 value가 출력될 것이다. (원하는 값 출력)
        System.out.println(a.get("two"));
        System.out.println(a.get("three"));
         
        iteratorUsingForEach(a);
        iteratorUsingIterator(a);
    }
     //맵 출력 1. 
    static void iteratorUsingForEach(HashMap map){//맵 자체에는 이터레이터 기능이 없어서 맵안에 있는 셋을 이용해서 맵 엔트리 값을 하나하나 셋에 넣어서 대응되는 값을 꺼낸다. 
        Set<Map.Entry<String, Integer>> entries = map.entrySet();//set타입의 entries안에 map 이 담긴다. 
        for (Map.Entry<String, Integer> entry : entries) {//set안에 들어있는 값을 하나하나 꺼내서 entry안에 넣는다. 
            System.out.println(entry.getKey() + " : " + entry.getValue());//순서대로 출력한다. 
           //여기서 getkey = string, getvalue = integer타입이다. 
        }
    }
    //맵 출력 2. 
    static void iteratorUsingIterator(HashMap map){
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> i = entries.iterator();//맵에 대응되는 셋 이터레이터 사용. 
        while(i.hasNext()){
            Map.Entry<String, Integer> entry = i.next();
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
    /*==
    Set<Map.Entry<String, Integer>> entries = map.entrySet();
    for (Map.Entry<String, Integer> entry : entries) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
    */
 
}
