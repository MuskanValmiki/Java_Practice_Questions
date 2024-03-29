import java.util.Scanner;

public class Q44 {
    // int a,b;//class variable
    // void getdata(){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter first number: ");
    //     a=sc.nextInt();
    //     System.out.println("Enter second number: ");
    //     b=sc.nextInt();
    // }
    // void processdata(){
    //     System.out.println("Addition= "+(a+b));
    // }
    public static void main(String args[]){
        Add aa=new Add();
        aa.getdata();
        aa.processdata();
    }
}

class Add{
    int a,b;//class variable
    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
    }
    void processdata(){
        System.out.println("Addition= "+(a+b));
    }
}