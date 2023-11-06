//we can use private variable in same class but not ouside the class ,if you want to access so at that time .We can use methods like here getAge() and getName().

class Human{
    // private int age=21;
    // private String name="mussu";

    private int age;
    private String name;

    public int getAge(){
        return age;
    };

    public void setAge(int a){
        age=a;
    };

    public String getName(){
        return name;
    };

    public void setName(String n){
        name=n;
    };
};

public class Encapsulation {
  public static void main(String arg[]){
    Human obj=new Human();
    // obj.age=21;
    // obj.name="mussu";
    obj.setAge(23);
    obj.setName("Muskan");
    System.out.println(obj.getAge()+" : "+obj.getName());
  };
};
