import java.util.Scanner;

public class Q34 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check prime or not :");
        int num=sc.nextInt();
        int fact=0;
        int i=1;
        while(i<=num){
            if(num%i==0){
                fact+=1;
            }
            i+=1;
        }
        if(fact==2){
            System.out.println("Its prime");
        }else{
            System.out.println("it is not prime");
        }
    }
}
