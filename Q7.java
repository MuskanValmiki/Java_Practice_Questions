import java.util.Scanner;

public class Q7 {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num for table :");
        int num=sc.nextInt();
        int i=1;
        while (i<=10){
            System.out.println(num+"X"+i+"="+num*i);
            i++;
        }
    }
}
