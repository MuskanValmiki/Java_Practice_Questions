abstract class Car{
    public abstract void drive();//abstract can take both methods abstract and simple also.

    public abstract void fly();//you need to define two methods inside the all methods which is abstract.

    public void playMusic(){
        System.out.println("play music");
    };
};

class WagonR extends Car{
    public void drive(){
        System.out.println("Driving..");
    };

    public void fly(){
        System.out.println("fly....");
    };
};

public class Abstract {
    public static void main(String arg[]){
        // Car obj=new Car();we cannot create obj of abstract class.
        Car obj=new WagonR();//we can take car reference not obj.
        obj.drive();
        obj.playMusic();
        obj.fly();
    };
};


//Abstract methods can only be defined in an abstract class.
//We need to add an abstract keyword before a class to make it an abstract class.
//Objects of an abstract class can not be created.
//If you are extending an abstract class, then it is compulsory to define all abstract methods.
//It is not necessary that an abstract class should have an abstract method.
//Abstract class can have an abstract or a normal method or both.
//An abstract class can have more than one abstract method.
//Concrete class: A class other than an abstract class is known as a concrete class.- An object of a concrete class can be created.
//Abstract method:-Instead of defining the method, we can declare the method.
//If we put a semicolon at the end of a method, it means that you only declare the method like:
//public void drive(); This method does not contain any features and you will not be able to create an object of it.
//You need to add an abstract keyword to only declare a method.
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.