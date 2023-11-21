interface A{
    int age=12;//final and static
    String area="Mumbai";
    void show();
    void config();
};

interface X{
    void run();
};

interface Y extends X{

};

class B implements A,X{
    public void show(){
        System.out.println("in show");
    };

    public void config(){
        System.out.println("in config");
    };

    public void run(){
        System.out.println("in running");
    };
};

public  class Need_Interface {
    public static void main (String arg[]){
        A obj;
        obj=new B();
        obj.show();
        obj.config();
        X obj1=new B();
        obj1.run();
        System.out.println(A.area);
    };
};

//class-class->extends
//class-interface->implements
//interface-interface->extends