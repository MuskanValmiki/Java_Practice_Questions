import java.util.Scanner;
public class Q33 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit to find product:");
        int n=sc.nextInt();
        int product=1;
        while(n>0){
            product=product*(n%10);
            n=n/10;
        }
        System.out.println("Product: "+product);
    }
}
