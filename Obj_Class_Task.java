//object class equal toString handcode

class A{
    String model;
    int price;

    public String toString(){
        // return "Hey Muskan";
        return model +" : "+ price;
    };

    public boolean equals(A that){
        return this.model.equals(that.model) && (this.price==that.price);
        // if(this.model.equals(that.model) && (this.price==that.price)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    };
};

public class Obj_Class_Task {
    public static void main(String arg[]){
        A obj=new A();
        obj.model="lenovo";
        obj.price=1000;

        A obj1=new A();
        obj1.model="lenovo";
        obj1.price=1000;
        // System.out.println(obj.toString());
        // System.out.println(obj);
        System.out.println(obj.equals(obj1));
    };
};
