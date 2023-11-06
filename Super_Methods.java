//It called super class also like A and sub class B also without calling A methods.
//If we did not pass the value in B then it called default method B.
//If we passed the value so it gave int value execute.If we did not use super then also its there.
//if we want to run parameter then pass n value in super.

class A{
    public A(){
        super();
        System.out.println("In A");
    };

    public A(int n){
        super();
        System.out.println("In A int");
    };
};

class B extends A{
    public B(){
        super();
        System.out.println("In B");
    };

    public B(int n){
        // super();
        this();
        System.out.println("In B int");
    };
};

public class Super_Methods {
    public static void main(String arg[]){
        B obj=new B(6);
    };
};
