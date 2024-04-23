import java.util.*;

public class Practice5 {
    public static void main(String args[]){
        result aa =new result();
        aa.getroll(101);
        aa.getmarks(30.5F,35.9F);
        aa.display();
    }
}

class student{
    int roll;
    void getroll(int n){
        roll=n;
    }
    void putroll(){
        System.out.println("roll="+roll);
    }
}

class test extends student{
    float mark1,marks2;
    void getmarks(float m1,float m2){
        mark1=m1;
        marks2=m2;
    }
    void putmarks(){
        System.out.println("Marks1="+mark1+"\nMarks2="+marks2);
    }
}

interface sports{
    float sportmarks=6.0F;
    void putsport();
}

class result extends test implements sports{
    float total;
    public void putsport(){
        System.out.println("sports marks="+sportmarks);
    }
    void display(){
        total=mark1+marks2+sportmarks;
        putroll();
        putmarks();
        putsport();
        System.out.println("Total marks="+total);
    }
}
    
//implemeting multiple inheritance in java with the help of interface.