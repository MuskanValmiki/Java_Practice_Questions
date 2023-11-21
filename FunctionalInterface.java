// @FunctionalInterface

interface A{
    void show();
    // void run();
};

// class B implements A{
//     public void show(){
//         System.out.println("in show");
//     };
// };

public class FunctionalInterface {
    public static void main(String arg[]){
        A obj=new A(){
            public void show(){
                System.out.println("in A show");
            };
        };
        obj.show();
    };
};
