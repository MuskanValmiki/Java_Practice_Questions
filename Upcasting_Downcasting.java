class A{
    public void show1(){
        System.out.println("in A show1");
    };
};

class B extends A{
    public void show2(){
        System.out.println("in B show2");
    };
};

public class Upcasting_Downcasting {
    public static void main(String arg[]){
        // double d=5.8;
        // int i=(int) d;//it gave error because we lose some data so we use casting here .
        // System.out.println(i);
        A obj=(A) new B();//upcasting
        obj.show1();
        B obj1=(B) obj;//downcasting
        obj1.show2();
        // System.out.println(obj);
    };
};
