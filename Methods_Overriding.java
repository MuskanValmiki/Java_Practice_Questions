
class A {
    public void show(){
        System.out.println("Hello Musu");
    };

    public void config(){
        System.out.println("in config");
    };
};

class B extends A{//inheritance we have done here
    public void show(){//here we over write the methods.
        System.out.println("Hello Akku");
    };
};

public class Methods_Overriding {
    public static void main(String arg[]){
        // A obj=new A();//calling class
        // obj.show();
        B obj1=new B();
        obj1.show();
        obj1.config();
    };
};
