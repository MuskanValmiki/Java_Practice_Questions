//Constructor is just like a methods.


class Human{
    private int age;
    private String name;

    public Human(){
        age=20;
        name="M";
    };

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

public class Constructor {
    public static void main(String arg[]){
        Human obj=new Human();
        Human obj1=new Human();
        System.out.println(obj.getAge()+" : "+obj.getName());
    };
};
