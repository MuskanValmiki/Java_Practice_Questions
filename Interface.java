// abstract class Computer{
//     public abstract void code();
// };

interface Computer{//instead of abstract we can use interface as well.
    void code();
};

class Laptop implements Computer{//instead of extract we use implements in interface
    public void code(){
        System.out.println("code,compile,run..");
    };
};

class Desktop implements Computer{
    public void code(){
        System.out.println("code compile run:Faster");
    };
};

class Developer{
    public void devApp(Computer lap){
        // System.out.println("coding..");
        lap.code();
    };
};

public class Interface{
    public static void main(String arg[]){
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer musu=new Developer();
        musu.devApp(lap);
        // Laptop lap=new Laptop();
        // Desktop desk=new Desktop();
        // Developer musu=new Developer();
        // musu.devApp(lap);
    };
};
