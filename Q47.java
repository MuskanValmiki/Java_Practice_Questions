public class Q47 {
    public static void main(String ags[]){
        Student s=new Student(115,"Muskan");
        s.display();
        Student m=new Student(101,"Somi");
        m.display();
    };
};


class Student{
    int roll;
    String name;
    static String cname="Christian PG College";
    Student(int x,String y){
        //parameter constructor
        roll=x;
        name=y;
    }
    void display(){
        System.out.println("Roll="+roll+" Name="+name+" College Name="+cname);
    }
}