class A{
    public A(){//constructor
        System.out.println("here create object.");
    };

    public void show(){//method
        System.out.println("In show");
    };
};

public class Anonyms_Obj {
    public static void main(String arg[]){
        // A obj=new A();//creating obj
        // obj.show();//showing value
        new A().show();//here we create obj only.its also anonyms obje because it does not have reference variable but we can't reuse it .
    };
};
