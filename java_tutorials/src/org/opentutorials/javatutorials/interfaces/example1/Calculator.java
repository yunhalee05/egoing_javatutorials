package org.opentutorials.javatutorials.interfaces.example1;

class Calculator {
    int left, right;
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
    public void sum() {
        System.out.println(this.left + this.right);
    }
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
//그런데 시간이 지나서 보니, 매개변수를 2개만 받는 오류가 있다. (원래 3개 받기로 했는데)
//이러한 오류를 방지하기 위해서 인터페이스가 생긴 것이다. 