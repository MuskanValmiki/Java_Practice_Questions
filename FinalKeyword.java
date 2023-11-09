//final-variable,method,class

class Calc{
    public void show(){//here you can use final keyword amke it is unique public final void show().
        System.out.println("in Calc show");
    };

    public void add(int a, int b){
        System.out.println(a+b);
    };
};

class AdvCalc extends Calc{
    public void show(){
        System.out.println("by musssu");
    };
};

public class FinalKeyword {
    public static void main(String arg[]){
        // int num=7;//simple
        // final int num=15;
        // num=5;
        // System.out.println(num);
        AdvCalc obj=new AdvCalc();
        obj.show();
    };
};
