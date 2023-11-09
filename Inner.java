class A{ 
    //that we cannot made in static 
    int age;
    public void show(){
        System.out.println("in A show");
    };

    class B{//we can made it static inner class
        public void config(){
            System.out.println("in B config");
        };
    };
};


public class Inner {
    public static void main(String arg[]){
        A obj=new A();
        obj.show();
        
        A.B obj1= obj.new B();
        obj1.config();
    };
};
