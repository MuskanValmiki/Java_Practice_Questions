//dynamic method dispatch help I create polymorphism

class A{
    public void show(){
        System.out.println("in A show");
    };
};

class B extends A{
   public void show(){
    System.out.println("in B show");
   };
};

public class Polymorphism {
    public static void main(String arg[]){
        A obj=new A();
        obj.show();//dynamic method dispatch

        obj=new B();
        obj.show();
    };
};
