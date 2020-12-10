package org.opentutorials.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2];
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.//약속되지 않은 넘버
        for(int i=0; i<arrayObj.length; i++){//스트링은 length를 이용해서 가져온다. 
            System.out.println(arrayObj[i]);
        }
         
        ArrayList al = new ArrayList();//배열이 아닌 리스트다. 대신 하나 더 추가해도 오류 발생하지 않는다. 
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i));//list는 사이즈로 꺼내올 수 있다. 
            //얘는 출력할 떄 주의할 점이 있다. (어레이 리스트는 어떠한 데이터타입도 수용할 수 있는 타입(오브젝트형)--저장도 오브젝트타입으로 된다. 꺼낼때도 오브젝트로 !(특이 타입으로 저장하려고하면 형변환 해줘야 한다)
            String val = (String)al.get(i);//형변환 제약사항
            System.out.println(val);
        }    
            //이러한 불편을 해결하기위해서제네릭사용
            ArrayList<String> al = new ArrayList<String>();//이런식으로 특정해주면, 아래서 형변환 해주지 않아도 된다. 
            al.add("one");
            al.add("two");
            al.add("three");
            for(int i=0; i<al.size(); i++){
                String val = al.get(i);
                System.out.println(val);
            }
            
        
    }
 
}