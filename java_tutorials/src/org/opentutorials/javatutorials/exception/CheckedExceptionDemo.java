package org.opentutorials.javatutorials.exception;

import java.io.*;//파일 불러오는 패키지  
public class CheckedExceptionDemo {
    public static void main(String[] args) {
    	BufferedReader bReader = null;
        String input = null;
    	 try {
    		  bReader = new BufferedReader(new FileReader("out.txt"));//객체의 생성자에게 전달해서 새로운 객체 생성
    	 }catch (FileNotFoundException e) {//열려는 파일이 없는 경우에 예외처리를 해줘야 한다. 
             e.printStackTrace();
        }
    	 try{
              input = bReader.readLine();//메소드호출(초기화가 안될 수 있다는 내용(위에서 예외처리 하면))->위에서 null로 지정해주자. 
         } catch (IOException e){
             e.printStackTrace();
         }       
        System.out.println(input); //인풋변수에 내용 담길 것이다. 그것을 출력
    }
}
