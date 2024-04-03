import java.util.Scanner;

public class Q50 {
    int a,b;
    Q50(int x,int y){
        a=x;
        b=y;
    }
    void output(){
        int c;
        c=a+b;
        System.out.println("Addition= "+c);
    }
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        m=sc.nextInt();
        System.out.println("Enter second number");
        n=sc.nextInt();
        Q50 aa=new Q50(m,n);
        aa.output();
    }
}
