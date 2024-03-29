import java.util.Scanner;

public class Q15 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b value:" );
        int a=sc.nextInt();
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.print(b);
        // a,b=b,a
        // c=a,a=b, b=c
    }
}
