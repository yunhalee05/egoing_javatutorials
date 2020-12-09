package org.opentutorials.javatutorials.exception;
//최종 사용자에게 넘길 수 도 있다. 
import java.io.*;
class B___{
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input);
    }
}
class C___{
    void run() throws IOException, FileNotFoundException{
        B___ b = new B___();
        b.run();
    }
}
public class ThrowExceptionDemo1_3 {
    public static void main(String[] args) {
         C___ c = new C___();
         try {
            c.run();
        } /*catch (FileNotFoundException e) {//여기서 filenotfoundexception은 ioexeption에 포함되므로 지워 줄 수도 있다. 
            System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
        } */catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
