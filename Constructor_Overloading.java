class Human{
    private int age;
    private String name;

    // public Human(){//default constructor
    //     age=20;
    //     name="M";
    // };

    // public Human(int a,String n){//parametarize constructor
    //     age=a;
    //     name=n;
    // };

    
    public int getAge() {
        return age;
    };

    public void setAge(int age) {
        this.age=age;
    };

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };
};

public class Constructor_Overloading {
    public static void main(String arg[]){
        Human obj=new Human();
        // Human obj1=new Human(65,"Star");
        System.out.println(obj.getAge()+" : "+obj.getName());
        // System.out.println(obj1.getAge()+" : "+obj1.getName());
    };
};
