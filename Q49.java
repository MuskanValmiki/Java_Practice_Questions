import java.util.Scanner;

public class Q49 {
    public static void main(String args[]){
        Q49 a=new Q49();
        a.display();
        a.input();
        a.output();
        Q49 b=new Q49(5,10);
        b.display();
        // b.input();
        b.output();
    }
    int a,b;
    Q49(int x,int y){
        a=x;
        b=y;
    }

    Q49(){
        a=0;
        b=0;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no: ");
        a=sc.nextInt();
        System.out.println("enter second no: ");
        b=sc.nextInt();
    }
    void display(){
        System.out.println("a="+a+"b="+b);
    }
    void output(){
        int c;
        c=a+b;
        System.out.println("Addition: "+c);
    }
}


