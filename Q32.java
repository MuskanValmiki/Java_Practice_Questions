import java.util.Scanner;

public class Q32 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check wether is it palindrome or not :");
        int n=sc.nextInt();
        int m=n;
        int reverse=0;
        while(n>0){
            reverse=(reverse*10)+n%10;
            n=n/10;
        }
        if(reverse==m){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
