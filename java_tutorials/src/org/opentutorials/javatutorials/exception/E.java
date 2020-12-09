package org.opentutorials.javatutorials.exception;
import java.io.IOException;
class E{
    void throwArithmeticException(){//얘는 조상중에 runtimeexception이 있어서 예외처리 없이도 unchecked로 실행이 된다. 
        throw new ArithmeticException();
    }
    void throwIOException(){
       // throw new IOException();//얘는 exception이 발생했는데 ioe가 처리하고 있지 않아서 문제가 생긴다. 
    }//io예외만 문제가 생기는 이유는 ioe는 catch 나 throw를 해야하기 때문이다. (예외처리 안하면 컴파일 안됨)
}//io 의 조상에는 runtime이 없어서 checked이고 이는 바로 에외처리를 해야한다는 의미이다. 
/*해결방안
 void throwIOException1(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    void throwIOException2() throws IOException{
        throw new IOException();
    }
*/