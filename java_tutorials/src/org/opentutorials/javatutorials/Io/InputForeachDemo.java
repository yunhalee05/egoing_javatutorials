package org.opentutorials.javatutorials.Io;

public class InputForeachDemo {

	public static void main(String[] args){
        for(String e : args){
            System.out.println(e);
        }
      //터미널에서 tutorials제일 상위 프로그램으로 들어간 다음에
        //java -cp bin org.opentutorials.javatutorials.Io.InputForeachDemo one엔터
        //엔터 누르면 one 이 main의 args에 들어가게 되여 결과가 one이 나온다. (length) 
        
        //아니면 run configuration안에 들어가서 정해진 파일의 argument에 입력값을 입력해서 넣을 수도 있다. 
    }

}
