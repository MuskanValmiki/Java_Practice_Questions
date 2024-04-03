//multi-level inheritance

import java.util.Scanner;

class A{
    int a;
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter number=");
        a=sc.nextInt();
    }
}
class B extends A{
    int b;
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number=");
        b=sc.nextInt();
    }
}
class C extends B{
    void add(){
        System.out.println("addition="+(a+b));
    }
}
public class Q52 {
    public static void main(String args[]){
        C aa=new C();
        aa.input();
        aa.getdata();
        aa.add();
    }
}
