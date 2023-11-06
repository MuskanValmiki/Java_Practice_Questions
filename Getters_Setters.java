//we can use private variable in same class but not ouside the class ,if you want to access so at that time .We can use methods like here getAge() and getName().
//when we are setting the value it called setters and when we get the value is called getters.
//click right click and choice source and then getters and setters generator and choice the variable it create automatic get and set methods .


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

public class Getters_Setters {
  public static void main(String arg[]){
    Human obj=new Human();
    // obj.age=21;
    // obj.name="mussu";
    obj.setAge(23);
    obj.setName("Muskan");
    System.out.println(obj.getAge()+" : "+obj.getName());
  };
};
