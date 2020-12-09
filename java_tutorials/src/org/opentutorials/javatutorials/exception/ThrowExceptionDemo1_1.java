package org.opentutorials.javatutorials.exception;

import java.io.*;
class B_{
    void run(){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
}
class C_{
    void run(){
        B_ b = new B_();
        b.run();//얘가 b의 사용자이기 때문에 b에서 처리하지 않고 예외 throw할 수 있다. 
    }
}
public class ThrowExceptionDemo1_1 {
    public static void main(String[] args) {
         C_ c = new C_();
         c.run();
    }   
}
