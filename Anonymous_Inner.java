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

public class Anonymous_Inner {
    public static void main(String arg[]){
        A obj=new A(){
            public void show(){
                System.out.println("in new show");
            };
        };
        obj.show();
    };
};