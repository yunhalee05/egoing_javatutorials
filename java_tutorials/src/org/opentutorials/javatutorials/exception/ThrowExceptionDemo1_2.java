package org.opentutorials.javatutorials.exception;

import java.io.*;
class B__{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);//ioexception, filenotfoundException모두 throw해서 try, catch 안해도 된다. 
    }
}
class C__{
    void run(){
        B__ b = new B__();
        //b.run();//여기서 오류나는 이유는 예외를 throw를 한다는 것은 run의 사용자에게 exception발생할 수 있다는 것을 강하게 알려주는것이다. 
        try {//위에서 throw해서 여기서 처리해준다. 
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
public class ThrowExceptionDemo1_2 {
    public static void main(String[] args) {
         C__ c = new C__();
         c.run();
    }   
}
