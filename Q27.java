import java.util.Scanner;
public class Q27 {
    public static void main(String args[]){
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how much number sum you want : ");
        int n=sc.nextInt();
        int sum=0;
        while(i<=n){
            // System.out.println(i);
            sum+=i;
            i++;
        }
        System.out.println("Sum: "+sum);
    }
}
