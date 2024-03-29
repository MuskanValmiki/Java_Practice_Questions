import java.util.Scanner;

public class Q13 {
    public static void main(String arg[]){
        Scanner sc=new Scanner (System.in);
        double length=sc.nextDouble();
        double breath=sc.nextDouble();
        System.out.println(length*breath);
        System.out.println(2*(length+breath));
    }
}
