import java.util.Scanner;
public class Q38 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter max value of fibonacci series: ");
        int num=sc.nextInt();
        int x=0;
        int y=1;
        int z=0;
        while(z<=num){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}
