//In jvm there is one methods which is class loader so class load only once and constructer load two time that is the reason.
//if we did not create the class so constructor and static methods both will not called.
//if you want to called the methods so use class class it is in java with different methods.

class Mobile{
    String brand;
    int price;
    static String name;
    static{
        name="Phone";
        System.out.println("in static block...");
    };

    public Mobile(){
        brand="";
        price=250;
        System.out.println("in constructor...");
    };

    public void Show(){
        System.out.println("name : "+name+" brand : "+brand+" price : "+price);
    };
};

public class Static_Block {
    public static void main(String arrg[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
    };
};
