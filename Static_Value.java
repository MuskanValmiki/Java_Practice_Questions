//Static variable are an obje so it is access by class not in obj .define static variable is like static String name; and you can access by class name which is here Mobile not object
//like obj1.name and obj2.name direct use this is Mobile.name and assign tha value of that variable.

class Mobile{
    String brand;
    int price;
    String name;//static String name;
    public void Show() {
        //its instead methods because I did not use any static keyword.
        System.out.println("Mobile details:- "+name +" "+brand+" "+price);
    };
};

public class Static_Value {
    public static void main(String arg[]){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=2500;
        obj1.name="SmartPhone";//Mobile.name="SmartPhone";
        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1500;
        obj2.name="SmartPhone";//Mobile.name="SmartPhone";
        obj1.Show();
        obj2.Show();
    };
};
