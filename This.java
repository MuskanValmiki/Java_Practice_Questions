class Human {
    // private int age=21;
    // private String name="mussu";

    private int age;
    private String name;

    public int getAge() {
        return age;
    };

    public void setAge(int age) {
        // Human obj1=obj;
        // obj1.age = age;
        this.age=age;
    };

    public String getName() {
        return name;
    };

    public void setName(String name) {
        this.name = name;
    };
};

public class This {
    public static void main(String arg[]) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("Muskan");
        System.out.println(obj.getAge() + " : " + obj.getName());
    };
};
