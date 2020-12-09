package org.opentutorials.javatutorials.constant2;


enum Fruit{
   APPLE("red"), PEACH("pink"), BANANA("yellow");
   private String color;
   Fruit(String color){
       System.out.println("Call Constructor "+this);
       this.color = color;
   }
   String getColor(){
       return this.color;
   }
}

enum Company{
   GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2_8 {
    
   public static void main(String[] args) {
       for(Fruit f : Fruit.values()){
           System.out.println(f+", "+f.getColor());//열거는 포문을 사용해서 출력할 수도 있다. 
       }
   }
}