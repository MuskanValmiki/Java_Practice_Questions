abstract class A{
    public abstract void show();
    public abstract void config();
};

// class B extends A{
//     public void show(){
//         System.out.println("hlo");
//     };
// };

public class Abstract_AnonymousInner {
    public static void main(String arg[]){
        // A obj=new B();
        A obj=new A(){
            public void show(){
                System.out.println("in new show");
            };

            public void config(){
                System.out.println("in config");
            };
        };
        obj.show();
        obj.config();
    };
};
