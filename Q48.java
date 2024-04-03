public class Q48 {
    public static void main(String args[]){
        Student aa=new Student(120,"Mussu");
        Student bb=new Student(145,"Somi");
        aa.display();
        bb.display();
        // Student.change();
        // aa.display();
        // bb.display();
    }
}

class Student{
    int roll;
    String name;
    static String cname="R.P.P.Inter College";
    Student(int x,String y){
        roll=x;
        y=name;
    }
    void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(cname);
    }
    // static void change(){
    //     cname="xyz";
    // }
}