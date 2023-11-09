class Laptop{
    public void code(){
        System.out.println("code,compile,run..");
    };
};

class Developer{
    public void devApp(Laptop lap){
        // System.out.println("coding..");
        lap.code();
    };
};

public class Interface{
    public static void main(String arg[]){
        Laptop lap=new Laptop();
        Developer musu=new Developer();
        musu.devApp(lap);
    };
};
