package org.opentutorials.javatutorials.array;

public class GetDemo {
	public static void main(String []args) {
		String[] classGroup = { "최진혁", "최유빈", "한이람", "이고잉" };//정보를 그룹으로 만든것이 배열
        System.out.println(classGroup[0]);
        System.out.println(classGroup[1]);
        System.out.println(classGroup[2]);
        System.out.println(classGroup[3]);
        //[]안의 수가 인덱스를 나타낸다.(index 색인)
        //""안의 내용들이 원소다.(element)
        
        String[] classGroup2 = new String[4]; //메모리 할당(새로운 것 만들기 위해) 
        classGroup[0] = "최진혁";
        System.out.println(classGroup.length);
        classGroup[1] = "최유빈";
        System.out.println(classGroup.length);
        classGroup[2] = "한이람";
        System.out.println(classGroup.length);
        classGroup[3] = "이고잉";
        System.out.println(classGroup.length);
        //length는 안에 몇개 값이 들어있느냐가 아닌, 몇개까지 담을 수 있는지를 나타낸다.
       
        
 
	}

}
