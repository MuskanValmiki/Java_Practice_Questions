import java.util.Scanner;

public class Q40 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x value or base x: ");
        int x=sc.nextInt();
        System.out.println("Enter y value or power: ");
        int y=sc.nextInt();
        int product=1;
        while(y>0){
            product=product*x;
            y=y-1;
        }    
        System.out.println("base x power y value : "+product);
    }
}
