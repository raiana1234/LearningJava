package Inheritance;

class A{
    int x=100;
    void display(){
        System.out.println(x);
    }


}

class B extends A{
    int y=200;
    void display(){
        System.out.println(y);
    }


}

public class InheritanceType {

    public static void main (String[] args){
        B ref = new B();
        System.out.println(ref.x);
    }
}
