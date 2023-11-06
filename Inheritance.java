//inheritance basically work like divide into small part or you can use proprties of parent class in child or other way we can say 
//base class properties use in drived class,super class properties we can use in subclass.
//we have done single and multilevel inheritance.Also I have done multiple inheritance here so I got to know multiple inheritance will
// not work in java reason why we face ambiguity it means he confuse which one choose.

class A{

};

class B extends A{

};

class C extends B{

};

public class Inheritance {
    public static void main(String arg[]){
        VeryAdvCal obj=new VeryAdvCal();
        int r1=obj.add(5,9);
        int r2=obj.sub(9,2);
        int r3=obj.multi(5,3);
        int r4=obj.divide(12,4);
        double r5=obj.power(2, 3);
        // Calc obj=new Calc();
        // int r1=obj.add(5,9);
        // int r2=obj.sub(9,2);
        // AdvCalc obj1=new AdvCalc();
        // int r3=obj1.multi(5,3);
        // int r4=obj1.divide(12,2);
        System.out.println(r1+"  "+r2+"  "+r3+"  "+r4+"  "+r5);
    };
};
