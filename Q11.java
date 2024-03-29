import java.util.Scanner;

public class Q11 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter redius of circle:");
        double redius=sc.nextDouble();
        System.out.println(2*redius*Math.PI);
        System.out.println(redius*redius*Math.PI);
    }
}
