//final variable/final method/final class.

public class FinalKeyword {
    public static void main(String args[]){
        // int a=5;
        // final int b=10;
        // a=10;
        // b=20; it not happen because already it become constant.
        // System.out.println(a);
        // System.out.println(b);
        A aa=new A();
        aa.display();
    };
}

final class A{
    final void display(){
        System.out.println("Base class");
    }
}
class B{ 
    void display1(){
        System.out.println("Derived class");
    }
}