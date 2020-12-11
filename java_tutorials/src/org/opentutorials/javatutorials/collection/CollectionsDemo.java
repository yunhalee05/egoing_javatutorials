package org.opentutorials.javatutorials.collection;

import java.util.*;

class Computer implements Comparable{//comparable 인터페이스를 가져야 비교 가능하다. (sorting)
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    public int compareTo(Object o) {//compareTo해줘야 한다. (인터페이스니까)
        return this.serial - ((Computer)o).serial;//a.compareTo(b) a가 더 크다면 양수, 아니면 음수
    }
    public String toString(){
        return serial+" "+owner;
    }
}
     

public class CollectionsDemo {
     
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();//arraylist에 담자. 
        computers.add(new Computer(500, "egoing"));
        computers.add(new Computer(200, "leezche"));
        computers.add(new Computer(3233, "graphittie"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){//순서대로 나왔을 것이다. 
            System.out.println(i.next());
        }
        Collections.sort(computers);//시리얼 값을 기준으로 정렬해보자. (리스트 데이터 타입)을 기준으로 정렬해준다. 
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
 
}