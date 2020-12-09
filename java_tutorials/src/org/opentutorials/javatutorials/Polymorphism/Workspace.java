package org.opentutorials.javatutorials.Polymorphism;

interface father{}
interface mother{}
interface programmer{
    public void coding();
}
interface believer{}
class Steve implements father, programmer, believer{
    public void coding(){
        System.out.println("fast");
    }
}
class Rachel implements mother, programmer{
    public void coding(){
        System.out.println("elegance");
    }
}
public class Workspace{
    public static void main(String[] args){
        programmer employee1 = new Steve();//coding할 수 있는 사람이라는 것을 알 수 있고, 프로그래머로 활동한 다는 것을 알 수 있다. 
        programmer employee2 = new Rachel();
         
        employee1.coding();//여러가지의 가능성 중에서 사용하는 programmer라는 것만 사용할 수 있다. 
        employee2.coding();//엄마 ,아빠, 프로그래...의 역할 중에서 programmer만 활용한다. 
    }
}