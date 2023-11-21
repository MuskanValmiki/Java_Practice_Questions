import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age=age;
        this.name=name;
    };

    public String toString(){
        return "Student [age="+age+", name="+name+"]";
    };

    public int compareTo(Student that){
        if(this.age> that.age)
            return 1;
        else
            return -1;
        //TODO Auto-generated meethodds stub
        // return 0;
    };
};


public class Comparater_Comparable {
    public static void main(String arg[]){
        // Comparator<Student> com = new Comparator<Student>(){
        //     public int compare(Student i, Student j){
        //         if(i.age> j.age)
        //             return 1;
        //         else
        //             return -1;
        //     }
        // };
        Comparator<Student> com =(Student i,Student j)->i.age>j.age ? 1:-1;

        List<Student>studs=new ArrayList<>();
        studs.add(new Student(21,"Muskan"));
        studs.add(new Student(12,"AKKu"));
        studs.add(new Student(18,"Rahul"));
        studs.add(new Student(20,"Kajal"));

        Collections.sort(studs, com );
        System.out.println(studs);
    };
};
