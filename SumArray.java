import java.util.Scanner;

public class SumArray {
    public static void main(String args[]){
        int a[]=new int[5];
        int sum=0;
        int product=1;
        for(int i=0;i<5;i++){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no=");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum+=a[i];
            product*=a[i];
        }
        System.out.println("Sum of array element="+sum);
        System.out.println("Product of array element="+product);
    }
}
