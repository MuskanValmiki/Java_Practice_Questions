class Mobile{
    String brand;
    int price;
    String name;
    public void Show() {
        System.out.println("Mobile details:- "+name +" "+brand+" "+price);
    };

    public static void Show1(){
        System.out.println("I Love My Family...");//we can called static variable in static method but no static variable we can't use inside that static methods.
    };
};

public class Static_Methods {
    public static void main(String arg[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=2500;
        obj1.name="SmartPhone";
        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1500;
        obj2.name="SmartPhone";
        obj1.Show();
        obj2.Show();
        Mobile.Show1();//static method we can call direct name of method no need to create object.
        //we can use non static methods inside the static methods while passing obj and got output.
    };
};
