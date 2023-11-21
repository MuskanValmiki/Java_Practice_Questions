class A{
    public void shows(){
        System.out.println("in A show");
    };
};

class B extends A{
    public void show(){
        System.out.println("in B show");
    };
};

public class Annotation {
    public static void main(String arg[]){
        B obj=new B();
        obj.shows();
    };
};
