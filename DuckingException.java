class MuskanException extends RuntimeException{
    public MuskanException(String string){
        super(string);
    };
};

class A{
    public void show(){
        try{
            Class.forName("Demo");
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find the class "+e);
        };
    };
};

public class DuckingException {
    static{
        System.out.println("Class Loaded");
    };

    public static void main(String arg[]){
        A obj=new A();
        obj.show();
    };
};
