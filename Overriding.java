//method overriding

public class Overriding {
    public static void main(String args[]){
        B aa=new B();
        aa.message();    
    }
}
class A{
    void message(){
        System.out.println("Welcome to Box Class");
    }
}
class B extends A{
    void message(){
        System.out.println("Welcome to Derived Class");
    }
}

