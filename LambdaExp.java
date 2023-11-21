interface A{
    void show(int i);
};

public class LambdaExp {
    public static void main(String arg[]){
        A obj = (i) -> System.out.println("in show "+i);
        obj.show(7);
    };
};
